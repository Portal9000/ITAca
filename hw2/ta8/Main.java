package by.hw2.ta8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String text = "Card Number 1234-5678-9101-1234 is false. Card Number 4321-8765-9324-1212 is true.";  // Изучаемая строка
        System.out.println(text);
        Pattern pattern = Pattern.compile("\\b\\d{4}-\\d{4}-\\d{4}-\\d{4}\\b");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}