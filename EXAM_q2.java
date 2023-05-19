import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class q2 {

    public static void main(String[] args) {

        String sourceFile = "2105817.txt";
        String vowelsFile = "2105817_vowel.txt";
        String consonantsFile = "2105817_consonant.txt";

        Map<Character, Integer> vowelFreq = new TreeMap<>();
        Map<Character, Integer> consonantFreq = new TreeMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\KIIT\\Desktop\\JAVA\\2105817.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                for (char c : line.toCharArray()) {
                    if (Character.isLetter(c)) {
                        c = Character.toLowerCase(c);
                        if (isVowel(c)) {
                            vowelFreq.put(c, vowelFreq.getOrDefault(c, 0) + 1);
                        } else {
                            consonantFreq.put(c, consonantFreq.getOrDefault(c, 0) + 1);
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileWriter writer = new FileWriter("C:\\Users\\KIIT\\Desktop\\JAVA\\2105817_vowels.txt")) {
            for (char c : vowelFreq.keySet()) {
                writer.write(c + "-" + vowelFreq.get(c) + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileWriter writer = new FileWriter("C:\\Users\\KIIT\\Desktop\\JAVA\\2105817_consonants.txt")) {
            for (char c : consonantFreq.keySet()) {
                writer.write(c + "-" + consonantFreq.get(c) + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}