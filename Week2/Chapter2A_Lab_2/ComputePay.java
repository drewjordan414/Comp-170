public class ComputePay {
    public static void main(String[] args){
        // Calculate pay at work based on hours worked each day
        int hours = (4 + 5 + 8 + 4);
        System.out.println("My total hours worked: ");
        System.out.println(hours);
        double salary = 8.75;
        System.out.println("My hourly salary: ");
        System.out.println("$" + salary);
        double totalPay = hours * salary;
        System.out.println("My total pay: ");
        System.out.println(totalPay);
        double tax = totalPay * 0.20;
        System.out.println("My taxes owed: ");
        System.out.println(tax);  
    }
}
