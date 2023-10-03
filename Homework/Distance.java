import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter x1: ");
        int x1 = scanner.nextInt();
        
        System.out.print("Enter y1: ");
        int y1 = scanner.nextInt();
        
        System.out.print("Enter x2: ");
        int x2 = scanner.nextInt();
        
        System.out.print("Enter y2: ");
        int y2 = scanner.nextInt();
        
        double result = distance(x1, y1, x2, y2);
        System.out.println("The distance between (" + x1 + "," + y1 + ") and (" + x2 + "," + y2 + ") is: " + result);
    }

    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
