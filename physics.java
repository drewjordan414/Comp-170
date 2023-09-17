// equation for finding the position s of a body in linear motion at any time t, given the initial position s0, initial velocity v0, and acceleration a
// s = s0 + v0t + 1/2at^2
// declare variables for s0, v0, a, and t
// compute s on the basis of these values

public class physics {
    public static void main(String[] args) {
    // declare variables
        // initial position
        double s0 = 0.0;  
        // initial velocity
        double v0 = 5.0;
        // acceleration  
        double a = 2.0;   
        // time
        double t = 3.0;
        // compute s
        double s = s0 + v0*t + 0.5*a*t*t;
        System.out.println("The position of the body at t is: " + s + " meters");
        
    }
}
