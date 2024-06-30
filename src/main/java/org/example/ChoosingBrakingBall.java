package org.example;

import java.util.Random;

public class ChoosingBrakingBall extends PitchingAction{
  
  public String choosing(String pitchType) {
    Random rnd = new Random();
    int speed = rnd.nextInt(50) + 100;
    return pitchType + " 球速:" + speed + "km/h";
  }

}
