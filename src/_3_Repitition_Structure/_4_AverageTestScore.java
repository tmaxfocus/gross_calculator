package _3_Repitition_Structure;

import java.util.Scanner;

public class _4_AverageTestScore {
    /**
     * -> Nested For Loop
     * Find the avrage of each student's test score
     */
    public static void main(String[] args){
        //Initialize what we know
        int numberOfStudents = 24;
        int numberOfTests = 4;

        Scanner scanner = new Scanner(System.in);

        //process all the students
        for(int i=0; i< numberOfStudents; i++){
            double total = 0;
            // process a student test scores
            for(int j=0; j < numberOfTests; j++)
            {
                System.out.println("Enter the score for test #" + (j + 1));
                double score = scanner.nextDouble();
                total = total + score;
            }
            double average = total/numberOfTests;
            System.out.println("the test average for student #" + (i + 1) + " is " + average);
        }
    }
}
