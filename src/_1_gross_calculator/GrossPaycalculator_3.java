package _1_gross_calculator;

import java.util.Scanner;

public class GrossPaycalculator_3 {

    public static void main(String[] args){
        // Practice the exercise to complete this sentence
        // 1. On a *adjective season* day, I drink a minimum of
        //*number* cups of coffee. the program should
        // I. Ask the user to provide: (i) Season of the year (ii) number of cup of coffee drank (iii) Adjective
        // II. Store and Print (i) Store the input in variables (ii) Print a story by filling in the blanks with variables

        String seasonOfTheYear = "";
        int cupsOfCoffee = 0;
        String  adjective = "";

        System.out.println("What is the season of th year ?");
        Scanner scanner = new Scanner(System.in);
        seasonOfTheYear = scanner.next();

        System.out.println("What is the adjective to qualify the year ?");
        adjective = scanner.next();

        System.out.println("How many cups of coffee did you drink");
        cupsOfCoffee = scanner.nextInt();
        scanner.close();

        System.out.println("On a " + adjective +" " + seasonOfTheYear + " day," );

        System.out.println("I drink a minimum of  " + cupsOfCoffee+" cups of coffee.");



    }
}
