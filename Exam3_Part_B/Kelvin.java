package Exam3_Part_B;

public class Kelvin {
    
    public static final double ZEROC_IN_KELVIN = 273.15;
   

    private double kelvin; 
   
    public Kelvin() {
        this.kelvin = 0;
    }

    /** 
     * @param k - 
     */
    public Kelvin(double k) {
        if (k < 0) {
            throw new IllegalArgumentException("Temperature cannot be less than 0 Kelvin");
        }
        this.kelvin = k;
    }

    
    public double getKelvin() {
        return kelvin;
    }

   
    public double getCelsius() {
        return kelvin - ZEROC_IN_KELVIN;
    }

    
    public double getFahrenheit() {
        return getCelsius() * 9 / 5 + 32;
    }
}
