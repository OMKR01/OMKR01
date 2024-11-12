import java.util.Scanner;

public class CharacterSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Prompt the user to enter a character to search for
        System.out.print("Enter a character to search for: ");
        char searchChar = scanner.next().charAt(0);

        // Call the method to count occurrences and display the result
        int count = countOccurrences(inputString, searchChar);
        System.out.println("The character '" + searchChar + "' appears " + count + " times in the string.");

        scanner.close();
    }

    // Method to count occurrences of a character in a string
    public static int countOccurrences(String str, char ch) {
        int count = 0;
        
        // Loop through the string and count occurrences of the character
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        
        return count;
    }
}