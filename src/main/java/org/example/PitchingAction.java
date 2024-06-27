package org.example;

public class PitchingAction implements Pitcher{

  public String Catching(String name) {
    return name + "投手は捕球した";
  }

  public String Throwing(String name){
    return name + "投手は送球した";
  }

  public String Pitching(String name){
    return name + "投手はバッターに向かって投げた";
  }
}
