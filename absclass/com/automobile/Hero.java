package com.automobile;
import com.automobile.Vehicle;
public class Hero extends Vehicle {
   public String getModelName() {
	   return "Hero";
   }
   public String getRegistrationNumber() {
	   return "AP279217672876";
   }
   public String getOwnerName() {
	   return "Tejaswi";
   }
   public int getSpeed() {
	   return 80;
   }
   public void radio() {
	   System.out.println("Provide radio device");
   }
}
