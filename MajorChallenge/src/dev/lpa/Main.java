package dev.lpa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.IntFunction;

public class Main {

    private static Random random = new Random();
    public static void main(String[] args) {
        String[] names = {"bAdRiNatH","RamEShwArAM","DwaRKADhisH","JaggaNaTHPURI","bOb","ShIVAm","DeVEd"};
        Arrays.setAll(names, i -> names[i].toUpperCase());
        System.out.println("--> Transform to UpperCase");
        System.out.println(Arrays.toString(names));

        List<String> backedByArray = Arrays.asList(names);
        backedByArray.replaceAll(s -> s += " "  + getRandomChar('A', 'D') + ".");
        System.out.println("--> Add random middle initial");
        System.out.println(Arrays.toString(names));

        backedByArray.replaceAll(s -> s += " " + getReversedName(s.split(" ")[0]) );
        System.out.println("--> Add reversed name as last name");
        Arrays.asList(names).forEach(s -> System.out.println(s));

        List<String> newList = new ArrayList<>(List.of(names));
        newList.removeIf(s -> s.substring(0, s.indexOf(" ")).equals(s.substring(s.lastIndexOf(" ") + 1)));
        //backedByArray.removeIf(s -> s.substring(0, s.indexOf(" ")).equals(s.substring(s.lastIndexOf(" ") + 1)));
        System.out.println("--> Remove names where first = last");
        System.out.println("--> Remove names where first = last");
        newList.forEach(s -> System.out.println(s+s));

    }

    public static String reverseString(String input){
        String outputString="";
        for (int i = input.length()-1; i >= 0 ; i--) {
            outputString = outputString + input.charAt(i);
        }
        return outputString;
    }

    public static char getRandomChar(char startChar, char endChar){
        return (char)random.nextInt((int) startChar, (int) endChar + 1);
    }

    public static String getReversedName(String firstName){
        return new StringBuilder(firstName).reverse().toString();
    }
}
