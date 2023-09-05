import java.util.Scanner;
public class BMI {

    // class-level variables
    private static double w;
    private static double h;
    private static double bmi;

    public static void main(String[] args) {
        calc();
    }
    public static void calc(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your weight in pounds: ");
        // take the users weight in pounds
        w = scanner.nextDouble();
        System.out.println("Enter your height in inches: ");
        // take the users height in inches
        h = scanner.nextDouble();
        // calculate the users BMI
        bmi = (w * 703) / (h * h);
        System.out.println("Your BMI is: " + bmi);
    }
}
