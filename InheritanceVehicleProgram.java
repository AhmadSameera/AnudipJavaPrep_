package anudip_assignment;

//Parent Class Vehicle
class Vehicle{
	String brand;
	String model;
	int year;
	//Constructor of Vehicle class
	Vehicle(String brand,String model,int year){
		this.brand=brand;
		this.model=model;
		this.year=year;
	}
	//Declaration of drive() method
	void drive() {
		System.out.println("Brand of Vehicle is: "+brand);
		System.out.println("Model of Vehicle is: "+model);
		System.out.println("Year of Vehicle is: "+year);
		
	}
	
}
//Child Class Car
class Car extends Vehicle{
	String color;
	//Constructor of Car class
	Car(String brand, String model, int year,String color) {
		super(brand, model, year);
		this.color=color;
		
	}
	//Declaration of honk() method
	void honk() {
		System.out.println("Color of the vehicle: "+color);
		System.out.println("Honk the Horn!!");
		
	}
}
public class InheritanceVehicleProgram {

	public static void main(String[] args) {
		//Object of Child Class
		Car mycar=new Car("Honda City","Branded",2023,"Red");
		//calling a drive() using child class object
		mycar.drive();
		//calling a honk() using child class object
		mycar.honk();

	}

}
