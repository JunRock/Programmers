package LEVEL1;

import java.util.ArrayList;
import java.util.List;

public class 둘만의암호 {
    public static void main(String[] args) {
        solution("aukks", "wbqd", 5);
    }

    public static String solution(String s, String skip, int index) {
        List<Character> alpabet = new ArrayList<>();
        int temp;
        int count;
        String answer = "";
        String ch="";
        for (int i = 'a'; i <= 'z'; i++) //알파벳 초기화
            alpabet.add((char) i);

        for (int i = 0; i < s.length(); i++) {
            temp = alpabet.indexOf(s.charAt(i))+1;
            count=0;
            while(count!=index){
                if(temp==alpabet.size())
                    temp=0;
                else{
                    ch= String.valueOf(alpabet.get(temp++));
                    if(skip.contains(ch)){
                        continue;
                    }
                    count++;
                }
            }
            answer=answer.concat(ch);
        }
        return answer;
    }
}
