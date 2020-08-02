package collectionTask_2;

import java.util.*;

class MainClass {
    public static void main(String[] args){
        List<String> words = Arrays.asList(
                "Мария","Олег","Стас","Никита", "Стас", "Стас", "Алина", "Валентина", "Руслан", "Оля", "Ян", "Яна", "Яна", "Яна", "Владислав", "Оля", "Оля", "Оля", "Оля", "Оля"
        );

        Set<String> unique = new HashSet<String>(words);

        System.out.println("Первоначальный массив:\n" + words.toString());
        System.out.println("Уникальные слова:\n" + unique.toString());
        System.out.println("Частота встречаемости слов:");
        for (String key : unique) {
            System.out.println(key + ": " + Collections.frequency(words, key));
        }
    }
}
