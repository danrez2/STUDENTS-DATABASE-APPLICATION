package emailApp;

import java.util.Locale;
import java.util.Scanner;

public class Email {
    private String firstName;
   private String lastName;
   private String password;
   private String department;
   private String email;
   private int mailboxCapacity = 500;
   private int defaultPasswordLength = 10;
   private String alternateEmail;
   private String companySuffix = "aeycompany.com";

   // constructor to receive firstname and lastname
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);

        // call method asking for department & return department
        this.department = setDepartment();
        System.out.println("Department: " + this.department);

        // call a method that generates random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);

        // Combine element to return email
        email = firstName.toLowerCase(Locale.ROOT) + "." + lastName.toLowerCase(Locale.ROOT) + "@"
                + department + companySuffix;
        System.out.println("Your email is: " + email);

    }

    // Ask for department
    private String setDepartment(){
        System.out.print("DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0" +
                " for None\nEnter " + "department code:");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1){
            return "sales";}
            else if (depChoice == 2){
                return "dev";}
                else if (depChoice == 3){
                    return "acc";}
                    else{ return "";}




    }

    // generate random password
    private String randomPassword(int length){
        String passwordSet = "QWERTYUIOPLKJHGFDSAZXCVBNM123456789!@#$%^7&*";
        char[] password = new char[length];
        for (int i =0; i<length; i++){
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);

    }

    // set mailbox capacity
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }

    // set alternate email
    public void setAlternateEmail(String altEmail){
        this.alternateEmail = altEmail;
    }

    // change the password
    public void changePassword(String password){
        this.password = password;
    }

    public int getMailboxCapacity(){
        return mailboxCapacity;
    }
    public String getAlternateEmail(){
        return alternateEmail;
    }
    public String getPassword(){
        return password;
    }
    public String showInfo(){
        return "DISPLAY NAME: " + firstName + "" + lastName +
                "COMPANY EMAIL: " + email +
                "MAILBOX CAPACITY: " + mailboxCapacity + "mb";
    }


}
