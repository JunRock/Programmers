package CodingTestPractice;

import java.util.Arrays;
import java.util.Objects;

public class OX퀴즈 {
    public static void main(String[] args) {
        String[] quiz={"3 - 4 = -3", "5 + 6 = 11"};

        String[] solution = solution(quiz);
        for(int i=0;i< solution.length;i++)
            System.out.println(solution[i]);
    }

    public static String[] solution(String[] quiz) {
        String[] answer = {};
        String str1="";
        String str2="";
        int result;
        for(int i=0;i< quiz.length;i++){
            quiz[i]=quiz[i].replaceAll(" ","");
            String[] str=quiz[i].split("=");

            result= Integer.parseInt(str[1]); //결과 값
            if(str[0].contains("-")){
                String[] operAnd1=str[0].split("-");
                str1=operAnd1[0];
                str2=operAnd1[1];

               int sum = Integer.parseInt(String.valueOf(Integer.parseInt(str1) - Integer.parseInt(str2)));
               if(sum==result)
                   answer[i]="O";
               else
                   answer[i]="X";
            }

            if(str[0].contains("+")){
                String[] operAnd1=str[0].split("+");
                str1=operAnd1[0];
                str2=operAnd1[1];

                int sum = Integer.parseInt(Integer.parseInt(str1) + str[0]+Integer.parseInt(str2));
                if(sum==result)
                    answer[i]="O";
                else
                    answer[i]="X";
            }
        }
        return answer;
    }
}
