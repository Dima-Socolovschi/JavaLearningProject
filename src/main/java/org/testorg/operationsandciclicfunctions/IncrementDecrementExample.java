package org.testorg.operationsandciclicfunctions;

import javax.sound.midi.Soundbank;

public class IncrementDecrementExample {
    public static void main(String[] args) {
        int a = 5;

        System.out.println("Default value for a = " + a);

        a++;
        System.out.println("a is increased by 1: " + a);
        System.out.println("a is increased by 1 after is printed: " + a++);

        ++a;
        System.out.println("a is increased by 1: " + a);
        System.out.println("a is increased by 1 before is printed: " + ++a);

        a--;
        System.out.println("a is decreased by 1: " + a);
        System.out.println("a is decreased by 1 after is printed: " + a--);

        --a;
        System.out.println("a is decreased by 1: " + a);
        System.out.println("a is decreased by 1 before is printed: " + --a);
    }
}
