package org.testorg.classesandobjects.autoservicetask;

public class ManageAutoSerivce {
    public static void main(String[] args) {

        //Initialize objects using empty constructor
        Car car = new Car();
        Tool tool = new Tool();
        Garage garage = new Garage();
        Worker worker = new Worker();
        System.out.println();

        //Initialize objects using one parameter constructor
        Car mazda = new Car("Steve Jackson");
        Tool saw = new Tool("Saw");
        Garage garageOne = new Garage("str. Grove Street");
        Worker vaseaPupkin = new Worker("Vasea Pupkin");
        System.out.println();

        //Initialize objects using all parameter constructor
        Car bmv = new Car("Trond Machli", "AU555", "Gas", 5568.2d, "bmv", 3, 1000000000.23d, "#f25567");
        Tool screwdriver = new Tool("Screwdriver", 152.27d, 125, true);
        Garage garageTwo = new Garage("str. Some Street", 15, 5, "Vasea Pupkin", false);
        Worker mathiasJakup = new Worker("Mathias Jakup", 750.50d, 26, 21, "0685555555");
    }
}
