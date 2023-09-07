package LEVEL1;

import java.util.Vector;

public class SmallSizeString {
    public static void main(String[] args) {
        String t="500220839878";
        String p="7";
        solution(t,p);
    }

    public static int solution(String t, String p) {
        int answer = 0;
        for(int i=0;i<=t.length()-p.length();i++){
            String str=t.substring(i,i+p.length());
            if(Long.parseLong(p)>=Long.parseLong(str))
                answer++;
        }
        return answer;
    }
}
