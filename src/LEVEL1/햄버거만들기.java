package LEVEL1;

import java.util.*;

public class 햄버거만들기 {

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1};
        System.out.println(solution(arr));

    }

    public static int solution(int[] ingredient) {
        int answer=0;
        Stack<Integer> stack = new Stack<>();
        for (int i : ingredient) {
            stack.push(i);
            if (stack.size() >3) {
                if (stack.get(stack.size() - 4)==1
                        &&stack.get(stack.size() - 3)==2
                        &&stack.get(stack.size() - 2)==3
                        &&stack.get(stack.size() - 1)==1){
                    answer++;
                    stack.pop();stack.pop();stack.pop();stack.pop();
                }
            }
        }
        return answer;
    }
}
