package org.testorg.zooclubservice;

public class ZooService {
    public static void main(String[] args) {
        Animal lion = new Lion("Leo");
        Dog dog = new Dog("Volt");
        Cat cat  = new Cat("Murzik");

        lion.eat();
        //lion.makeSound() cannot be executed because Animal class does not implements AnimalInterface

        cat.eat();
        cat.makeSound();

        dog.eat();
        dog.makeSound();
    }
}
