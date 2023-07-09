package LEVEL1;
import java.util.*;
public class Reapply {
    static public void solution(int n, int m, int[] section) {
        int[]arr=new int[n+1];
        int count=0;
        int num=0;

        for(int i=1;i<=n;i++)
            arr[i]=1;

        for(int i=0;i<section.length;i++){
            int index=section[i];
            arr[index]=0;
        }

        for(int i=1;i<=n;i++){
            if(arr[i]==0){
                num=i;
                for(int j=0;j<m;j++){
                        arr[num]=1;
                    if(num==n)
                        break;
                    num++;
                }
                count++;
            }
        }

        System.out.println(count);
       /* int answer = 0;
        return answer;*/
    }

    public static void main(String[] args) {
        int[] section={1,2,5};
        solution(5,2,section);
    }
}
