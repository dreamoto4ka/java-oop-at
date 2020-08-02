package task1;

import java.util.*;

public class Cat {
    public static void main(String[] args){
        List<String> words = Arrays.asList(
                "Angel", "Sonya", "Luna", "Watson", "Oscar",
                "Felix", "Chester", "Jasper", "Max", "Kitty",
                "Felix", "Felix", "Angel"
        );

        Set<String> unique = new HashSet<String>(words);

        System.out.println("Первоначальный массив");
        System.out.println(words.toString());
        System.out.println("Уникальные слова");
        System.out.println(unique.toString());
        System.out.println("Частота встречаемости слов");
        for (String key : unique) {
            System.out.println(key + ": " + Collections.frequency(words, key));
        }
    }
}
