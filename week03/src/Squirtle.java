

public class Squirtle extends Pokemon{
    public Squirtle() {
        super(); //부모 클래스의 기본 생성자는 맨 위로 가야함 (생략가능)
        System.out.println("자식 클래스(꼬부기)의 기본 생성자");
        this.level = 1;
        this.setHp(44);
        this.name = "꼬부기";
    }

    @Override
    public void attack() {
        //super.attack();
        System.out.println(this.name + "이(가) 광역 물대포 공격을 합니다.");
    }
}
