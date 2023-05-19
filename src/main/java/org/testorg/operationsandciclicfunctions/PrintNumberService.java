package org.testorg.operationsandciclicfunctions;

public class PrintNumberService {
    public static void main(String[] args) {
        int a = 0;
        int limit = 10;

        System.out.println("Default value for a = " + a);

        while (a < limit){
            System.out.println("Value of a = " + a);
            ++a;
        }

        System.out.println("Current value for a = " + a);

        do{
            System.out.println("Value of a = " + a);
            --a;
        }while (a > 0);

        System.out.println("Current value for a = " + a);

        for(a = 0 ; a < limit ; a++){
            System.out.println("Value of a = " + a);
        }

        System.out.println("Current value for a = " + a);

        for(a = 10 ; a > 0 ; a--){
            if(a%2 == 0){
                System.out.println("A is even number now. a = " + a);
            }
            else{
                System.out.println("A is odd number now. a = " + a);
            }
        }
    }
}
