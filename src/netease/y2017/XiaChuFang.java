package netease.y2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

/**
 * 下厨房
 * Created by WavyPeng on 2018/7/28.
 */
public class XiaChuFang {
    public static void main(String[] args) {
        try{
            HashSet<String> set = new HashSet<>();
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str = br.readLine();
            while(str!=null){
                String[] arr = str.trim().split(" ");
                for(String s:arr){
                    set.add(s);
                }
                str = br.readLine();
            }
            System.out.println(set.size());
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
