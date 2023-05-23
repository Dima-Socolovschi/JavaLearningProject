package org.testorg.methodtask;

import static org.testorg.methodtask.DataGeneratorUtil.getRandomString;

public class ExecutionService {
    public static void main(String[] args) {

        System.out.println("Random values.");

        System.out.println("\nRandom int between two values - " + DataGeneratorUtil.getRandomInt(2, 10));
        System.out.println("Random int with max value - " + DataGeneratorUtil.getRandomInt(20));
        System.out.println("Random mail - " + DataGeneratorUtil.getRandomMail(10));
        System.out.println("Random string - " + getRandomString(15));
        System.out.println("Random double - " + DataGeneratorUtil.getRandomDouble());
        System.out.println("Random boolean - " + DataGeneratorUtil.getRandomBoolean());

        System.out.println("\nCustomers:");

        System.out.println("\nCustomer #1.");

        Customer cust1 = new Customer("Vasea", "Pupkin", "pupkinv@gmail.com", 25, true, 0.2255255d);
        System.out.println("New customer.");
        System.out.println(cust1);
        cust1.setIsVipCustomer(DataGeneratorUtil.getRandomBoolean());
        cust1.setAge(DataGeneratorUtil.getRandomInt(50));
        cust1.setLastName(getRandomString(10));
        System.out.println("\nSame customer after change.");
        System.out.println(cust1);

        System.out.println("\nCustomer #2.");
        Customer cust2 = new Customer(DataGeneratorUtil.getRandomString(10),
                DataGeneratorUtil.getRandomString(15),
                DataGeneratorUtil.getRandomMail(10),
                DataGeneratorUtil.getRandomInt(100),
                DataGeneratorUtil.getRandomBoolean(),
                DataGeneratorUtil.getRandomDouble());
        System.out.println("New customer.");
        System.out.println(cust2);

    }
}
