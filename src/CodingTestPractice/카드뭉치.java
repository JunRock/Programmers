package CodingTestPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class 카드뭉치 {
    public static void main(String[] args) {
        String[] cards1={"i", "water", "drink"};
        String[] cards2={"want", "to"};
        String[] goal={"i", "want", "to", "drink", "water"};
        System.out.println(solution(cards1,cards2,goal));
    }

    public static String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        List<String> card1 = Arrays.stream(cards1).collect(Collectors.toList());
        List<String> card2 = Arrays.stream(cards2).collect(Collectors.toList());
        for(int i=0;i<goal.length;i++){
            if(!card1.isEmpty()&&card1.get(0).equals(goal[i]))
                card1.remove(0);
            else if(!card2.isEmpty()&&card2.get(0).equals(goal[i]))
                card2.remove(0);
            else {
                answer="no";
                return answer;
            }
        }
        return answer;
    }
}
