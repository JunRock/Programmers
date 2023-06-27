package LEVEL1;
import java.util.*;

public class Running {
    public static String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<players.length;i++){
            map.put(players[i],i);
        }

        for(int i=0;i< callings.length;i++){
           int index=map.get(callings[i]);
           String tmp=players[index];
           players[index]=players[index-1];
           players[index-1]=tmp;
           map.put(callings[i],index-1);
           map.put(players[index],index);
        }
      for(Map.Entry<String,Integer>entry:map.entrySet()){
          answer[entry.getValue()]=entry.getKey();
      }

        return answer;
    }

    public static void main(String[] args) {
        String[] players={"mumu", "soe", "poe", "kai", "mine"};
        String[] calling={"kai", "kai", "mine", "mine"};
        String[]answer=solution(players,calling);

        for(int i=0;i< answer.length;i++)
            System.out.println(answer[i]);
    }
}
