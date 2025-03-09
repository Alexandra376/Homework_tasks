import java.io.*;
import java.util.*;

public class WordProcessor {
    private Map<String, Integer> wordCounts = new HashMap<>();

    public void processFile(String filename) throws IOException {
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(filename);
        if (inputStream == null) {
            throw new FileNotFoundException("Файл не найден: " + filename);
        }

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.toLowerCase().split("\\s+");
                for (String word : words) {
                    wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
                }
            }
        }
    }

    public void printStatistics() {
        System.out.println("\nСтатистика по частоте встречаемости слов:");
        List<Map.Entry<String, Integer>> sortedWords = new ArrayList<>(wordCounts.entrySet());

        sortedWords.sort(Comparator.comparing(Map.Entry::getKey));

        for (Map.Entry<String, Integer> entry : sortedWords) {
            System.out.printf("%-15s %d%n", entry.getKey(), entry.getValue());
        }
    }

    public void findMostFrequentWord() {
        if (wordCounts.isEmpty()) {
            System.out.println("Файл пуст или не содержит слов.");
            return;
        }

        String maxWord = Collections.max(wordCounts.entrySet(),
                        Comparator.comparing(Map.Entry::getValue))
                .getKey();

        System.out.println("\nСлово с максимальным количеством повторений:");
        System.out.printf("%s (%d раз)%n", maxWord, wordCounts.get(maxWord));
    }

    public static void main(String[] args) {
        WordProcessor processor = new WordProcessor();

        try {
            processor.processFile("example.txt");
            processor.printStatistics();
            processor.findMostFrequentWord();
        } catch (IOException e) {
            System.err.println("Ошибка чтения файла: " + e.getMessage());
        }
    }
}
