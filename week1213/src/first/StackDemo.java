package first;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();

        s1.push(5);
        s1.push(1);
        s1.push(3);

        System.out.println(s1.pop());
        System.out.println(s1.peek()); // 삭제
    }
}
