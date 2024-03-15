package org.howard.edu.lsp.midterm.question1;

/**
 * This class provides functionality to manipulate a given message.
 * It removes whitespace and punctuation from the message and then separates
 * the characters into two separate strings: one containing characters
 * at even indices and the other containing characters at odd indices.
 */
public class question1 {

    /**
     * The main method of the class. It demonstrates the functionality of the class
     * by manipulating a given message.
     *
     * @param args command-line arguments (not used in this method)
     */
    public static void main(String[] args) {
        // Given message
        String message = "I love, CSCI 363!!!!";

        // Remove whitespace and punctuation from the message
        message = message.replaceAll("\\s", "");
        message = message.replaceAll("\\p{Punct}", "");
        System.out.println(message);

        // Separate characters into even and odd indices
        String even_message = "";
        String odd_message = "";

        int count = 0;
        System.out.println(message.length());
        while (count < message.length()) {
            System.out.println(message.charAt(count));

            if (count % 2 == 0) {
                even_message += message.charAt(count);
            } else {
                odd_message += message.charAt(count);
            }

            count += 1;
        }
        // Print the result (even characters followed by odd characters)
        System.out.println(even_message + odd_message);
    }
}
