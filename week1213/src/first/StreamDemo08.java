package first;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo08 {
    public static void main(String[] args) {
        List<Fruit> fruitList = Arrays.asList(
                new Fruit("watermelon",16000),
                new Fruit("watermelon",19000),
                new Fruit("strawberry",10000),
                new Fruit("banana",13000),
                new Fruit("kiwi",6000)
        );

        Stream<Fruit> st = fruitList.stream();
        st.sorted().forEach(f -> System.out.println(f.getName()+ " " + f.getPrice()));
        st.sorted(Fruit::compareTo).forEach(f -> System.out.println(f.getName()+ " " + f.getPrice())); //오름차
//        st.sorted((n1, n2) -> n2.compareTo(n1)).forEach(f -> System.out.println(f.getName()+ " " + f.getPrice())); //내림차

//        st.sorted(Comparator.reverseOrder()).forEach(f -> System.out.println(f.getName()+ " " + f.getPrice())); //내림차
//        st.sorted(Comparator.naturalOrder()).forEach(f -> System.out.println(f.getName()+ " " + f.getPrice())); //오름차


//        List<Integer> number = Arrays.asList(1,2,3,4,5);
//        Stream<Integer> st = number.stream();
//        st.sorted().forEach(f -> System.out.println(f + " ")); //오름차순
////        st.sorted((n1, n2) -> n2 - n1).forEach(f -> System.out.println(f + " ")); //내림차순
    }
}
