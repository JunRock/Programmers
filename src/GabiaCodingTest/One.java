package GabiaCodingTest;

import java.util.Arrays;
import java.util.Comparator;

public class One {
    public static void main(String[] args) {
        int[][]arr= {{3,40000},{5,60000}};
        int t=2;
        Arrays.sort(arr, Comparator.comparingInt((int[]o) -> o[0]));
        int money=0;
        int time=0;
        int count=0;
        int temp=0;
        for(int i=0;i<arr.length-1;i++){
            if(count==0) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i][1] != arr[j][1]) {
                        time = arr[j][0] - arr[i][0]; //분
                        money = arr[j][1] - arr[i][1];// 요즘
                        temp=arr[j][0];  //분
                        count++;
                        break;
                    } else break;
                }
            }
        }

        int time2=0;
        for(int i=time-1;i>0;i--){
            if(i*2>temp)
                time2=i;
            else break;
        }
        int t1=t;
        int t2=t;
        int maxMoney=0,minMoney=0;
        while(t1>=0){
            minMoney+=money;
            t1-=time;
        }

        while(t2>=0){
            maxMoney+=money;
            t2=t2-time2;
        }

        int min=Math.min(minMoney,maxMoney);
        int max=Math.max(minMoney,maxMoney);
        System.out.println(min+" "+max);
    }
}
