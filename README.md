# Java CGPA Calculator 🎓

A **console-based Java application** that calculates and tracks your CGPA.  
Designed to demonstrate **object-oriented programming**, user input handling, and basic file storage. Perfect for academic projects and showcasing Java fundamentals.  

---

## Features
- Calculate CGPA for an academic session (first and second semester).  
- Handles only credit-based grades (for now).  
- Stores user inputs temporarily (in memory).  
- Easy-to-use console interface.  

---

## Skills Demonstrated
- Java basics: variables, loops, input handling  
- Object-oriented programming concepts  
- Console application design  
- Arithmetic and logical operations  



## How to Use
1. Clone the repository: git clone https://github.com/Kaydee39181/cgpa_calculator.git
       
2. Open the project in your preferred IDE (IntelliJ, Eclipse, NetBeans, VS code etc.).

3. Run CGPACalculator.java.

4. Enter the number of courses, grades, and credits as prompted.

5. View your CGPA in the terminal.



## License

This project is free to use for learning and portfolio purposes.




## Code Output

<img width="893" height="929" alt="Screenshot 2026-01-15 201451" src="https://github.com/user-attachments/assets/65c99cc5-8bc0-4208-9f8e-d8d9b4fc88eb" />
<img width="588" height="899" alt="Screenshot 2026-01-15 201436" src="https://github.com/user-attachments/assets/06077973-a375-4ec5-86b5-31a030bf7191" />

---

## Code Example

```java
// Program to calculate the CGPA of a student for first and second semester.

import java.util.Scanner;

public class CgpaCalculator {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Welcome to the CGPA Calculator Program.\n");

        System.out.print("Enter your Fullname: ");
        String fname = read.nextLine();

        System.out.print("Enter your Course: ");
        String course = read.nextLine();

        System.out.print("Enter your Level: ");
        String level = read.nextLine();

        System.out.print("Enter your Matric number: ");
        String matric_no = read.nextLine();

        System.out.print("What School do you attend? ");
        String school = read.nextLine();

        System.out.println("\nCGPA Calculator\n\nFirst Semester");

        // First Semester
        System.out.print("Enter how many units you offered in first semester: ");
        int fUnits = read.nextInt();

        System.out.print("How many courses did you offer in first semester: ");
        int fnum = read.nextInt();

        float sum1 = 0;
        for (int i = 1; i <= fnum; i++) {
            System.out.print("Input the grade score for Course " + i + ": ");
            float score1 = read.nextFloat();
            sum1 += score1;
        }
        float gpa1 = sum1 / (float) fUnits;
        System.out.println("Your GPA for " + level + " level, First Semester is " + gpa1);

        // Second Semester
        System.out.println("\nSecond Semester");
        System.out.print("Enter how many units you offered in second semester: ");
        int sUnits = read.nextInt();

        System.out.print("How many courses did you offer in second semester: ");
        int snum = read.nextInt();

        float sum2 = 0;
        for (int j = 1; j <= snum; j++) {
            System.out.print("Input the grade score for Course " + j + ": ");
            float score2 = read.nextFloat();
            sum2 += score2;
        }
        float gpa2 = sum2 / (float) sUnits;
        System.out.println("Your GPA for " + level + " level, Second Semester is " + gpa2);

        // Final CGPA
        float cgpa = (sum1 + sum2) / (fUnits + sUnits);
        System.out.println("\nFinal CGPA");
        System.out.println("Hence " + fname + " (" + matric_no + ") in " + course +  ", your CGPA for " + level + " level           in " + school + " is " + cgpa);

        read.close();
    }
}
