package org.testorg.classesandobjects.autoservicetask;

public class Car {
    public Car(){
        System.out.println("New car was created, no data provided.");
    }
    public Car(String owner){
        this.owner = owner;
        System.out.println("The car was handed over by: " + this.owner);
    }
    public Car(String owner, String plateNumber, String fuelType, double price, String manufacturer, int numberOfWheels, double mileage, String hexColor){
        this.owner = owner;
        this.plateNumber = plateNumber;
        this.fuelType = fuelType;
        this.price = price;
        this.manufacturer = manufacturer;
        this.numberOfWheels = numberOfWheels;
        this.mileage = mileage;
        this.hexColor = hexColor;
        System.out.println("Car with next data was added to the garage:"
                +"\n Owner: " + this.owner
                +"\n Plate Number: " + this.plateNumber
                +"\n Fuel Type: " + this.fuelType
                +"\n Price: " + this.price
                +"\n Manufacturer: " + this.manufacturer
                +"\n Number of wheels: " + this.numberOfWheels
                +"\n Mileage: " + this.mileage
                +"\n Color code: " + hexColor);
    }
    String owner;
    String plateNumber;
    String fuelType;
    double price;
    String manufacturer;
    int numberOfWheels;
    double mileage;
    String hexColor;
}
