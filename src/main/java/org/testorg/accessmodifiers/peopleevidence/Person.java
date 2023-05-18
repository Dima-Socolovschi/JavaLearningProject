package org.testorg.accessmodifiers.peopleevidence;

public class Person {
    public Person(long id, String name, String surname){
        ID = id;
        this.name = name;
        this.surname = surname;
        System.out.println("New person with basic data was created.");
    }

    public Person(long id, String name, String surname, String sex, String residence, int age, boolean isRetired, double height, String eyesColor){
        ID = id;
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.residence = residence;
        this.age = age;
        this.isRetired = isRetired;
        this.height = height;
        this.eyesColor = eyesColor;
        System.out.println("New person with full data was created.");
    }

    private final long ID;
    private String name;
    private String surname;
    protected String sex;
    protected String residence;
    protected int age;
    public boolean isRetired;
    public double height;
    public String eyesColor;

}
