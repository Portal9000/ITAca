package by.hw2.ta9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String text = "Alabama Tourism: Tripadvisor has 1,128,675 reviews of Alabama Hotels, Attractions," +
                "and Restaurants making it your best Alabama resource.";  // Изучаемая строка
        System.out.println(text);
        Pattern pattern = Pattern.compile("\\bAlabama\\b");            // Искомое слово
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group() + " - first character index: " + matcher.start());
        }
    }
}