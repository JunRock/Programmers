package LEVEL1;

import java.util.*;

public class PersonalInfomation {
    public static void main(String[] args) {
        String today="2022.05.19";
        String[] terms={"A 6", "B 12", "C 3"};
        String[] privacies={"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
        System.out.println(Arrays.toString(solution(today, terms, privacies)));
    }

    public static int[] solution(String today, String[] terms, String[] privacies) {
        int[] answer = {};
        HashMap<String,Integer> term=new HashMap<>();
        List<String> list=new ArrayList<>();

        for (String string : terms) {  //계약 유지 범위 추가
            String[] s = string.split(" ");
            term.put(s[0], Integer.valueOf(s[1]));
        }

        list.addAll(Arrays.asList(privacies));  // 계약 일 및 계약 조건

        for(String str : list){
            String[] s=str.split(" ");
            String year= Arrays.toString(s[0].split("."));
        }
        return answer;
    }
}
