public class firstSecond2 {
    public static void main(String[] args){
        int first = 8, second = 19;
        first += second;
        second = first - second;
        first -= second;
        System.out.println(first);
        System.out.println(second);
    }
}
