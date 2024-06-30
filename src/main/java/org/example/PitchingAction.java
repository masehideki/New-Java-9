package org.example;

public class PitchingAction implements Pitcher{

  public String catching(String name) {
    return name + "投手は捕球した";
  }

  public String throwing(String name){
    return name + "投手は送球した";
  }

  public String pitching(String name){
    return name + "投手はバッターに向かって投げた";
  }
}
