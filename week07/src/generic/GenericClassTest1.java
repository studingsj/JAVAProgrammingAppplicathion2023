package generic;

public class GenericClassTest1 {
    public static void main(String[] args) {
        PostBox<String> postBox1 = new PostBox<>();
        PostBox<Integer> postBox2 = new PostBox<>();

        postBox1.setItem("소포"); //타입 매치 중요
        postBox2.setItem(35); //타입 매치 중요

        System.out.println(postBox1.getItem());
        System.out.println(postBox2.getItem());
    }
}
