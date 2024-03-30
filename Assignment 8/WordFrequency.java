import java.util.Scanner;

public class WordFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        String[] words = input.split("\\s+");


        int[] frequencies = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            frequencies[i] = 1; 
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equalsIgnoreCase(words[j])) {
                    frequencies[i]++; 
                    words[j] = ""; 
                }
            }
        }

        System.out.println("Word frequencies:");
        for (int i = 0; i < words.length; i++) {
            if (!words[i].isEmpty()) {
                System.out.println(words[i] + ": " + frequencies[i]);
            }
        }

        scanner.close();
    }
}
