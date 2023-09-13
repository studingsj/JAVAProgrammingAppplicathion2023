
public class Pikachu extends Pokemon{
    public Pikachu() {
        System.out.println("자식 클래스(피카츄)의 기본 생성자");
        this.level = 1;
        this.setHp(35);
        this.name = "피카츄";
    }

    @Override
    public void attack() {
        //super.attack();
        System.out.println(this.name + "이(가) 광역 전기 공격을 합니다.");
    }
//   부모클래스의 정적 메소드 getPokemonCount가 override한게 아니라
//   Pikachu클래스 전용 클래스 선언
//    public static int getPokemonCount() {
//        return 7;
//    }
}
