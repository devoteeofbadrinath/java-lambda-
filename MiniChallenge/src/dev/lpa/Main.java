package dev.lpa;

import java.util.Arrays;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Consumer<String> printWords = new Consumer<String>() {
            @Override
            public void accept(String s) {
                String[] parts = s.split(" ");
                for(String part : parts) {
                    System.out.println(part);
                }

            }
        };

        Consumer<String> printWordsLambda = sentence -> {
            String[] parts = sentence.split(" ");
            for(String part : parts) {
                System.out.println(part);
            }
            };

        printWords.accept("Let's split this up into an array");
        printWordsLambda.accept("Let's split this up into an array");

        Consumer<String> printWordsForEach = sentence -> {
            String[] words = sentence.split(" ");
            //Arrays.stream(words).toList().forEach(s -> System.out.println(s));
            Arrays.asList(words).forEach(s -> System.out.println(s));

        };
        printWordsForEach.accept("Let's split this up into an array");

        Consumer<String> printWordsConcise = sentence -> {
            Arrays.asList(sentence.split(" ")).forEach(s -> System.out.println(s));
        };
        printWordsForEach.accept("Let's split this up into an array");

    }

    public static void applyLambda(String name,Consumer<String> consumer ){
        consumer.accept(name);
    }
}
