package Week4.Chapter2B_Lab2;
public class Window {
    public static final int SIZE = 3;
    public static void main(String[] args) {
     
        for (int i = 1; i <= 2; i++) {
            printLine();
            printBox();
        }
        
        printLine();
    }
    public static void printLine() {
        System.out.print("+");
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= SIZE; j++) {
                System.out.print("=");
            }
            System.out.print("+");
        }
        System.out.println();
    }
    public static void printBox() {
        for (int i = 1; i <= SIZE; i++) {
            System.out.print("|");
            for (int j = 1; j <= 2; j++) {
                for (int k = 1; k <= SIZE; k++) {
                    System.out.print(" ");
                }
                System.out.print("|");
            }
            System.out.println();
        }
    }
}
