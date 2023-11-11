public class PAavenue {
    public static void main(String[] args) {
        for (int num = 1000; num <= 9999; num++) {
            int thousands = num / 1000; 
            int hundreds = (num % 1000) / 100; 
            int tens = (num % 100) / 10; 
            int ones = num % 10; 

          
            if (thousands != hundreds && thousands != tens && thousands != ones
                    && hundreds != tens && hundreds != ones && tens != ones
                    && thousands == 2 * tens && num % 2 == 0 && (thousands + hundreds + tens + ones) == 25) {
                System.out.println("The address where the Riddler plans to strike is: " + num);
            }
        }
    }
}
