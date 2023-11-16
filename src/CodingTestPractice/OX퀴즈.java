package CodingTestPractice;

import java.util.Arrays;
import java.util.Objects;

public class OX퀴즈 {
    public static void main(String[] args) {
        String[] quiz={"1 + -9 = -8", "4 + -5 = 0"};

        String[] solution = solution(quiz);
        for(int i=0;i< solution.length;i++)
            System.out.println(solution[i]);
    }

    public static String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        int result;
        int sum = 0;
        for(int i=0;i< quiz.length;i++){
            String[] str=quiz[i].split("= ");
            result= Integer.parseInt(str[1]); //결과 값
            String[] operator=str[0].split(" ");
            if(operator[1].equals("+")){
                sum= Integer.parseInt(String.valueOf(Integer.parseInt(operator[0]) + Integer.parseInt(operator[2])));
            }
            if(operator[1].equals("-")){
                sum= Integer.parseInt(String.valueOf(Integer.parseInt(operator[0]) - Integer.parseInt(operator[2])));
            }

            if(result==sum)
                answer[i]="O";
            else
                answer[i]="X";
        }
        return answer;
    }
}
