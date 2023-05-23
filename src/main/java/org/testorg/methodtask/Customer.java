package org.testorg.methodtask;

public class Customer {

    public Customer(String firstName, String lastName, String mail, int age, boolean isVipCustomer, double somethingVeryImportant){
        this.firstName = firstName;
        this.lastName = lastName;
        this.mail = mail;
        this.isVipCustomer = isVipCustomer;
        this.somethingVeryImportant = somethingVeryImportant;
        if(age < 18 || age > 70){
            System.out.println("Ooops, you entered wrong age number, please check the input data.");
            this.age = 0;
        }
        else{
            this.age = age;
        }

    }

    private int age;
    private String mail;
    private String firstName;
    private String lastName;
    private boolean isVipCustomer;
    private double somethingVeryImportant;
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 18 || age > 70){
            System.out.println("Ooops, you entered wrong age number, please check the input data. For now age is set to 0.");
        }
        else{
            this.age = age;
        }
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean getIsVipCustomer() {
        return isVipCustomer;
    }

    public void setIsVipCustomer(boolean permanentWorker) {
        isVipCustomer = permanentWorker;
    }

    public double getSomethingVeryImportant() {
        return somethingVeryImportant;
    }

    public void setSomethingVeryImportant(double somethingImportant) {
        this.somethingVeryImportant = somethingImportant;
    }

    public String toString(){
        return "Customer's details are next: "+
                "\n First name - " + firstName +
                "\n Last name - " + lastName +
                "\n Age - " + age +
                "\n Is VIP customer - " + isVipCustomer +
                "\n Mail - " + mail +
                "\n Some important value - " + somethingVeryImportant;
    }
}
