package netease.y2017;

import java.util.Scanner;

/**
 * 解救小易
 * Created by WavyPeng on 2018/7/27.
 */
public class SaveXiaoYi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        while (sc.hasNext()){
            n = sc.nextInt();
            int[][] trap = new int[n][2];
            for(int i = 0;i < n;i++)
                trap[i][0] = sc.nextInt();
            for(int i = 0;i < n;i++)
                trap[i][1] = sc.nextInt();
            int step = (trap[0][0]+trap[0][1])-(1+1);
            int min = step;
            for(int i=1;i<n;i++){
                step = (trap[i][0]+trap[i][1])-(1+1);
                if(min > step)
                    min = step;
            }
            System.out.println(min);
        }
    }
}
