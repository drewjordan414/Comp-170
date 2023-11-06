import java.util.Scanner;

public class triangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the three side lengths of the triangle:");

        System.out.print("A: ");
        int a = scanner.nextInt();

        System.out.print("Side B: ");
        int b = scanner.nextInt();

        System.out.print("Side C: ");
        int c = scanner.nextInt();

        printTriangleType(a, b, c);
    }

    public static void printTriangleType(int a, int b, int c) {
        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Not a valid triangle");
            return;
        }

        if (a == b && b == c) {
            System.out.println("Equilateral triangle");
        } else if (a == b || b == c || a == c) {
            System.out.println("Isosceles triangle");
        } else {
            System.out.println("Scalene triangle");
        }
    }
}
