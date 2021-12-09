package com.learning;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        String text = "Java text input here string String TEXT hello java world STRING input";
        printCountWordsInText(text);
    }

    /**
     * calculate count words in text
     * @param text input text for calculate
     */
    private static void printCountWordsInText(String text) {
        Map<String, Integer> mapCountWords = new HashMap<>();
        text = text.toLowerCase();
        String[] wordsFromText = text.split(" ");

        for (String word: wordsFromText) {
            if (mapCountWords.containsKey(word)) {
                mapCountWords.put(word, mapCountWords.get(word) + 1);
            } else {
                mapCountWords.put(word, 1);
            }
        }

        for (Map.Entry<String, Integer> entry: mapCountWords.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
