package CodingTestPractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class ManyPresent {
    public static void main(String[] args) {
        String[] friends = {"muzi", "ryan", "frodo", "neo"};
        String[] gifts = {"muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"};
        System.out.println(solution(friends, gifts));
    }

    public static int solution(String[] friends, String[] gifts) {
        int[][] giftRecord = new int[friends.length][friends.length];
        Map<String, Integer> people = new HashMap<>();
        int[] result = new int[friends.length];
        int num = 0;

        for (String str : friends) {
            people.put(str, num++);
        }

        Arrays.stream(gifts).map(s -> s.split(" "))
                .forEach(str -> {
                    result[people.get(str[0])]++; //선물 준 사람
                    result[people.get(str[1])]--;
                    giftRecord[people.get(str[0])][people.get(str[1])]++;
                });

        return IntStream.range(0, friends.length)
                .map(i -> (int) IntStream.range(0, friends.length)
                        .filter(j -> i != j && giftRecord[i][j] > giftRecord[j][i] ||
                                (giftRecord[i][j] == giftRecord[j][i]) && (result[i] > result[j]))
                        .count()
                )
                .max()
                .orElse(0);
    }
}
