package me.load;

/**
 * Demo class
 *
 * @author yinsanwen
 * @date 2019-08-22
 */
public class SwitchAB {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("交换前:a="+a+";b="+b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("交换后:a="+a+";b="+b);

    }

}
