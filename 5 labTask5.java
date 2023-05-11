import java.io.Console;

class Task5 {
    public static void main(String[] args) {
        Console io = System.console();
        
        System.out.print("Write a word: ");
        String word = io.readLine().trim();

        if (isPalindrome(word)) {
            System.out.println("\nThe word '" + word + "' is a palindrome!");
        } else {
            System.out.println("\nThe word '" + word + "' is NOT a palindrome!");
        }
    }

    public static boolean isPalindrome(String word) {
        String wordLowerCase = word.toLowerCase();
        int halfLength = wordLowerCase.length() / 2;
        int lastIndex = wordLowerCase.length() - 1;

        for (int i = 0; i < halfLength; i++) {
            if (wordLowerCase.charAt(i) != wordLowerCase.charAt(lastIndex - i)) {
                return false;
            }
        }

        return true;
    }
}
