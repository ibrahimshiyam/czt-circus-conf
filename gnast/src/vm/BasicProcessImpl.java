
  public net.sourceforge.czt.z.ast.ZParaList getZParaList()
  {
    net.sourceforge.czt.z.ast.ParaList pl = getParaList();
    if (pl instanceof net.sourceforge.czt.z.ast.ZParaList) {
      return (net.sourceforge.czt.z.ast.ZParaList) pl;
    }
    throw new net.sourceforge.czt.base.util.UnsupportedAstClassException();
  }
  
  // TODO: MAKE THIS MORE EFFICIENT?
  public net.sourceforge.czt.z.ast.Para getStatePara()
  {
    List<net.sourceforge.czt.z.ast.Para> result = new ArrayList<net.sourceforge.czt.z.ast.Para>();
    for(net.sourceforge.czt.z.ast.Para para : getZParaList())
    {
      if (net.sourceforge.czt.circus.util.CircusUtils.isStatePara(para))
      {
        result.add(para);
      }
    }
    // if 0 = invalid; if >1 duplicated.
    if (result.size() != 1)
      throw new net.sourceforge.czt.base.util.UnsupportedAstClassException("Invalid state paragraph for basic process.");
    
    net.sourceforge.czt.z.ast.Para r = result.get(0);
    
    assert result.size() == 1 && 
           net.sourceforge.czt.circus.util.CircusUtils.isStatePara(r);
    
    // DESIGN: Parser now make both versions a horizontal box. This makes the type checker life easier and more uniform
    // state  is actionPara ==> OnTheFlyAction    
    // assert (!(r instanceof net.sourceforge.czt.circus.ast.ActionPara) || 
    //        net.sourceforge.czt.circus.util.CircusUtils.isOnTheFly(r)
    //       );
    return r;
  }
  
  public net.sourceforge.czt.circus.ast.CircusAction getMainAction()
  {  
    List<net.sourceforge.czt.circus.ast.ActionPara> result = new ArrayList<net.sourceforge.czt.circus.ast.ActionPara>();
    for(net.sourceforge.czt.z.ast.Para para : getOnTheFlyPara())
    {
      assert net.sourceforge.czt.circus.util.CircusUtils.isOnTheFly(para);
      net.sourceforge.czt.circus.ast.ActionPara ap = (net.sourceforge.czt.circus.ast.ActionPara)para;      
      if (ap.getZName().getWord().startsWith(net.sourceforge.czt.circus.util.CircusUtils.DEFAULT_MAIN_ACTION_NAME))
      {
        result.add(ap);
      }      
    }
    
    // if 0 = invalid; if >1 duplicated.
    if (result.size() != 1)
      throw new net.sourceforge.czt.base.util.UnsupportedAstClassException("Invalid main action for basic process.");
    
    assert result.size() == 1 && 
           net.sourceforge.czt.circus.util.CircusUtils.isOnTheFly(result.get(0)) &&
           result.get(0).getZName().getWord().startsWith(net.sourceforge.czt.circus.util.CircusUtils.DEFAULT_MAIN_ACTION_NAME);
    return result.get(0).getCircusAction();
  }

  public java.util.List<? extends net.sourceforge.czt.z.ast.Para> getLocalPara()
  {
    net.sourceforge.czt.z.ast.ZParaList result = net.sourceforge.czt.z.util.ZUtils.FACTORY.createZParaList();    
    result.addAll(getZParaList());
    
    java.util.List<net.sourceforge.czt.z.ast.Para> onTheFly = getOnTheFlyPara();
    result.removeAll(onTheFly);
    
    assert (result.size() == getZParaList().size() - onTheFly.size());    
    return java.util.Collections.unmodifiableList(result);
  }  
  
  public java.util.List<net.sourceforge.czt.z.ast.Para> getOnTheFlyPara()
  {
    java.util.List<net.sourceforge.czt.z.ast.Para> result = 
      new java.util.ArrayList<net.sourceforge.czt.z.ast.Para>();
    for(net.sourceforge.czt.z.ast.Para para : getZParaList())
    {
      if (net.sourceforge.czt.circus.util.CircusUtils.isOnTheFly(para))
      {
        result.add(para);
      }      
    }
    return java.util.Collections.unmodifiableList(result);
  }  

  public net.sourceforge.czt.z.ast.Name getStateParaName()
  {
    return net.sourceforge.czt.circus.util.CircusUtils.getSchemaName(getStatePara());
  }

  public net.sourceforge.czt.z.ast.ZName getStateParaZName()
  {
    return net.sourceforge.czt.z.util.ZUtils.assertZName(getStateParaName());
  }
