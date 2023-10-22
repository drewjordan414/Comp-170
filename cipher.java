import java.util.Scanner;
public class cipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Your Message: ");
        String message = scanner.nextLine();

        System.out.print("Encoding key: ");
        int rotationKey = scanner.nextInt();

        String encodedMessage = encode(message, rotationKey);
        System.out.println("Encoded Message: " + encodedMessage);
    }

    public static String encode(String message, int rotationKey) {
        StringBuilder encoded = new StringBuilder();
        rotationKey = rotationKey % 26; 

        for (char ch : message.toCharArray()) {
            if (Character.isLetter(ch)) {
                char base = Character.isUpperCase(ch) ? 'A' : 'a';
                encoded.append((char) ((ch - base + rotationKey) % 26 + base));
            } else {
                encoded.append(ch);
            }
        }

        return encoded.toString();
    }

}
