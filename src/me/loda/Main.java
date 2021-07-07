package me.loda;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(filter(input));
    }

    public static String filter(String input){
        StringBuilder stringBuilder = new StringBuilder();
        for (char ch : input.toCharArray()){
            if (Character.isAlphabetic(ch)){
                stringBuilder.append(ch);
            }
        }

        return stringBuilder.toString();
    }
}
