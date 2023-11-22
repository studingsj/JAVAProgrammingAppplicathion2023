package first;

import java.util.ArrayList;
import java.util.List;

public class CollectionDemo3 {
    public static void main(String[] args) {
        List<String> soldier = List.of("차병호","윤성모");
        System.out.println(soldier.contains("차병호"));
        System.out.println(soldier.contains("최일구"));
        System.out.println(soldier.indexOf("성윤모")); //위치 찾기

        //추가
        List<String> s1 = new ArrayList<>(soldier);
        s1.add("박민석");
        s1.add("김상훈");

        //삭제
        List<String> s2 = new ArrayList<>(soldier);
        s2.remove("성윤모");
        s2.add("지호진");      //s1에 없기때문에
        System.out.println(s1.containsAll(s2));

        s1.removeIf(r -> r.endsWith("석"));
        s1.replaceAll(x -> "신병 " + x);
        s1.forEach(s -> System.out.print(s + " ")); //Predicate
    }
}
