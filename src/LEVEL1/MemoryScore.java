package LEVEL1;

import java.util.*;

public class MemoryScore {

    public static void main(String[] args) {
        int[][] v = {{1, 4}, {3, 4}, {3, 10}};
        int[] solution = solution(v);
        System.out.print(solution[0]+","+solution[1]);
    }

    public static int[] solution(int[][] v) {
        int[] answer = new int[2];
        int x=0,y=0;
        Vector<Integer> vector=new Vector<>();
        for(int i=0;i<3;i++){
            vector.add(v[i][0]);
        }
       if(vector.get(0)==vector.get(1)){
           vector.clear();
       }
        return answer;
    }
}
