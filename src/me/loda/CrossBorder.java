package me.loda;

/**
 * Demo class
 *
 * @author yinsanwen
 * @date 2019/9/19
 */
public class CrossBorder {

    public static void main(String[] args) throws InterruptedException {

        int k = 0;
        for (int i = 0; i < 100; i++) {
            k = circlePlus(7,k);
            System.out.println(k);
            Thread.sleep(2000);
        }

    }

    public static int circlePlus(int capacity, int k){

        return (k + 1) % capacity;

    }
}
