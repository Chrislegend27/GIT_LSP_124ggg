package org.howard.edu.lsp.hw2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.LinkedHashSet;


public class WordCounting {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/org/howard/edu/lsp/hw2/words.txt");
        Set<String> uniqueWords = new LinkedHashSet<>();
        Map<String, Integer> wordFrequency = new HashMap<>();

        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            String word = scanner.next();
            word = word.replaceAll("[^a-zA-Z]", ""); // Remove non-alphabetic characters and replace with blank space.
            word = word.toLowerCase(); //Makes word lowercase
            if (!word.isEmpty() && word.length() > 3) { //Also Removes insignificant words.
                uniqueWords.add(word);
                wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
            }

        }

        for (String uniqueWord : uniqueWords) {
            System.out.println(uniqueWord + " - " + wordFrequency.get(uniqueWord));
        }
    }
}
