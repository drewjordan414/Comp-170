// instructions
// write a method called printSquare that accepts a minimum and maximum integer and prints a square of lines of increasing numbers. 
// the first line should start with the minimum, and each line that follows should start with the next-higher number.
// the sequence of numbers on a line wraps back to the minimum after it hits the maximum.
// example output 34567, 45673, 56734, 67345, 73456
// if the maximum passed is less than the minimum, the method should print nothing.
public class printSquareHW {
    public static void main(String[] args) {
        printSquare(3, 7);
        System.out.println("------------------");
        printSquare(1, 4);
        System.out.println("------------------");
        printSquare(7, 3);
    }
    public static void printSquare(int min, int max) {
        if (max < min) {
            return;
        }

        for (int i = min; i <= max; i++) {
            int current = i;
            for (int j = 1; j <= (max - min + 1); j++) {
                System.out.print(current);
                current++;
                if (current > max) {
                    current = min;
                }
            }
            System.out.println(); 
        }
    }
}
