package dev.lpa;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Consumer<String> printTheParts = sentence -> {
            String[] parts = sentence.split(" ");
            for(String part : parts) {
                System.out.println(part);
            }
            };

        applyLambda("Badrinath Rameshwaram DwarkaDhish JagganathPuri", printTheParts);
        printTheParts.accept("Badrinath Rameshwaram DwarkaDhish JagganathPuri");

        
    }

    public static void applyLambda(String name,Consumer<String> consumer ){
        consumer.accept(name);
    }
}
