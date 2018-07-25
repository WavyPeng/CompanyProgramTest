package tencent.y2017;

import java.util.Scanner;

/**
 * 游戏任务标记
 * Created by WavyPeng on 2018/7/26.
 */
public class GameTaskMark {
    private static long[] mark = new long[32];

    private static int check(int firstTask,int secondTask){
        if(firstTask<0 || firstTask>=1024 || secondTask<0 || secondTask>=1024)
            return -1;

        int first_local_int = firstTask>>5; // 计算第一个任务位于哪个int
        int first_local_bit = firstTask&31;// 计算第一个任务位于int中的哪一位
        // 将第一个所在任务的位置标记位1
        mark[first_local_int] |= (1<<first_local_bit);


        int second_local_int = secondTask>>5; // 计算第二个任务位于哪个int
        int second_local_bit = secondTask&31; // 计算第二个任务位于int中的哪一位

        // 判断第二个任务是否完成
        if(((mark[second_local_int]>>second_local_bit)&1)==1)
            return 1;
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstTask = sc.nextInt();
        int secondTask = sc.nextInt();
        firstTask-=1;secondTask-=1;
        System.out.println(check(firstTask,secondTask));
    }
}
