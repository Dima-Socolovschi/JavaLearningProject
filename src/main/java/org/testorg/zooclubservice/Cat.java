package org.testorg.zooclubservice;

public class Cat extends Animal implements AnimalInterface{
    public Cat(String name){
        super(name);
    }

    @Override
    public void eat(){
        System.out.println("The cat named " + getName() + " is eating fish.");
    }

    @Override
    public void makeSound(){
        System.out.println("The cat named " + getName() + " says Meow.");
    }
}
