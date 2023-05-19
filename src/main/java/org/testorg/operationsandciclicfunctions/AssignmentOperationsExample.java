package org.testorg.operationsandciclicfunctions;

public class AssignmentOperationsExample {
    public static void main(String[] args) {

        int a = 2;
        int b = 4;
        int c = 10;
        int res = 0;

        System.out.println("Default value for a = " + 2);
        System.out.println("Default value for b = " + 4);
        System.out.println("Default value for c = " + 10);

        System.out.println("Result value on the beginning = " + res);

        res += a;
        System.out.println("Result value after sum with a = " + res);

        res -= b;
        System.out.println("Result value after sub with b = " + res);

        res *= c;
        System.out.println("Result value after mult with c = " + res);

        res /= a;
        System.out.println("Result value after div with a = " + res);

        res %= b;
        System.out.println("Result value after div% with b = " + res);

    }
}
