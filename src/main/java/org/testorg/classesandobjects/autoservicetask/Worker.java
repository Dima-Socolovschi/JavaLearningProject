package org.testorg.classesandobjects.autoservicetask;

public class Worker {
    public Worker(){
        System.out.println("New worker was added, no data provided.");
    }
    public Worker(String workerName){
        this.workerName = workerName;
        System.out.println("Worker with name " + this.workerName + " was added.");
    }
    public Worker(String workerName, double workerSalary, int workerAge, int workerId, String workerPhoneNumber){
        this.workerName = workerName;
        this.workerSalary = workerSalary;
        this.workerAge = workerAge;
        this.workerId = workerId;
        this.workerPhoneNumber = workerPhoneNumber;
        System.out.println("The next worker was created:"
                +"\n Worker name: " + this.workerName
                +"\n Worker salary: " + this.workerSalary
                +"\n Worker age: " + this.workerAge
                +"\n Worker id: " + this.workerId
                +"\n Worker phone number: " + this.workerPhoneNumber);
    }
    String workerName;
    double workerSalary;
    int workerAge;
    int workerId;
    String workerPhoneNumber;
}
