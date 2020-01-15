package org.wcci;

public class CarsApplication {

    public static void main(String[] args) {
	    Car car1 = new Car("Snow Tire", "Blue","Auto",new Engine("4-cyl", 4));
	    car1.accelerate();
	    car1.drive();
	    car1.stop();
        car1.fuelCar();
		System.out.println(car1.getColor());
		Car car2 = new Car("Regular", "Green", "Auto", new Engine("V8", 10));
		car2.accelerate();
		car2.drive();
		car2.stop();
		car2.fuelCar();
		System.out.println(car2.getColor());
    }
}
