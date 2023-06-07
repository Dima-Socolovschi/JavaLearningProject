package org.testorg.bookcollectiontask;

public class IntNumberArrayService {
    public static void findMin(int[] arr){
        int min = arr[0];

        for (int j : arr) {
            System.out.println(j);
            if (j < min) {
                min = j;
            }
        }
        System.out.println("Minimal array value is " + min);
    }

    public static void findMed(int[] arr){
        int counter = 0;

        for (int j : arr){
            counter += j;
        }

        System.out.println("Medium value of the array is " + ((double) counter/arr.length));
    }
}
