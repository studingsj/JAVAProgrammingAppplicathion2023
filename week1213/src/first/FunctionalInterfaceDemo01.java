package first;

import java.util.function.*;

//함수적 인터페이스
//type          parameter(매개변수)       return value    method
//Predicate     o                        boolean         test()
//Supplier      x                        o               get()
//Consumer      o                        void            accept()
//Function      o                        o               apply()
//Operator      o                        o               apply()
public class FunctionalInterfaceDemo01 {

    public static void main(String[] args) {

        Function <Integer, Integer> f1 = n ->n+8;
        System.out.println(f1.apply(7));

        ToDoubleBiFunction<String, Integer> f2 = (pi, radius ) -> Double.parseDouble(pi) * radius *radius;
        double area = f2.applyAsDouble("3.14", 10);

        BiConsumer<Integer , Integer> c2 = (n1,n2) -> {
            System.out.println(n1 + n2);
            System.out.println(n1 * n2);
        };
        c2.accept(7,8);

        //입력값은 있는데 리턴이 없다.
        Consumer<String> c1 = n -> {
            System.out.println(n.toUpperCase());
            System.out.println(n.toLowerCase());
        };
        c1.accept("Hello JAVA~");

        Supplier<Double> s1 = () -> 2.71;
        System.out.println(s1.get());

        IntSupplier s2 = () -> {
            System.out.println("주사위를 굴립니다.");
            return (int) (Math.random() * 6) + 1;
        };

        Predicate<String> p = Predicate.isEqual("test");
        System.out.println(p.test("test"));
        System.out.println(p.test("java"));

        IntPredicate odd = x -> x %2 == 1;
        System.out.println(odd.test(10) ? "홀수" : "짝수");
    }
}
