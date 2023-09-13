
class Pokemon {
    //캡슐화
    //정적(클래스) 변수를 사용하면 공유되는 필드를 지원
    private String name;
    private int level;
    private int hp;

    //static member variable (정적(클래스) 멤버 변수)
    //캡슐화 시키기(private추가, get(alt+insert)추가, game sout getPokemonCount 변경)
    //static int pokemonCount = 0; 인스터스(객체) 생성없이 클래스명. 형태로 사용 가능
    //객체와 관련된 인스턴스 변수 사용 불가
    //객체와 관련된 인스턴스 메서드 호출 불가
    //객체 자신을 가리키는 this 키위드 사용 불가
    //static final int radius 변화하지 않는 값을 사용할때


    private static int pokemonCount = 0;


    public Pokemon() {
        System.out.println("포켓몬 객체가 생성(기본 생성자)!");
        this.hp = 100;
        pokemonCount++;
    }

    //생성자 오버로딩 (constructor)


    public Pokemon(String name) {
        //this(name,1); this 생성자를 삭제해야지 Count 사용 가능
        System.out.println("포켓몬 객체가 생성(매개변수 1개 생성자)!");
        this.name = name;
        this.hp = 100;
        this.level = 1 ;
        pokemonCount++;
    }

    public Pokemon(String name, int level ) {
        System.out.println("포켓몬 객체가 생성(매개변수 2개 생성자)!");
        this.name = name;
        this.level = level;
        this.hp = 100;
        pokemonCount++;
    }

    public static int getPokemonCount() {
        return pokemonCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

//    public void setLevel(int level) {
//        this.level = level;
//    }

    public Pokemon setLevel(int level) {
        // 리턴타입 void -> Pokemon
        //method chaining 기법 game-27
        this.level = level;
        return this; //실행 시점의 포켓몬 객체를 리턴
    }
    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    // 메소드(methode), 멤버 함수, 행위
    //text block 활용
    //method chaining 기법으로 연속으롤 replace 사용
    void evolve(Pokemon pokemon) {
        pokemon.level = pokemon.level + 1;
        //System.out.println("\t" + pokemon.name + "의 레벨이\n" + "\t" + pokemon.level + "으로 증가!");
        String texts = """
                    name의 레벨이
                    level으로 증가
                """.replace("name", pokemon.name)
                .replace("level",pokemon.level + "");
        System.out.println(texts);
    }

    //같은 클래스에 있어서 this.name 사용가능
    void attack() {
        System.out.println(this.name + "이(가) 광역 도발 공격을 시전합니다.");
    }

    //method overloading 공격 당하는 포켓몬 (매개변수)
    void attack(Pokemon pokemon) {
        System.out.println(this.name + "이(가) " + pokemon.name + "에게 공격을 시전합니다.");
    }
}
