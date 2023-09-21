public class oddStuff {
    public static void main(String[] args){
        odd();
    }
    public static void odd() {
        int number = 4;
        for (int count = 1; count <= number; count++) {
            System.out.println(number);
            number = number / 2;
        }   
    }
}
