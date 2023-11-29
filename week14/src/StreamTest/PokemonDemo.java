package StreamTest;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

abstract class Pokemon {
    protected int leval;
    protected  String name;

    public Pokemon(int leval, String name) {
        this.leval = leval;
        this.name = name;
    }
    public abstract void evolve();
}

class Pickachu extends Pokemon{

    public Pickachu(int leval, String name) {
        super(leval, name);
    }

    @Override
    public void evolve() {
        if (this.leval >=16 ) {
            this.name ="Raichu";
            System.out.println("축하합니다. 당신의 피카츄가 라이츄로 진화합니다.");
        } else {
            System.out.println("피카츄의 레벨이 부족합니다.");
        }

    }
}
public class PokemonDemo {
    public static void main(String[] args) {
        List<Pickachu> pokemons = Stream.of(
                new Pickachu(15, "피카츄1"),
                new Pickachu(16, "피카츄2"),
                new Pickachu(17, "피카츄3")
        ).collect(Collectors.toList());

        pokemons.forEach(Pickachu::evolve);  //매소드 레퍼런스
        System.out.println();
        pokemons.forEach(p -> p.evolve());   //람다식
    }
}
