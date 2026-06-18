package d4;

import java.util.ArrayList;
import java.util.List;

public class Ex1 {

    private static final int SIZE = 10_000_000;

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(SIZE);

        for (int i = 0; i < SIZE; i++) {
            list.add(i);
        }

        // 워밍업
        for (int i = 0; i < 5; i++) {
            normalFor(list);
            enhancedFor(list);
        }

        // 일반 for문
        long start = System.nanoTime();
        long result1 = normalFor(list);
        long end = System.nanoTime();

        System.out.println("일반 for문");
        System.out.println("합계 = " + result1);
        System.out.println("실행시간 = " + ((end - start) / 1_000_000.0) + " ms");

        // 향상된 for문
        start = System.nanoTime();
        long result2 = enhancedFor(list);
        end = System.nanoTime();

        System.out.println("\n향상된 for문");
        System.out.println("합계 = " + result2);
        System.out.println("실행시간 = " + ((end - start) / 1_000_000.0) + " ms");
    }

    private static long normalFor(List<Integer> list) {
        long sum = 0;

        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }

        return sum;
    }

    private static long enhancedFor(List<Integer> list) {
        long sum = 0;

        for (Integer value : list) {
            sum += value;
        }

        return sum;
    }
}