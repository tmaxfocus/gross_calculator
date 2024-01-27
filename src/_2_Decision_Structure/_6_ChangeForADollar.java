package _2_Decision_Structure;

import java.util.Scanner;

public class _6_ChangeForADollar {
    // Change for a dollar -> User should enter enough change to equals exactly 1$;
    // Create a program that ask the user to enter the quantities of the following coins: Ask them
    // -- Number of pennies --> 1 pennies == 1 cent
    // -- Number of nickels  --> 1 nickel == 5 cents
    // -- Number of dimes  --> 1 dimes == 10 cents
    // -- Number of quarters --> 1 quarter == 25 cents
    // --> Calculate and print the total count value coins
    // --> Print message informing them if they won or lost
    // If they lost, let tem know  by how much they were under 1$
    // If they win, let them know by how much they were over 1$

    public static void main(String[] args){
        double penny =.01;
        double nickel = .05;
        double dime = .10;
        double quarter = .25;

        int dollar = 1;
        System.out.println("Welcome to change for a dollar game !");
        System.out.println("Kindly enter 1 to continue, 0 to end game");

        Scanner scanner = new Scanner(System.in);
        int getPlayerValue = scanner.nextInt();
        double total = switch (getPlayerValue){
            case 1 -> {
                System.out.println("Enter your number of pennies");
                double pennies = scanner.nextInt();
                System.out.println("Enter your number of nickels");
                double nickels = scanner.nextInt();
                System.out.println("Enter your number of dimes");
                double dimes= scanner.nextInt();
                System.out.println("Enter your number of quarters");
                double quarters= scanner.nextInt();
                scanner.close();
                pennies = pennies * penny;
                nickels = nickels * nickel;
                dimes = dimes * dime;
                quarters = quarters * quarter;

                yield  pennies + nickels + dimes + quarters;


            }



            default -> {
                yield 0;
            }
        };
        /**
        if(result == 100){
            System.out.println("Yay! that's exactly  $" + result  + " of $1.00 You win!" );
        } else if(result < 100 && result >= 1){
            System.out.println("You are " + result  + " under 1$ you loose!" );
        }else if(result <= 0){
            System.out.println("Thanks for playing with us! come back next time." );
        }
         **/
        if(total < dollar){
            double amountShort = dollar - total;
            System.out.println("Sorry, you lose! you are short " + String.format("%.2f", amountShort));
        }
        else if (total > dollar){
            double amountOver = total - dollar;

            System.out.println("Sorry, you lose! you were over " + String.format("%.2f", amountOver));
        }else{
            System.out.println("Yea! that's exactly $1.00! you win!" );
        }
    }
}
