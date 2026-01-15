# Java CGPA Calculator 🎓

A **console-based Java application** that calculates and tracks your CGPA. Designed to demonstrate **object-oriented programming**, user input handling, and basic file storage. Perfect for academic projects and showcasing Java fundamentals.  

---

## Features
- Calculate CGPA for an academic session.
- Handles only credit based grades(for now)
- Stores user inputs temporarily (in memory)
- Easy-to-use console interface

---

Skills Demonstrated

Java basics: variables, loops, and input handling

Object-oriented programming concepts

Console application design

Arithmetic and logical operations


## Code Example
```java
//Program to calculate the CGPA of a student for first and second semester.

import java.util.Scanner;
public class CgpaCalculator{
    public static void main(String[]args){
        Scanner read = new Scanner(System.in);

        System.out.println("Welcome to the CGPA Calculator Program.\n");
        //General Info
        System.out.println("Enter your Fullname: ");
        String fname = read.nextLine();

        System.out.println("\nEnter your Course: ");
        String course = read.nextLine();

        System.out.println("\nEnter your Level: ");
        String level = read.nextLine();

        System.out.println("\nEnter your Matric number: ");
        String matric_no = read.nextLine();

        System.out.println("\nWhat School do you attend? ");
        String school = read.nextLine();

        System.out.println("\n\n\nCGPA Calculator.\n\nFirst Semester. ");


        //First Semester.
        System.out.println("\nEnter how many units you offered in first semester: ");
        int fUnits = read.nextInt();

        System.out.println("\nHow many courses did you offer in first semester: ");
        int fnum = read.nextInt();

        float Sum1 = 0;
        for(int i=1; i<=fnum; i++){
            System.out.println("\nInput the grade score for Course "+i+": ");
            float Score1 = read.nextFloat();

            Sum1 += Score1;
        }
        float GPA1 = Sum1/(float)fUnits;

        System.out.println("\nYour GPA for "+level+" level, First Semester is "+GPA1+".");


        //Second Semester
        System.out.println("\n\nSecond Semester.");
        System.out.println("\nEnter how many units you offered in second semester: ");
        int sUnits = read.nextInt();

        System.out.println("\nHow many courses did you offer in second semester: ");
        int snum = read.nextInt();

        float Sum2 = 0;
        for(int j=1; j<=snum; j++){
            System.out.println("\nInput the grade score for Course "+j+": ");
            float Score2 = read.nextFloat();

            Sum2 += Score2;
        }
        float GPA2 = Sum2/(float)sUnits;

        System.out.println("\nYour GPA for "+level+" level, Second Semester is "+GPA2);


        //CGPA Calculator

        System.out.println("\n\nFinal "+level+" level CGPA.");
        float CGPA = ((Sum1 + Sum2)/(fUnits + sUnits));

        System.out.println("Hence "+fname+"("+matric_no+") in "+course+", Your CGPA for "+level+" level in "+school+" is "+CGPA);

        read.close();
    }
}








//Code Output

<img width="893" height="929" alt="Screenshot 2026-01-15 201451" src="https://github.com/user-attachments/assets/65c99cc5-8bc0-4208-9f8e-d8d9b4fc88eb" />
<img width="588" height="899" alt="Screenshot 2026-01-15 201436" src="https://github.com/user-attachments/assets/06077973-a375-4ec5-86b5-31a030bf7191" />




How to Use

1. Clone the repository:
i.e: git clone https://github.com/Kaydee39181/cgpa_calculator.git

2. Open the project in your preferred IDE (IntelliJ, Eclipse, NetBeans, etc.)

3. Run CGPACalculator.java

4. Enter the number of courses, grades, and credits as prompted

5. View your CGPA in the terminal



License

This project is free to use for learning and portfolio purposes.
