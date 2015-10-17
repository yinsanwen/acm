package me.loda;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.print(reverseInt(num1) + reverseInt(num2));
    }

    public static int reverseInt(int num){
        String strNum = String.valueOf(num);
        StringBuilder sb = new StringBuilder();
        char[] chars = strNum.toCharArray();
        for(int i = chars.length -1 ; i>=0; i--){
            sb.append(chars[i]);
        }
        return Integer.parseInt(sb.toString());



    }
}
