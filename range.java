import java.util.Scanner;

public class range {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter an integer to find the range of its digits: ");
        int number = scanner.nextInt(); 

        int range = digitRange(number); 
        System.out.println("The range of the digits is: " + range);

        scanner.close();
    }

    public static int digitRange(int number) {
        if (number < 0) {
            number = -number;
        }
        
        if (number == 0) {
            return 1; 
        }

        int maxDigit = 0;
        int minDigit = 9;

        while (number > 0) {
            int digit = number % 10; 
            maxDigit = Math.max(maxDigit, digit); 
            minDigit = Math.min(minDigit, digit); 
            number /= 10; 
        }

        return maxDigit - minDigit + 1; 
    }
}
