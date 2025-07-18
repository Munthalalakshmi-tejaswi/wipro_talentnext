package com.automobile;
import com.automobile.Vehicle;
public class Ford extends Vehicle {
	public String getModelName() {
		return "Ford";
	}
	public String getRegistrationNumber() {
		return "BR567876";
	}
	public String getOwnerName() {
		return "Raju";
	}
   public int speed() {
	   return 86;
   }
   public int tempControl() {
	   return 23;
   }
}
