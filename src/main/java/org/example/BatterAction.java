package org.example;

public class BatterAction implements Batter{

  public String batting(String name){
    return name + "選手はスイングした";
  }

  public String running(String name){
    return name + "選手は走った";
  }

  public String catching(String name){
    return name + "選手は捕球した";
  }

  public String throwing(String name){
    return name + "選手は送球した";
  }

}
