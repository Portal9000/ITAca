package by.hw2.ta6;
public class Main {
    public static void main(String[] args) {
        String word = "Жили у бабуси веселые гуси в количестве двух человек. Одинаковоо.";       // Изучаемая строка
        System.out.println(word);
        String[] words = word.split("[^а-яА-Яa-zA-z0-9-]");
        int countOfLetters = words[0].length();
        for (int i = 0; i < words.length; i++) {
            if (countOfLetters < words[i].length()) {
                countOfLetters = words[i].length();
            }
        }
        System.out.println("Самое длинное слово в строке:");
        for (int i = 0; i < words.length; i++) {
            if (countOfLetters == words[i].length()) {
                System.out.println(words[i]);
            }
        }
    }
}