package org.testorg.operationsandciclicfunctions;

public class DayOfTheWeekService {
    public static void main(String[] args) {
        int dayNumber = 0;
        String dayName = "Luni";

        System.out.println("Default value for dayNumber = " + dayNumber);
        System.out.println("Default value for dayName = " + dayName);

        switch (dayName.toUpperCase()){
            case "LUNI":
                dayNumber = 1;
                break;
            case "MARTI":
                dayNumber = 2;
                break;
            case "MIERCURI":
                dayNumber = 3;
                break;
            case "JOI":
                dayNumber = 4;
                break;
            case "VINERI":
                dayNumber = 5;
                break;
            case "SIMBATA":
                dayNumber = 6;
                break;
            case "DUMINICA":
                dayNumber = 7;
                break;
            default:
                System.out.println("Wrong data provided.");
        }
        System.out.println("Next week day " + dayName + " got next number " + dayNumber);
    }
}
