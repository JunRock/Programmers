package LEVEL2;

import java.util.List;
import java.util.stream.IntStream;

public class FindBigNumber {

    public static void main(String[] args) {

        int[] list = {9, 1, 5, 3, 6, 2};

        List<Integer> collect = IntStream.range(0, list.length)
            .mapToObj(i -> IntStream.range(i + 1, list.length)
                .filter(j -> list[i] < list[j])
                .mapToObj(j -> list[j])
                .findFirst()
                .orElse(-1)
            )
            .toList();

        System.out.print("[");
        for(int i = 0; i < collect.size(); i++) {
            if (i == collect.size() - 1) {
                System.out.print(collect.get(i));
                break;
            }
            System.out.print(collect.get(i) + ",");
        }
        System.out.print("]");
    }
}
