// Q3:Write a Java Program to count the number of words in a string using HashMap.

import java.util.HashMap;
import java.util.StringTokenizer;

public class Question3 {
    public static void main(String[] args) {
        String sentence = "word count program to count word.";
        HashMap<String, Integer> wordCountMap = new HashMap<>();
        StringTokenizer tokenizer = new StringTokenizer(sentence);
        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken().replaceAll("[^a-zA-Z]", "").toLowerCase();
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }
        System.out.println("Word counts:");
        wordCountMap.forEach((word, count)->System.out.println(word+": "+count));
    }
}
