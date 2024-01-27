package _3_Repitition_Structure;

import java.util.Scanner;

/**
 * Brake statement
 * search a String to determine if it contains the letter 'A'
 */
public class _5_LetterSearch {
    public static void main(String[] args)
    {
        //Get text
        System.out.println("Enter some text: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        scanner.next();

        boolean letterFound = false;

        //search for the text A
        for(int i=0; i < text.length(); i++)
        {
            char currentLetter = text.charAt(i);

            if(currentLetter == 'A' || currentLetter == 'a')
            {
                letterFound = true;
                break;
            }
        }
    }
}
