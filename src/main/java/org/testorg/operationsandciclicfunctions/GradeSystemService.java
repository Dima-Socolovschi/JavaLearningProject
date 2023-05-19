package org.testorg.operationsandciclicfunctions;

public class GradeSystemService {
    public static void main(String[] args) {
        int testResult = 52;

        System.out.println("Default value for testResult variable = " + testResult);

        if (testResult >= 90){
            System.out.println("Value bigger than 90");
        }
        else if (testResult < 90 && testResult >= 50){
            System.out.println("Value between 89 and 50");
        }
        else if (testResult < 50 && testResult >= 20){
            System.out.println("Value between 49 and 20");
        }
        else if (testResult < 20 && testResult >= 0){
            System.out.println("Value between 19 and 0");
        }
        else{
            System.out.println("Value is lower that 0.");
        }
    }
}
