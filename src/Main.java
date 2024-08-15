import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> words = Arrays.asList(
                "яблоко", "банан", "апельсин", "яблоко",
                "киви", "банан", "груша", "апельсин",
                "груша", "яблоко", "манго", "киви",
                "ананас", "манго", "виноград", "мандарин",
                "яблоко", "банан", "груша", "виноград"
        );

        Set<String> uniqueWords = new HashSet<>(words);

        Map<String, Integer> wordCounts = new HashMap<>();
        for (String word : words) {
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }

        System.out.println("Уникальные слова: " + uniqueWords);
        System.out.println("Количество вхождений каждого слова: " + wordCounts);
    }
}