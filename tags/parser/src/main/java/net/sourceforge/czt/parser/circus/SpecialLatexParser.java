/*
 * SpecialLatexParser.java
 *
 * Created on 15 March 2006, 10:45
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package net.sourceforge.czt.parser.circus;

import java.io.*;
import java.text.MessageFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.logging.ConsoleHandler;
import java.util.logging.Formatter;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

import net.sourceforge.czt.java_cup.runtime.Scanner;
import net.sourceforge.czt.java_cup.runtime.Symbol;

import net.sourceforge.czt.base.ast.Term;
import net.sourceforge.czt.base.util.AstValidator;
import net.sourceforge.czt.base.util.XmlWriter;
import net.sourceforge.czt.parser.util.LatexMarkupFunction;
import net.sourceforge.czt.parser.util.OpTable;
import net.sourceforge.czt.parser.util.ParseException;
import net.sourceforge.czt.session.Command;
import net.sourceforge.czt.session.Key;
import net.sourceforge.czt.session.Source;
import net.sourceforge.czt.session.FileSource;
import net.sourceforge.czt.session.SectionInfo;
import net.sourceforge.czt.session.SectionManager;
import net.sourceforge.czt.util.CztException;
import net.sourceforge.czt.util.CztLogger;

import net.sourceforge.czt.circus.jaxb.JaxbValidator;
import net.sourceforge.czt.circus.jaxb.JaxbXmlWriter;

import net.sourceforge.czt.z.ast.*;
import net.sourceforge.czt.z.impl.ZFactoryImpl;

import net.sourceforge.czt.circus.ast.*;

import net.sourceforge.czt.print.circus.PrintUtils;

/**
 * A parser for LaTeX mark-up.  This is a convenience class that
 * composes the {@link LatexScanner} and the {@link Parser}.
 *
 * @see net.sourceforge.czt.parser.z
 */
public class SpecialLatexParser {
    ZFactory factory_ = new ZFactoryImpl();
    LatexScanner scanner_;
    Parser parser_;
    static Logger logger;
    static SectionManager sm;
    
    static {
        boolean SHOW_TIMESTAMP = true;
        boolean SHOW_RECORDED_MESSAGE = true;
        boolean SHOW_SOURCE_METHOD = false;
        boolean SHOW_DIRECTORY = false;
        boolean SHOW_STACK_TRACE = true;
        SimpleFormatterForCircus sfc = new SimpleFormatterForCircus(
                SHOW_TIMESTAMP, SHOW_RECORDED_MESSAGE,
                SHOW_SOURCE_METHOD, SHOW_DIRECTORY, SHOW_STACK_TRACE);
        ConsoleHandler ch = new ConsoleHandler();
        ch.setLevel(Level.ALL);
        ch.setFormatter(sfc);
        
      /*
      logger = CztLogger.getLogger(KeywordScanner.class);
      logger.addHandler(ch);
      logger.setLevel(Level.ALL);*/
       
      logger = CztLogger.getLogger(Latex2Unicode.class);
      logger.addHandler(ch);
      logger.setLevel(Level.ALL);
       
      logger = CztLogger.getLogger(LatexMarkupParser.class);
      logger.addHandler(ch);
      logger.setLevel(Level.ALL);
       
      logger = CztLogger.getLogger(LatexParser.class);
      logger.addHandler(ch);
      logger.setLevel(Level.ALL);
      
      logger = CztLogger.getLogger(Parser.class);
      logger.addHandler(ch);
      logger.setLevel(Level.ALL);
      
      logger = CztLogger.getLogger(net.sourceforge.czt.print.circus.Unicode2Latex.class);
      logger.addHandler(ch);
      logger.setLevel(Level.ALL);

      logger = CztLogger.getLogger(UnicodeParser.class);
      logger.addHandler(ch);
      logger.setLevel(Level.ALL);
      
      sm = new SectionManager();
      sm.setProperty("czt.path", "C:\\research\\tools\\java\\sourceforge\\czt\\0.5.1\\parser\\src\\main\\resources\\lib");
    }
    
    public SpecialLatexParser(Source s, SectionInfo sectInfo, Properties properties) 
        throws IOException {
        scanner_ = new LatexScanner(s, sectInfo, properties);
        parser_ = new Parser(scanner_, s, sectInfo);
    }    
    
