import java.util.Scanner;
public class colors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What color do you want? ");
        String originalInput = scanner.nextLine().trim();

        // For debugging purposes: Display the length of the input
        System.out.println("Input length: " + originalInput.length());

        String uppercasedInput = originalInput.toUpperCase();

        if ("B".equals(uppercasedInput)) {
            System.out.println("You have chosen Blue.");
        } else if ("G".equals(uppercasedInput)) {
            System.out.println("You have chosen Green.");
        } else if ("R".equals(uppercasedInput)) {
            System.out.println("You have chosen Red.");
        } else {
            System.out.println("Unknown color: " + originalInput);
        }
    }
}
