package studentdatabaseapp;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private  String studentID;
    private String courses = null;
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;



    // constructor: prompt user to enter students name and year
    public Student(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student first name: ");
        this.firstName = in.nextLine();

        System.out.print("Enter student last name: ");
        this.lastName = in.nextLine();

        System.out.print("1 -Freshman\n2- Sophomore\n3- Junior\n4- Senior\nEnter student class level: ");
        this.gradeYear = in.nextInt();
        setStudentID();



    }

    // Generate an ID
    private void  setStudentID(){
        // Grade level + ID
        id++;
        this.studentID = gradeYear + "" + id;

    }

    // Enrol in courses
    public void enrol(){
        // Get inside a loop, user ints 0
        do {


            System.out.print("Enter a course to enrol (Q to quit):");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n " + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            }
            else {

                break;
            }
        }while (1 != 0);


    }

    // View balance
    public void viewBalance(){
        System.out.println("Your balance is: $" + tuitionBalance);
    }

    // Pay tuition
    public void payTuition(){
        viewBalance();
        System.out.print("Enter your payment: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();

    }

    // Show status
    public String toString (){
        return "Name: " + firstName + "" + lastName +
                "\nGrade level: " + gradeYear +
                "\nStudent ID: " + studentID +
                "\nCourses Enrolled:" + courses +
                "\nBalance: $" + tuitionBalance;

    }

}
