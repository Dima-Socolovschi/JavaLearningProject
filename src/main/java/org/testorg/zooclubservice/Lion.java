package org.testorg.zooclubservice;

public class Lion extends Animal implements AnimalInterface {
    public Lion(String name){
        super(name);
    }

    @Override
    public void eat(){
        System.out.println("The lion named " + getName() + " is eating meat.");
    }

    @Override
    public void makeSound(){
        System.out.println("The lion named " + getName() + " says Roar.");
    }
}
