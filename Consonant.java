import java.util.Scanner;

public class ConsonantCounter {

    public static void main(String[] args) {
        // Create a Scanner object to read input from user
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user for a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        // Call the function to count consonants
        int consonantCount = countConsonants(input);
        
        // Print the result
        System.out.println("Number of consonants: " + consonantCount);
        
        // Close the scanner
        scanner.close();
    }

    // Function to count consonants in the given string
    public static int countConsonants(String str) {
        int count = 0;
        
        // Convert the string to lower case to handle case-insensitivity
        str = str.toLowerCase();
        
        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            // Check if the character is a letter and a consonant
            if (Character.isLetter(ch) && !isVowel(ch)) {
                count++;
            }
        }
        
        return count;
    }

    // Function to check if a character is a vowel
    public static boolean isVowel(char ch) {
        // Check if the character is a vowel (a, e, i, o, u)
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
//Output
//Enter a string: Hello World
//Number of consonants: 7
