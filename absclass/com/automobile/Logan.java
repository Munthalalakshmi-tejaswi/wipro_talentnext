package com.automobile;
import com.automobile.Vehicle;
class Logan extends Vehicle {
  public String getModelName() {
	  return "Logan";
  }
  public String getRegistrationNumber() {
	  return "AR095494";
  }
  public String getOwnerName() {
	  return "Teju";
  }
  public int speed() {
	  return 60;
  }
  public void gps() {
	  System.out.println("Provides gps");
  }
}
