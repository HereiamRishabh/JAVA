import java.io.*;

public class q1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the source file name: ");
        String fileName = br.readLine();

        File inputFile = new File(fileName);
        File vowelFile = new File("2105817_vowel.txt");
        File consonantFile = new File("2105817_consonant.txt");

        
        FileReader reader = new FileReader(inputFile);
        int[] vowelFreq = new int[5];
        int[] consonantFreq = new int[26];

        int c;
        while ((c = reader.read()) != -1) 
        {
            char ch = (char) c;
            ch = Character.toLowerCase(ch);
            if (isVowel(ch)) {
                vowelFreq[getIndex(ch)]++;
            } else if (Character.isLetter(ch)) {
                consonantFreq[ch - 'a']++;
            }
        }
        FileWriter vowelWriter = new FileWriter(vowelFile);
        FileWriter consonantWriter = new FileWriter(consonantFile);

        vowelWriter.write("A - " + vowelFreq[0] + "\n");
        vowelWriter.write("E - " + vowelFreq[1] + "\n");
        vowelWriter.write("I - " + vowelFreq[2] + "\n");
        vowelWriter.write("O - " + vowelFreq[3] + "\n");
        vowelWriter.write("U - " + vowelFreq[4] + "\n");

        for (int i = 0; i < 26; i++) {
            if (!isVowel((char) (i + 'a'))) {
                consonantWriter.write((char) (i + 'a') + " - " + consonantFreq[i] + "\n");
            }
        }

        reader.close();
        vowelWriter.close();
        consonantWriter.close();
    }
    public static boolean isVowel(char ch) {
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }
    public static int getIndex(char ch) {
        switch (ch) {
            case 'a':
                return 0;
            case 'e':
                return 1;
            case 'i':
                return 2;
            case 'o':
                return 3;
            case 'u':
                return 4;
            default:
                return -1;
        }
    }
}