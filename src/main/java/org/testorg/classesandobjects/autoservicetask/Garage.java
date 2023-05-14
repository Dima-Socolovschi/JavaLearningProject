package org.testorg.classesandobjects.autoservicetask;

public class Garage {
    public Garage(){
        System.out.println("New garage was created, no data provided.");
    }
    public Garage(String garageAddress){
        this.garageAddress = garageAddress;
        System.out.println("Garage with next address " + this.garageAddress + " was created.");
    }
    public Garage(String garageAddress, int garageCapacity, int numberOfWorkers, String chiefMechanic, boolean gotEmptySpace){
        this.garageAddress = garageAddress;
        this.garageCapacity = garageCapacity;
        this.numberOfWorkers = numberOfWorkers;
        this.chiefMechanic = chiefMechanic;
        this.gotEmptySpace = gotEmptySpace;
        System.out.println("The next garage was created:"
                +"\n Garage address: " + this.garageAddress
                +"\n Garage capacity: " + this.garageCapacity
                +"\n Number of workers: " + this.numberOfWorkers
                +"\n Chief mechanic name: " + this.chiefMechanic
                +"\n Got free space: " + this.gotEmptySpace);
    }
    String garageAddress;
    int garageCapacity;
    int numberOfWorkers;
    String chiefMechanic;
    boolean gotEmptySpace;

}
