import java.util.Scanner;

public class gpa {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        printGPA(console);
    }

    public static void printGPA(Scanner console) {
        System.out.print("Enter a student record: ");
        String name = console.next();
        int numScores = console.nextInt();
        int total = 0;

        for (int i = 0; i < numScores; i++) {
            total += console.nextInt();
        }

        double average = (double) total / numScores;
        System.out.printf("%s's grade is %.2f%n", name, average);
    }
}
