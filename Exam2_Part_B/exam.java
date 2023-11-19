package Exam2_Part_B;
//  Pseudocode for countValidWords method:
//  1. Validate if both character parameters are letters. If not, throw IllegalArgumentException.
//  2. Convert characters to lowercase for case-insensitive comparison.
//  3. Identify the valid range of starting characters based on the provided characters.
//  4. Prompt the user for input and explain the criteria for valid words and ending input.
//  5. Initialize a counter for valid words.
//  6. In a loop, read user input until a non-letter starting word is entered.
//     a. Split the input into individual words.
//     b. For each word, check if it starts with a valid character and increment the counter if it does.
//  7. Return the final count of valid words.

// Pre and Post
// Pre-Conditions:
//     - The two character parameters are valid characters.

// Post-Conditions:
//     - Returns the count of valid words entered by the user.
//     - Throws IllegalArgumentException if either character parameter is not a letter.

import java.util.Scanner;

public class exam {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // test case 0: lowercase 'a' to 'k'
        try {
            System.out.println("Test 1: Count = " + countValidWords(scanner, 'a', 'k'));
        } catch (IllegalArgumentException e) {
            System.out.println("Test 1: " + e.getMessage());
        }

        // test case 1: uppercase 'Z' to lowercase 'q'
        try {
            System.out.println("Test 2: Count = " + countValidWords(scanner, 'z', 'Q'));
        } catch (IllegalArgumentException e) {
            System.out.println("Test 2: " + e.getMessage());
        }

        // test case 2: invalid character '1' and a letter 'a'
        try {
            System.out.println("Test 3: Count = " + countValidWords(scanner, '1', 'a'));
        } catch (IllegalArgumentException e) {
            System.out.println("Test 3: " + e.getMessage());
        }

        scanner.close(); // close the scanner 
    }

    public static int countValidWords(Scanner scanner, char character1, char character2) {
        if (!Character.isLetter(character1) || !Character.isLetter(character2)) {
            throw new IllegalArgumentException("Both parameters must be letters.");
        }

        // convert characters to lowercase
        character1 = Character.toLowerCase(character1);
        character2 = Character.toLowerCase(character2);

        // determine the lower and upper bounds of the range
        char lowercase = (character1 < character2) ? character1 : character2;
        char uppercase = (character1 > character2) ? character1 : character2;

        System.out.println("Enter words starting with letters between " + lowercase + " and " + uppercase +
                           ". Enter a word starting with a non-letter to stop.");
        
        // initalize word count
        int wordCount = 0;
        while (true) {
            String line = scanner.nextLine();
            // break loop if user input is a number
            if (line.isEmpty() || !Character.isLetter(line.charAt(0))) {
                break;
            }

            // split the line into individual words
            String[] words = line.split("\\s+");
            for (String word : words) {
                char firstChar = Character.toLowerCase(word.charAt(0));
                if (firstChar >= lowercase && firstChar <= uppercase) {
                    wordCount++;
                }
            }
        }

        return wordCount; // return the total count of valid words
    }
}
