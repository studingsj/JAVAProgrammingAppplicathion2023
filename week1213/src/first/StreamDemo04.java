package first;

import java.util.stream.IntStream;

//숫자로부터 스트림 객체 생성
public class StreamDemo04 {
    private static int result;

    public static void main(String[] args) {
        IntStream st = IntStream.rangeClosed(1,10);
//        st.forEach(System.out::println);                  //매개변수 안 사용하는 방법 (매소드 레퍼런스)
//        st.forEach(number -> System.out.println(number)); //매개변수 사용하는 방법
        //람다식으로...?
        st.forEach( n -> result += n);
        System.out.println(result);
    }
}
