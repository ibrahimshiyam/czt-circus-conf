package net.sourceforge.czt.modeljunit;

import java.io.*;
import java.util.Random;
import java.util.List;
import net.sourceforge.czt.modeljunit.coverage.ActionCoverage;
import net.sourceforge.czt.modeljunit.coverage.CoverageHistory;
import net.sourceforge.czt.modeljunit.coverage.CoverageMetric;
import net.sourceforge.czt.modeljunit.coverage.StateCoverage;
import net.sourceforge.czt.modeljunit.coverage.TransitionCoverage;
import net.sourceforge.czt.modeljunit.coverage.TransitionPairCoverage;

/**
* This class runs several random and greedyRandom walks
* and outputs them to a text file
*/
public class ResultExtractor 
{
	public static void main(String[] args) 
	{
		ResultExtractor r = new ResultExtractor();
		r.run();
	}

	int passes;
	int currentPass;
	CoverageHistory metric;
	String historyRandom;
	String historyGreedy;
	Random rand;
	
	public ResultExtractor()
	{
		passes = 3;
		currentPass = 0;
		rand = new Random();
	}
	
	public ResultExtractor(int p)
	{
		passes = p;
		currentPass = 0;
		rand = new Random();
	}
	
        protected String generateResults(int seed, Tester tester)
        {
                metric = new CoverageHistory(new TransitionCoverage(), 1);
                tester.addCoverageMetric(metric);
                tester.setRandom(new Random(seed));
                tester.generate(100);
                return metric.toCSV();
        }
        
	public void run() {
		while (currentPass != passes)
		{
			int seed = rand.nextInt();
                        Model model = new Model(new QuiDonc());
                        
                        Tester rtester = new RandomTester(model);
			historyRandom = generateResults(seed, rtester);
                        
                        Tester gtester = new RandomTester(model);
                        historyGreedy = generateResults(seed, gtester);
			
			this.write(seed);
			currentPass++;
		}
	}
	
	public void write(int seed) {
		try
		{
			File f = new File("pass " + currentPass + " output.txt");
			PrintWriter w = new PrintWriter(new FileOutputStream(f));
			
			System.out.println("Writing to " + f.getAbsolutePath());
			w.println("Results for seed: " + seed);
			w.println("");
			w.println("Random History");
			w.println(historyRandom);
			w.println("");
			w.println("Greedy History");
			w.println(historyGreedy);
			w.close();
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
	}
}