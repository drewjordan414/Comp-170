// This program computes the total amount owed for a meal,
// assuming 8% tax and a 15% tip.
public class Receipt {
    public static void main(String[] args) {
        int subtotal = 38 + 40 + 30;
        System.out.println("Subtotal: ");
        System.out.println(subtotal);
        double tax = subtotal * .08;
        System.out.println("Tax:");
        System.out.println(tax);
        double tip = subtotal * .15;
        System.out.println("Tip:");
        System.out.println(tip);
        double total  = subtotal + tax + tip;
        System.out.println("Total:");
        System.out.println(total);
    }
}