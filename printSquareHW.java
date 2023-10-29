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
