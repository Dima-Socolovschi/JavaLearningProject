package org.testorg.operationsandciclicfunctions;

public class ArithmeticOperations {
    public static void main(String[] args) {

        int a = 2;
        int b = 4;
        int c = 10;

        System.out.println("Default value for a = " + a);
        System.out.println("Default value for b = " + b);
        System.out.println("Default value for c = " + c);

        int sum = a + b + c;
        System.out.println("Sum between a, b and c = " + sum);

        int sub = c - a - b;
        System.out.println("Sub between c, a and b = " + sub);

        int mutl = c * b;
        System.out.println("Mult between c and b = " + mutl);

        int div = c / a;
        System.out.println("Div between c and a = " + div);

        int divp = c % b;
        System.out.println("Div% between c and b = " + divp);
    }
}
