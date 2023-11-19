package Word_Count_HW;
import java.io.*;

public class WordCount {
    public static void main(String[] args) {
        try {
            // Replace this with the direct path to your 'hamlet.txt' file
            File file = new File("Word_Count_HW\\hamlet.pdf"); 
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            int wordCount = 0;
            int lineCount = 0;
            int charCount = 0;

            while ((line = bufferedReader.readLine()) != null) {
                lineCount++;
                if (!line.trim().isEmpty()) {
                    String[] words = line.split("\\s+");
                    wordCount += words.length;
                    for (String word : words) {
                        charCount += word.length();
                    }
                }
            }

            System.out.println("Number of words: " + wordCount);
            System.out.println("Number of lines: " + lineCount);
            System.out.println("Number of characters (excluding whitespace): " + charCount);

            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
