package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*
        We'll have two classes, Main and Student.
In the student class, assemble the constructor with accepting the students name and their GPA.
Here is your challenge...
Create multiple student objects in the main method. (student1, student2, etc.)
Record their rank based on their GPA.
Display the top three students in a SOP statement...
The top three students are:
         */

        Students s1 = new Students("Bob", 3.4);
        Students s2 = new Students("Bennett", 4.4);
        Students s3 = new Students("Sally", 3.8);
        Students s4 = new Students("KLim", 4.8);


        System.out.println(Students.highestGPA);
        System.out.println(Students.secondGPA);
        System.out.println(Students.thirdGPA);


    }
}
