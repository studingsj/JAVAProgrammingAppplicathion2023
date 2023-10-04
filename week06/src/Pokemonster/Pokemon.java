package Pokemonster;

public abstract class Pokemon {
    //부모 자식간 접근시 protected/보안이 약해짐
    protected int level;
    //private int level;
    private int hp;
    protected String name;

    protected int defenceRate;

    protected int attackRate;

    protected String[] skills;

    protected  int[] specialAttackRate;

    private static int pokemonCount = 0; // 클래스(정적) 변수

    Flyable flyable; //연관 관계

    public void setFlyable(Flyable flyable) { //upcast
        this.flyable = flyable;
    }

    public void performFly(){
        System.out.println(this.name + "이(가) ");
        this.flyable.fly();
    }

    public static int getPokemonCount() { //클래스(정적) 메소드
        return pokemonCount;
    }

    public Pokemon(int level, int hp, String name) {
        //System.out.println("부모 클래스의 매개변수 생성자");
        this.level = level;
        this.hp = hp;
        this.name = name;
    }

    public Pokemon() {
        //System.out.println("부모 클래스의 기본 생성자");
        pokemonCount++;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
    //속성별 오버라이딩(Alt+inset,o)
    public void evolve() {

        if(this instanceof Pikachu) {
            System.out.println("삐까 삐까~");
        } else if (this instanceof Squirtle) {
            System.out.println("꼬북 꼬북~~");
        } else if (this instanceof Charizard){
            System.out.println("자몽 자몽~~");
        }
        this.level = this.level + 1;
        this.hp = this.hp + 100; //레벨 업시 체력 +100
        String texts = """
                    name의 레벨이
                    level으로 증가
                """.replace("name", this.name)
                .replace("level",this.level + "");
        System.out.println(texts);
    }

    public final void info(){ //자식클래스에서 재정의(override) 불가
        System.out.println("===================");
        System.out.println("이름 : " + name);
        System.out.println("레벨 : " + level);
        System.out.println("체력 : " + hp);
        System.out.println("===================");
    }

    public abstract void attack();
    //매개변수(pokemon)를 사용안해도됨, this활용
    //viod 앞에 아무것도 없으면 디폴트 접근 -> 같은 패키지에 있어야만 사용가능

    public void attack(Pokemon targertPokemon , int skillNumber ) {
        System.out.println(this.name + "이(가) " + targertPokemon.name + "에게 " + this.skills[skillNumber-1] + " 공격 시전!");
        int temporaryAttackRate = this.attackRate - targertPokemon.defenceRate;
        if (temporaryAttackRate < 0 )
            temporaryAttackRate = 0;
        targertPokemon.hp = (this.attackRate + this.specialAttackRate[skillNumber-1]) - temporaryAttackRate;
        if (targertPokemon.hp <= 0) {
            System.out.println(targertPokemon.name + "은(는) 사망 " );
        } else {
        System.out.println(targertPokemon.name + "의 체력은 " + targertPokemon.hp + "입니다.");
        }
    }
}
