

public class Pokemon {
    //부모 자식간 접근시 protected/보안이 약해짐
    protected int level;
    //private int level;
    private int hp;
    protected String name;

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
    void attack() {
        System.out.println(this.name + "이(가) 광역 도발 공격을 시전합니다.");
    }
    //매개변수(pokemon)를 사용안해도됨, this활용
    void evolve() {
        this.level = this.level + 1;
        this.hp = this.hp + 100; //레벨 업시 체력 +100
        String texts = """
                    name의 레벨이
                    level으로 증가
                """.replace("name", this.name)
                .replace("level",this.level + "");
        System.out.println(texts);
    }
}
