package Exam1_Part_B;
// Psuedocode:
// Class: Stairs
// Input: steps
// Output: Staircase with steps steps
// Steps:
// 1. take in user input for number of steps using Scanner
// 2. drawStairCase method
// 3. drawStairCase method takes in steps
// 4. for loop that starts at 0 and goes up to steps
// 5. for loop that starts at 0 and goes up to i * 2
// 6. print "#"
// 7. print "__"
// 8. call drawStairCase method with user input

import java.util.Scanner;
public class Stairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number of steps for the staircase: ");
        int steps = scanner.nextInt();
        System.out.println("Staircase with " + steps + " steps");
        drawStairCase(steps);
        scanner.close();
    }
    
    public static void drawStairCase(int steps) {
        for (int i = 0; i < steps; i++) {
            for (int b = 0; b < i * 2; b++) {
                System.out.print("#");
            }
            System.out.println("__");
        }
    }
    
}
