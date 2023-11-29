package first;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

//배열로부터 스트림 객체 생성
public class StreamDemo05 {
    public static void main(String[] args) {
        String[] fruits = {"키위", "딸기","바나나","수박"};
        Stream<String> fruitStream = Arrays.stream(fruits);
        fruitStream.forEach( f -> System.out.println(f));


        double[] numbers = {3.14, 2.71, 99.99, -9.123};
        DoubleStream doubleStream = Arrays.stream(numbers);
        doubleStream.forEach(System.out::println);

    }
}
