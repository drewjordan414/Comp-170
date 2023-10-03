package Quiz3A;
public class AddTwo {
    public static void main(String[] args) {
        int count = 5;
        addTwo(count);
        System.out.println(count);
        count = addTwo(count);
        System.out.println(count);
    }
    private static int addTwo(int count) {
        return count + 2;
    }
}
