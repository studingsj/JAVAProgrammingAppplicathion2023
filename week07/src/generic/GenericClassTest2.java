package generic;

class Dp< K,V> {
    private K name;
    private V grade;

    public Dp(K name, V grade) {
        this.name = name;
        this.grade = grade;
    }

    public K getName() {
        return name;
    }

    public V getGrade() {
        return grade;
    }
}
public class GenericClassTest2 {
    public static void main(String[] args) {
        Dp<String , String> s1 = new Dp<>( "한호열", "상병");
        Dp<String , String> s2 = new Dp<>( "임지섭", "대위");
//        Dp<soldier, String> s3 = new Dp<>(new soldier(), 6 );
        System.out.println(s1.getName() + "의 계급은 " + s1.getGrade() + " 입니디.");
        System.out.println(s2.getName() + "의 계급은 " + s2.getGrade() + " 입니디.");
    }
}
