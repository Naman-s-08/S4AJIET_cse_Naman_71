import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        findDuplicates(input);
        
        scanner.close();
    }

    public static void findDuplicates(String str) {
        // Create a HashMap to store characters and their counts
        Map<Character, Integer> charMap = new HashMap<>();

        // Convert string to char array and iterate
        char[] characters = str.toCharArray();

        for (char c : characters) {
            // Ignore spaces if you don't want to count them as duplicates
            if (c == ' ') continue;

            if (charMap.containsKey(c)) {
                charMap.put(c, charMap.get(c) + 1);
            } else {
                charMap.put(c, 1);
            }
        }

        // Iterate through the map to print characters with count > 1
        System.out.println("Duplicate characters in \"" + str + "\":");
        boolean found = false;
        for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " : " + entry.getValue() + " times");
                found = true;
            }
        }

        if (!found) {
            System.out.println("No duplicate characters found.");
        }
    }
}
