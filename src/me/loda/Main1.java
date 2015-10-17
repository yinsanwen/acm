package me.loda;

import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        System.out.print(perfectNum(start,end));
    }

    public static int perfectNum(int start,int end){
        int count = 0;
        for(int i = start;i <= end; i++){
            if(isPerfectNum(i)){
                count++;
            }
        }
        return count;
    }

    private static boolean isPerfectNum(int num){
        if(num % 2 != 0){
            return false;
        }
        if(num % 3 != 0){
            return false;
        }
        if(num % 5 != 0){
            return false;
        }
        return true;
    }
}