    public Term parse()
    throws ParseException {
        try {
            final Symbol parseTree = parser_.parse();
            final Term term = (Term) parseTree.value;
            return term;
        } catch (ParseException e) {
            throw e;
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e) {
            e.printStackTrace();
            throw new CztException("This should never happen", e);
        }
    }

    /**
     * Parses a file using the latex parser.
     *
     * @throws FileNotFoundException if the given filename cannot be found.
     * @throws ParseException if the given file cannot be parsed.
     * @deprecated     Replaced by {@link #parse(Source, SectionInfo)}
     */
    public static Term parseLatexFile(String filename,
            SectionInfo sectInfo)
            throws ParseException, FileNotFoundException, IOException {
        logger.fine("Parse LaTex file " + filename);
        Reader in = new InputStreamReader(new FileInputStream(filename));
        SpecialLatexParser parser = new SpecialLatexParser(new FileSource(filename),//in,
                //filename,
                sectInfo,
                new Properties());
        return parser.parse();
    }
    
    private static final String PRINT_LATEX_EXT = ".print.tex";
    private static final String PRINT_UNICODE_EXT = ".print.utf8";
    
    public static void printLatex(Term term, String filename, SectionInfo sectInfo) 
      throws IOException {
        logger.fine("Print term to LaTex file " + filename + PRINT_LATEX_EXT);
        FileWriter writer = new FileWriter( filename + PRINT_LATEX_EXT );        
        PrintUtils.printLatex(term, writer, sectInfo);
    }
    
    public static void printUnicode(Term term, String filename, SectionInfo sectInfo)  
      throws IOException {
        logger.fine("Print term to Unicode file " + filename + PRINT_UNICODE_EXT);
        FileWriter writer = new FileWriter( filename + PRINT_UNICODE_EXT );        
        PrintUtils.printUnicode(term, writer, sectInfo);
    }
    
    /**
     * Converts latex to zml.
     */
    public static void main(String[] args) {
        String usage = "Usage: net.sourceforge.czt.parser.circus.SpecialLatexParser"
                + " [ -in <texInputfile>] [ -printLatex] [ -printUnicode] [ -reparseLatex]";
        long time = System.currentTimeMillis();       
        try {
            String filename = null;
            boolean reparseLatex = false;
            boolean printLatex = false;
            boolean printUnicode = false;
            for (int i = 0; i < args.length; i++) {
                if ("-in".equals(args[i])) {
                    if (i < args.length) {
                        filename = args[++i];                        
                    } else {
                        System.err.println(usage);
                        return;
                    }
                } else  if ("-printLatex".equals(args[i])) {
                   printLatex = true;
                } else  if ("-printUnicode".equals(args[i])) {
                   printUnicode = true;
                } else  if ("-reparseLatex".equals(args[i])) {
                   reparseLatex = true;
                } else {
                    System.err.println(usage);
                    return;
                }
            }
            if (filename == null) {
              System.out.println("----USAGE-ERROR----");
              System.err.println("No file name given");
              System.err.println(usage);
              return;
            }
            System.out.println("----STARTING LATEX PARSING----");
            time = System.currentTimeMillis();
            Term term = parseLatexFile(filename, sm);
            time = System.currentTimeMillis() - time;            
            if (term != null) {               
               System.out.println("----FINISHED LATEX PARSING----(" +  time + "msecs)");
              /*
                for(Sect sect : ((Spec)term).getSect()) {
                    if (sect instanceof ZSect) {
                        ZSect zs = (ZSect)sect;  
                        for(Para pa: ((ZParaList)zs.getParaList())) {                     
                            if (pa instanceof ProcessPara) {
                                System.out.print("Annotations for process " + ((ProcessPara)pa).getProcessName() + " in section " + zs.getName());
                                if (((ProcessPara)pa).getCircusProcess() != null)
                                    System.out.println(": " + ((ProcessPara)pa).getCircusProcess().getAnns().toString());
                                else
                                    System.out.println(": none (null process definition)");
                            }                                                                
                        }
                    }                                
                }
               **/
                try {
                  if (printLatex) {                    
                    System.out.println("----STARTING LATEX PRINTING----");
                    time = System.currentTimeMillis();
                    printLatex(term, filename, sm);
                    time = System.currentTimeMillis() - time;
                    System.out.println("----FINISHED LATEX PRINTING----(" +  time + "msecs)");                    
                    if (reparseLatex) {
                        System.out.println("----STARTING LATEX REPARSING----");
                        time = System.currentTimeMillis();
                        Term reparse = parseLatexFile(filename + PRINT_LATEX_EXT, sm);                        
                        time = System.currentTimeMillis() - time;
                        if (reparse != null) {                          
                          boolean equalTerms = reparse.equals(term);
                          time = System.currentTimeMillis() - time;
                          System.out.println("Original and old terms are not Object.equals().");
                          System.out.println("----FINISHED LATEX REPARSING----(" +  time + "msecs)");   
                        }
                        else {                        
                          System.err.println("---REPARSING-ERROR---(" +  time + "msecs)");
                          System.err.println("Could not reparse the LaTex printted specification.");
                        }
                    }
                    reparseLatex = false;
                  }
                  if (printUnicode) {
                    System.out.println("----STARTING UNICODE PRINTING----");
                    time = System.currentTimeMillis();
                    printUnicode(term, filename, sm);
                    time = System.currentTimeMillis() - time;
                    System.out.println("----FINISHED UNICODE PRINTING----(" +  time + "msecs)");
                  }
                } catch(CztException f) {                  
                  System.err.println("---PRINTER-ERROR---(" +  time + "msecs)");
                  System.err.println("Could not print term " + term + " that was successfully parsed from " + filename);
                  System.err.println(f.getMessage());
                  f.printStackTrace();
                }
                if (reparseLatex) {
                  System.err.println("---REPARSING-ERROR---");
                  System.err.println("To reparse a printed LaTeX spec, one must choose the -printLatex option!");
                }
            } else {
                System.err.println("---PARSER-ERROR---(" +  time + "msecs)");
                System.err.println("Parse error");
            }
        } catch (Exception e) {
            System.err.println("---UNEXPECTED-ERROR---(" +  time + "msecs)");
            e.printStackTrace();
        }
    }
    
