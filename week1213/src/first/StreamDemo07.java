package first;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

//파일로부터 스트림 객체 생성
public class StreamDemo07 {
    public static void main(String[] args) {

        try {

            Path path = Paths.get("C:/IntelliJ IDEA 2022.3.3/Java_Study/week1213/src/first/java.txt");
            Stream<String> st;

            //Files로 하는법
            //modern style
            st = Files.lines(path, Charset.defaultCharset());
            st.forEach(System.out::println);

            //BufferedReader 클래스의 line()
            //old style
            File file = path.toFile();
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            st = bufferedReader.lines();
            st.forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
