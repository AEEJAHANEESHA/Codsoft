
    

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        System.out.println("--------------Student Grade Calculator--------------\n\n");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numOfSubjects = scanner.nextInt();
        int subjectMarks[] = new int[numOfSubjects];
        
        int totalMarks = 0;

        // Input
        for (int i = 0; i < subjectMarks.length; i++) {
            System.out.print("Enter marks for subject-" + (i + 1) + ": ");
            subjectMarks[i] = scanner.nextInt();
            totalMarks += subjectMarks[i];
        }

        // Results
        System.out.println("\n\n---------Results---------\n  ");
        System.out.println("Total marks: " + totalMarks + "/" + numOfSubjects * 100);
        System.out.println("Average percentage: " + totalMarks / numOfSubjects);

        // Grade assigning
        for (int i = 0; i < subjectMarks.length; i++) {
            int marks = subjectMarks[i];
            displayGrade(i + 1, marks);
        }
    }

    private static void displayGrade(int subjectNumber, int marks) {
        char grade;
        if (marks >= 90) {
            grade = 'S';
        } else if (marks >= 80 && marks < 90) {
            grade = 'A';
        } else if (marks >= 70 && marks < 80) {
            grade = 'B';
        } else if (marks >= 60 && marks < 70) {
            grade = 'C';
        } else if (marks >= 50 && marks < 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Grade obtained in subject-" + subjectNumber + " is: " + grade);
    }
}


