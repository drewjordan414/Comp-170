public class printSquareHW {
    public static void main(String[] args) {
        // write a method called printSquare that accepts a minimum and maximum integer and prints a square of lines of increasing numbers. 
        // the first line should start with the minimum, and each line that follows should start with the next-higher number.
        // the sequence of numbers on a line wraps back to the minimum after it hits the maximum.
        // example output 34567, 45673, 56734, 67345, 73456
        // if the maximum passed is kess than the minimum, the method should print nothing.
        printSquare(0);
        printSquare(3);
        printSquare(5);
        printSquare(7);
        printSquare(9);
        printSquare(11);
    }
    public static void printSquare(int n) {
        for (int i = 0; i < n; i++) {
            int num = i + 1;
            for (int j = 0; j < n; j++) {
                System.out.print(num);
                num++;
                if (num > n) {
                    num = 1;
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
