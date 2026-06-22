package d5.p43;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Student, Integer> map = new HashMap<>();
        map.put(new Student(1, "홍길동"), 95);
        map.put(new Student(1, "홍길동"), 96);

        System.out.println("총 Entry 수 : " + map.size());
        Student s = new Student(1, "홍길동");
        System.out.println(map.get(s));
    }
}

