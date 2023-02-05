package by.hw2.ta7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String text = "Alabama Tourism: Tripadvisor has 1,128,675 reviews of Alabama Hotels, Attractions," +
                "and Restaurants making it your best Alabama resource. assa sssa asass as-sa.";  // Изучаемая строка
        System.out.println(text);
        Pattern pattern = Pattern.compile("\\b[Aa][\\w-]+[Aa]\\b"); // В том числе и написанное капсом.
        Matcher matcher = pattern.matcher(text);
        System.out.println(matcher.find());
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}