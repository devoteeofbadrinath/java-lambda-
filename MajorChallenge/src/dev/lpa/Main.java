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
        System.out.println(Arrays.toString(names));
        //ArrayList<String> list = List.copyOf(Arrays.asList(names));
        //list.replaceAll(s -> s.toLowerCase());
        //System.out.println(Arrays.toString(names));
        Arrays.setAll(names, i -> names[i] + " " + reverseString(names[i]));
        //System.out.println(reverseString(names[0]));
        System.out.println(Arrays.toString(names));
    }

    public static String reverseString(String input){
        String outputString="";
        for (int i = input.length()-1; i >= 0 ; i--) {
            outputString = outputString + input.charAt(i);
        }
        return outputString;
    }
}
