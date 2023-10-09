package Exam1_Part_B;
// Psuedocode:
// Class: Multiples
// Input: number, numberOfMultiples
// Output: The first numberOfMultiples multiples of number are 3, 6, 9, 12, 15
// Steps:
// 1. printMultiples method
// 2. printMultiples method takes in number and numberOfMultiples
// 3. printMultiples method prints "The first " + numberOfMultiples + " multiples of " + number + " are "
// 4. for loop that starts at 1 and goes up to numberOfMultiples
// 5. print number * i
// 6. if i < numberOfMultiples, print ", "
// 7. print a new line
// 8. call printMultiples method with 3 and 5
// 9. call printMultiples method with 7 and 3

public class Multiples {
    public static void main(String[] args) {
        printMultiples(3, 5);
        printMultiples(7, 3);
    }
    public static void printMultiples(int number, int numberOfMultiples) {
        System.out.print("The first " + numberOfMultiples + " multiples of " + number + " are ");
        for (int i = 1; i <= numberOfMultiples; i++) {
            System.out.print(number * i);
            if (i < numberOfMultiples) {
                System.out.print(",  ");
            }
        }
        System.out.println(); 
    }
}