    public static class SimpleFormatterForCircus extends Formatter {
        
        Date dat = new Date();
        private final static String format = "{0,date} {0,time}";
        private MessageFormat formatter;
        
        private Object args[] = new Object[1];
        
        private boolean fShowTimeStamp = true;
        private boolean fShowRecordedMessage = true;
        private boolean fShowSourceMethod = true;
        private boolean fShowDirectory = true;
        private boolean fShowStackTrace = true;
        
        // Line separator string.  This is the value of the line.separator
        // property at the moment that the SimpleFormatter was created.
        private String lineSeparator = (String) java.security.AccessController.doPrivileged(
                new sun.security.action.GetPropertyAction("line.separator"));
        
        public SimpleFormatterForCircus(boolean showTimeStamp, boolean showRecordedMessage,
                boolean showSourceMethod, boolean showDirectory, boolean showStackTrace) {
            fShowTimeStamp = showTimeStamp;
            fShowRecordedMessage = showRecordedMessage;
            fShowSourceMethod = showSourceMethod;
            fShowDirectory = showDirectory;
            fShowStackTrace = showStackTrace;
        }
        
        /**
         * Format the given LogRecord.
         * @param record the log record to be formatted.
         * @return a formatted log record
         */
        public synchronized String format(LogRecord record) {
            StringBuffer sb = new StringBuffer();
            if (fShowTimeStamp) {
                // Minimize memory allocations here.
                dat.setTime(record.getMillis());
                args[0] = dat;
                StringBuffer text = new StringBuffer();
                if (formatter == null) {
                    formatter = new MessageFormat(format);
                }
                formatter.format(args, text, null);
                sb.append(text);
                sb.append(" ");
            }
            if (fShowSourceMethod) {
                if (record.getSourceClassName() != null) {
                    sb.append(record.getSourceClassName());
                } else {
                    sb.append(record.getLoggerName());
                }
                if (record.getSourceMethodName() != null) {
                    sb.append(" ");
                    sb.append(record.getSourceMethodName());
                }
                sb.append(lineSeparator);
            }
            if (fShowRecordedMessage) {
                String message = formatMessage(record);
                sb.append(record.getLevel().getLocalizedName());
                sb.append(": ");
                sb.append(message);
                sb.append(lineSeparator);
            }
            if (fShowStackTrace) {
                if (record.getThrown() != null) {
                    try {
                        StringWriter sw = new StringWriter();
                        PrintWriter pw = new PrintWriter(sw);
                        record.getThrown().printStackTrace(pw);
                        pw.close();
                        sb.append(sw.toString());
                    } catch (Exception ex) {
                    }
                }
            }
            return sb.toString();
        }
    }
}

