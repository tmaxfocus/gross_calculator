package _2_Decision_Structure;

import java.util.Scanner;

public class _1_SalaryCalculator {
    // Decision Structure
    //1. if statement
    // All salespeople get a payment of $1,000 for the week.
    // Salespeople who exceed 10 sales get an additional bonus of $250
    public static void main(String[] args){
        // Initialize known values
        int salary = 1000;
        int quota = 10;
        int bonus = 250;


        //get values for the unknown
        System.out.println("How many sales did you make this week");

        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //Quick detour for the bonus earners
        if(sales > quota){
            salary = salary + bonus;
            System.out.println("Congrats! You;ve met your quota.");
        }


    }
}
