
public class Car implements Vehicle,FourWheeler{
public void message() {
	Vehicle.super.message();
	FourWheeler.super.message();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Car c=new Car();
    c.message();
	}

}
