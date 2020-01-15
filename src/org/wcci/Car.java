package org.wcci;

public class Car {
    String wheels;
    int gasLevel = 100;
    String color;
    String transmission;
    Engine engine;

    public Car(String wheelType, String color, String transmissionType,
               Engine engineType){
        this.wheels = wheelType;
        this.color = color;
        this.transmission = transmissionType;
        this.engine = engineType;
    }
    public String getColor(){
        return color;
    }

    public void drive() {
        System.out.println("Car is driving.");
        gasLevel -= engine.getFuelBurnRate();
        System.out.println("Gas is at "+ gasLevel +".");
    }

    public void stop() {
        System.out.println("CAR IS STOPPING");
        System.out.println("Gas is at "+ gasLevel +".");
    }

    public void accelerate() {
        System.out.println("Car is going faster");
        gasLevel -= engine.getFuelBurnRate();
        System.out.println("Gas is at "+ gasLevel +".");
    }

    public void fuelCar() {
        System.out.println("Getting gas.");
        gasLevel += 50;
        System.out.println("Gas is at "+ gasLevel +".");
    }

}
