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