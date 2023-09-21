// Write a program that produces the figures like the following. It's a bit like a spinning top sitting on a base. 
//Use a class constant for the size of the figure. The example is for size 4. Your program should work for sizes from 2 up. 
//The constant defines the number of rows in each section of the figure and the maximum width of the figure is 2 * the constant. 
//Use several static methods to make the program understandable and avoid redundancy. 
// Grading: You must divide your program into multiple methods with the aim of reducing redundancy.

// -5 if not sufficient number and interaction between methods.

// -7 if your program does not work for multiple sizes.

// -2 for getting parts of the drawing close but not exact (or not adjusting properly for size)
// public class drawTop {
//     public static final int SIZE = 4;

//     public static void main(String[] args) {
//         printVerticalBars();
//         printTop();
//         printSeparator();
//         printBottom();
//         printVerticalBars();
//         printSeparator();
//         printSeparator();
//     }

//     public static void printVerticalBars() {
//         for (int i = 1; i <= SIZE; i++) {
//             for (int j = 1; j <= SIZE + 1; j++) {
//                 System.out.print(" ");
//             }
//             System.out.println("||");
//         }
//     }

//     public static void printTop() {
//         for (int i = 1; i <= SIZE; i++) {
//             for (int j = 1; j <= SIZE + 2 - i; j++) {
//                 System.out.print(" ");
//             }
//             for (int j = 1; j < i; j++) {
//                 System.out.print("*");
//             }
//             System.out.print("||");
//             for (int j = 1; j <= i - 1; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }

//     public static void printBottom() {
//         for (int i = SIZE; i >= 1; i--) {
//             for (int j = 1; j <= SIZE + 2 - i; j++) {
//                 System.out.print(" ");
//             }
//             for (int j = 1; j < i; j++) {
//                 System.out.print("*");
//             }
//             System.out.print("||");
//             for (int j = 1; j <= i - 1; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }

//     public static void printSeparator() {
//         for (int i = 1; i <= 4 * SIZE - 2; i++) {
//             System.out.print("==");
//         }
//         System.out.println();
//     }
// }

public class drawTop {
    public static final int SIZE = 4;

    public static void main(String[] args) {
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
            for (int j = 1; j <= SIZE + 2; j++) {
                System.out.print(" ");
            }
            System.out.println("||");
        }
    }

    public static void upper() {
        for (int i = 1; i <= SIZE; i++) {
            for (int j = 1; j <= SIZE + 2 - i; j++) {
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
            for (int j = 1; j <= SIZE + 2 - i; j++) {
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
        for (int i = 1; i <= 2 * (SIZE - 1) + 1; i++) {
            System.out.print("");
        }
        for (int i = 1; i <= 2 * SIZE - 2; i++) {
            System.out.print("=");
        }
        System.out.println();
    }    
    
}
