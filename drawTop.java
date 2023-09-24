import java.util.Scanner;
public class drawTop {
    public static int SIZE;  

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter the desired size: ");
        SIZE = scanner.nextInt();  
        bars();
        upper();
        middle();
        bottom();
        bars();
        middle();
        middle();
    }

    public static void bars() {
        for (int i = 1; i <= SIZE; i++) {
            for (int j = 1; j <= SIZE; j++) { 
                System.out.print(" ");
            }
            System.out.println("||");
        }
    }

    public static void upper() {
        for (int i = 1; i <= SIZE; i++) {
            for (int j = 1; j <= (SIZE * 2 + 2 - 2 * i) / 2; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("||");
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void bottom() {
        for (int i = SIZE; i >= 1; i--) {
            for (int j = 1; j <= (SIZE * 2 + 2 - 2 * i) / 2; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("||");
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void middle() {
        for (int i = 1; i <= SIZE * 2 + 2; i++) {
            System.out.print("=");
        }
        System.out.println();
    }      
}
