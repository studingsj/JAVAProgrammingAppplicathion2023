package first;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo01 {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("서울", "부산", "광주", "부산", "서울", "경기", "대전", "대구", "서울", "부산");

        //Old style
        //외부 반복자는 시간이 오래걸림
        Iterator<String> it = cities.iterator();
        while (it.hasNext()){
            String city = it.next();
            System.out.print(city + " ");
        }

        System.out.println();

        //Modern style
        //자료구조랑 개발자 코드 분리
        //내부 반복자를 사용하는 이유 -> 병렬처리가 용이 (시간이 단축)
        Stream<String> stream = cities.stream();
        // Stream<String> stream = cities.parallelStream(); //병렬처리 -> 큰 데이터 처리의 용이
        stream.forEach (city -> System.out.print(city + " ")); //Consumer

    }
}
