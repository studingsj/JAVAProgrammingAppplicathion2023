public class PokemonGame {
    public static void main(String[] args) {
//        Pokemon p0 = new Pokemon();
//        p0.attack();
//        p0.evolve();

        Squirtle s1 = new Squirtle();
        Pikachu p1 = new Pikachu();
        Pokemon c1 = new Charizard(); // upcasting

        //anonymous object 익명객체
        s1.setFlyable(new NoFly());
        p1.setFlyable(new NoFly());
        //c1.setFlyable(new Wings());
        c1.setFlyable(new Wings() { //날개의 type을 주고 싶을때 익명클래스 해서 사용
            @Override
            public void fly() {
                System.out.println("강철 날개로 날아갑니다!");
            }
        });

        p1.performFly();
        c1.performFly();
        s1.performFly();

        JatPack jatPack = new JatPack();
        p1.setFlyable(new JatPack()); // Nofly 객체 -> Jetpack 객체로
        p1.performFly();

        Balloon balloon =new Balloon();
        s1.setFlyable(new Balloon());
        s1.performFly();

//        c1.attack();
//        c1.evolve();
          // c1.type(); // 부모클래스의 변수로는 자식 클래스 전용 매서드를 볼 수 없다
          // 리자몽 객체지만 참조하는 변수가 포켓몬 추상 클래스의 c1 변수로 자식 클래스 전용 매서드는 사용 불가

//        Charizard c2 = (Charizard)c1;
//        c2.type();
//
//        s1.attack();
//        p1.attack();
//        s1.evolve();

    }
}
