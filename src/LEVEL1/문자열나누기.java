package LEVEL1;

import java.util.HashMap;
import java.util.Map;

public class 문자열나누기 {
    public static void main(String[] args) {
        System.out.println(run("aaabbbabaab"));
    }

    public static int run(String s){
        int count=0;
        while (!s.isBlank()) {
            int i = 0;
            int cnt1 = 0;
            int cnt2 = 0;

            char c1 = s.charAt(0);
            cnt1++;
            for (i = 1; i < s.length(); i++) {
                if (c1 == s.charAt(i))
                    cnt1++;
                else
                    cnt2++;


                if(i==s.length()-1){
                    count++;
                    return count;
                }
                if (cnt1 == cnt2) {
                    s = s.substring(i + 1, s.length());
                    count++;
                    break;
                }
            }
            if(s.length()==1){
                count++;
                break;
            }
        }
        return count;
    }
}
