package org.testorg.operationsandciclicfunctions;

public class ComparisonOperationsExample {
    public static void main(String[] args) {
        int a = 4;
        int b = 1;

        System.out.println("Default value for a = " + a);
        System.out.println("Default value for b = " + b);

        boolean isEqual = a == b;
        System.out.println("Value of a == b is : " + isEqual);

        boolean isNotEqual = a != b;
        System.out.println("Value of a != b is : " + isNotEqual);

        boolean isGreater = a > b;
        System.out.println("Value of a > b is : " + isGreater);

        boolean isLess = a < b;
        System.out.println("Value of a < b is : " + isLess);

        boolean isGreaterOrEqual = a >= b;
        System.out.println("Value of a >= b is : " + isGreaterOrEqual);

        boolean isLessOrEqual = a <= b;
        System.out.println("Value of a <= b is : " + isLessOrEqual);
    }
}
