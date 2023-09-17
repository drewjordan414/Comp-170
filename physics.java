// housekeeping
import java.util.Scanner;

public class physics {
    public static void main(String[] args) {
    // declare variables
        // initial position
        double s0;  
        // initial velocity
        double v0;
        // acceleration  
        double a;   
        // time
        double t;

        Scanner scanner = new Scanner(System.in);

        // aks user for values
        System.out.print("Enter time (t) in seconds: ");
        t = scanner.nextDouble();
        
        System.out.print("Enter initial position (s0) in meters: ");
        s0 = scanner.nextDouble();
        
        System.out.print("Enter initial velocity (v0) in m/s: ");
        v0 = scanner.nextDouble();

        System.out.print("Enter acceleration (a) in m/s^2: ");
        a = scanner.nextDouble();

        // compute s
        double s = s0 + v0*t + 0.5*a*t*t;
        System.out.println("The position of the body at t is: " + s + " meters");
        
    }
}
