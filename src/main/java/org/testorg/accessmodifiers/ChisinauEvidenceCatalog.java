package org.testorg.accessmodifiers;

import org.testorg.accessmodifiers.peopleevidence.Person;

public class ChisinauEvidenceCatalog {
    public static void main(String[] args) {
        Person personOne = new Person(123456789, "Vasea", "Pupkin");
        Person personTwo = new Person(987456321, "Tola", "Marciana");
        Person personThree = new Person(147852369, "Goronwy", "Varlaam");
        Person personFour = new Person(1597532846, "Nikola", "Celestino", "Male", "str. Some Street 21", 25, false, 179.8d, "Blue");
        Person personFive = new Person(1597532846, "Yakub", "Kal-El", "Male", "str. Another Street 21", 85, true, 165.5d, "Green");

        personOne.isRetired = true;
        personTwo.eyesColor = "Yellow";
        personThree.height = 192.6d;

        System.out.println(personOne.isRetired ? "Vasea is retired" : "Vasea is not retired");

        if(personFour.isRetired){
            System.out.println("Nikola is retired");
        }
        else {
            System.out.println("Nikola is not retired");
        }

        System.out.println(personFive.isRetired ? "Yakub is Retired" : "Yakub is not retired");
    }
}
