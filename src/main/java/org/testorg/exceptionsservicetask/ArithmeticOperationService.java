package org.testorg.exceptionsservicetask;

public class ArithmeticOperationService {
    public static int divideWithNoExceptionHandling(int a, int b){
        return a/b;
    }

    public static int divideWithExceptionHandling(int a, int b){
        try{
            return a/b;
        }
        catch (Exception e){
            System.out.println("Oops, next exception has been captured: " + e.getMessage() + ". Please recheck your data.");
            return 0;
        }
        finally {
            System.out.println("Divide operation is executed.");
        }

    }
}
