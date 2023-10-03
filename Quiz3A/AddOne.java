package Quiz3A;
public class AddOne {
    public static void main(String[] args) {
        int count = 5;
        addOne(count);
        System.out.println(count);
    }
    private static void addOne(int count) {
        count = count + 1;
    }
}
