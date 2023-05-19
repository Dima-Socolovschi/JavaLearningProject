package org.testorg.operationsandciclicfunctions;

public class ogicalOperationsExample {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        System.out.println("Default value for a = " + a);
        System.out.println("Default value for b = " + b);

        System.out.println("Result of logical and between a and b = " + (a && b));
        System.out.println("Result of logical and between a and a = " + (a && a));
        System.out.println("Result of logical and between b and b = " + (b && b));

        System.out.println("Result of logical or between a and b = " + (a || b));
        System.out.println("Result of logical or between a and a = " + (a || a));
        System.out.println("Result of logical or between b and b = " + (b || b));

        System.out.println("Result of logical not for a = " + !a);
        System.out.println("Result of logical not for b = " + !b);

        System.out.println("Result of logical xor between a and b = " + (a ^ b));
        System.out.println("Result of logical xor between b and b = " + (a ^ a));
        System.out.println("Result of logical xor between b and b = " + (b ^ b));
    }
}
