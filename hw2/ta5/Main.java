package by.hw2.ta5;
public class Main {
    public static void main(String[] args) {
        String word = "В словах \"сосиска\" и \"СССР\" по 3 буквы \"С\".";       // Изучаемая строка
        System.out.println(word);
        int count = 0;
        String[] words = word.split("[^а-яА-Яa-zA-z0-9-]");
        for (int i = 0, k = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                if (words[i].charAt(j) == 'с' || words[i].charAt(j) == 'С') {
                    k++;
                }
            }
            if (k >= 3) {
                count++;
            }
            k = 0;
        }
        System.out.println("Количество слов в строке в которых буква \"С\" встречается 3 и более раз равно " + count);
    }
}
