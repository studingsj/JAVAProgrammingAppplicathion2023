package first;

import java.util.Arrays;
import java.util.List;

public class CollectionDemo2 {
    public static void main(String[] args) {
        String[] soldiers = {"박민석123", "차병호12", "김상준1", "최열구"};

        //추가
        List<String> soldiers2 = Arrays.asList(soldiers);
        soldiers2.set(1, "성윤모");
//        soldiers2.add("지호진"); //배열을 list로 변경했므로 크기를 변경불가

        for (String s : soldiers2)
            System.out.print(s + " ");
        System.out.println();

        //정렬
        soldiers2.sort((s1,s2) -> s2.length() - s1.length());
        //배열로 다시 정의
        String [] soldiers3 = soldiers2.toArray(new String[0]);
        for (int i = 0; i< soldiers3.length; i++)
            System.out.print(soldiers3[i] + " ");
        System.out.println();

        List<String> grades = List.of("이병", "일병", "상병" , "병장"); //of()는 블변 --> set() 같은 크기를 변경못함
        grades.forEach(g -> System.out.print(g + " ")); //Consumer
    }
}
