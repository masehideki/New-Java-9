package org.example;

public class BatterAction implements Batter{

  public String Batting(String name){
    return name + "選手はスイングした";
  }

  public String Running(String name){
    return name + "選手は走った";
  }

  public String Catching(String name){
    return name + "選手は捕球した";
  }

  public String Throwing(String name){
    return name + "選手は送球した";
  }

}
