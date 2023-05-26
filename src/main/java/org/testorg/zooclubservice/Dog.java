package org.testorg.zooclubservice;

public class Dog extends Animal implements AnimalInterface{
    public Dog(String name){
        super(name);
    }

    @Override
    public void eat(){
        System.out.println("The dog named " + getName() + " is eating bones.");
    }

    @Override
    public void makeSound(){
        System.out.println("The dog named " + getName() + " says Woof.");
    }
}
