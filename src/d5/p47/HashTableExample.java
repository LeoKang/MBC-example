package d5.p47;

import java.util.TreeSet;

public class HashTableExample {
    static void main() {
        TreeSet<Integer> scores = new TreeSet<>();
//        scores.add(new Integer(87));
        scores.add(87);
//        scores.add(new Integer(98));
//        scores.add(new Integer(75));
//        scores.add(new Integer(95));
//        scores.add(new Integer(80));
        scores.add(98);
        scores.add(75);
        scores.add(95);
        scores.add(80);

        Integer score;
        score = scores.first();
        System.out.println("가장 낮은 점수 : " + score);

        score = scores.last();
        System.out.println("가장 높은 점수 : " + score);

        score = scores.lower(95);
        System.out.println("95점 아래 점수 : " + score);

        score = scores.higher(95);
        System.out.println("95점보다 높은 점수 : " + score);

        score = scores.floor(95);
        System.out.println("95점이거나 바로 아래 점수 : " + score);

        score = scores.ceiling(85);
        System.out.println("85점이거나 바로 위 점수 : " + score + "\n");

        while (!scores.isEmpty()) {
            score = scores.pollFirst();
            System.out.println(score + "(남은 객체 수: " + scores.size() + ")");
        }
    }
}
