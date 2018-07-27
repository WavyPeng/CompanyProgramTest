package netease.y2017;

import java.util.Scanner;

/**
 * Fibonacci数列
 * Created by WavyPeng on 2018/7/28.
 */
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a = 0, b = 1;
        while (b <= N){
            int temp = a+b;
            a = b;
            b = temp;
        }
        System.out.println((b-N)>(N-a)?(N-a):(b-N));
    }
}
