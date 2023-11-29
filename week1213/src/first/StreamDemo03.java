package first;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo03 {
    public static void main(String[] args) {
        List<Fruit> fruitList = Arrays.asList(
                new Fruit("watermelon",16000),
                new Fruit("watermelon",19000),
                new Fruit("strawberry",10000),
                new Fruit("banana",13000),
                new Fruit("kiwi",6000)
        );

        //출력을 위한 코드
//        fruitList.stream().forEach(f -> {
//            String name = f.getName();
//            int price = f.getPrice();
//            System.out.println(name + " : " + price);
//        });

        //과일들의 평균 구하기
        System.out.println(
                fruitList
                        .stream()
                        //.mapToInt(f -> f.getPrice()) //람다식으로 매소드값 리턴
                        .mapToInt(Fruit::getPrice)     //*매소드 레퍼런스*
                        .average()
                        .getAsDouble()                 //double로 변환
        );
    }
}
