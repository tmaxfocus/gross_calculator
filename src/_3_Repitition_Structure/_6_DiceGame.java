package _3_Repitition_Structure;

import java.util.Random;
import java.util.Scanner;

public class _6_DiceGame {
    /** --> task
     * Travel the entire game board of 20 spaces within five die rolls.
     * -> Generate random number between 1 and 6 to present die roll
     * -> Tell player which game space they are on and how many more spaces they have to go to win
     * -> Repeat four times(five rolls total)
     * -> If the player advances exactly 20 space within five rolls, they win
     * -> Output the result of the game.
     *  -> Random random = new Random();
     *  -> int die = random.nextInt(6) + 1;
     */

    public static void main(String[] args){
        int numberOfGameBordSpaces = 0;
        int numberOfRoll = 4;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int totalNumberOfSpace = 20;

        System.out.println("You are allow to roll the dice " + (numberOfRoll + 1) + " times");
        System.out.println();

        for(int j =0; j <= numberOfRoll ; j++)
        {

            System.out.println("Enter 1 to roll the dice #" + (j + 1) );

                int key = scanner.nextInt();
                if(key == 1){
                    int numberRolled = random.nextInt(6) + 1;
                    numberOfGameBordSpaces = numberOfGameBordSpaces + numberRolled;

                    if(numberOfGameBordSpaces < 20){
                        System.out.println("Roll #" + (j+1) + ": " + "You rolled a "
                                + numberRolled + ". You now on space " + numberOfGameBordSpaces  +
                                " and have " +  (totalNumberOfSpace - numberOfGameBordSpaces) + " more to go");
                        if(j == 4){
                            System.out.println(" You loose! Game over !");
                        }
                    }
                    else if(numberOfGameBordSpaces > 20)
                    {
                        System.out.println("You advancing to space " + numberOfGameBordSpaces + " is a bug" );
                        break;
                    }

                    else{
                        System.out.println("Roll #" + j+1 + ": " + "You rolled a "
                                + numberRolled + ". You're on space " + numberOfGameBordSpaces  +
                                " you win!");
                        break;
                    }
                }else{
                    System.out.println("Game over !");
                    break;
                }
            System.out.println();

        }

    }
}
