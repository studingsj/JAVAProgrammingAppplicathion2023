

import java.util.ArrayList;

public class PokemonGame {
    //오버로딩할지 정함(포켓몬 생성자)
    public static void main(String[] args) {
        ArrayList<Pokemon> pokemons = new ArrayList<>();
        Pokemon charizard = new Pokemon();
        Pokemon pikachu = new Pokemon("피카츄");
        Pokemon squirtle = new Pokemon("꼬부기", 1);

        pokemons.add(pikachu);
        pokemons.add(charizard);
        pokemons.add(squirtle);

        System.out.println(pokemons.get(2).getName());
        pokemons.get(1).setName("리자몽");
        pokemons.get(1).attack(pikachu);
        System.out.println(pokemons.size());
        pokemons.get(0).attack();




//        System.out.println(Pokemon.getPokemonCount());
//        Pokemon squirtle = new Pokemon("꼬부기", 1); //매개생성자
//        Pokemon pikachu = new Pokemon("피카츄"); //매개생성자
//        System.out.println(Pokemon.getPokemonCount());
//        Pokemon charizard = new Pokemon(); //기본생성자
//        System.out.println(Pokemon.getPokemonCount());
//
//        System.out.println(pikachu.getName()
//                + "의 체력은" + pikachu.getHp()
//                + "이고 레벨은" + pikachu.getLevel()
//                + "입니다.");
//
//        squirtle.evolve(squirtle);
//        System.out.println(squirtle.getName());
//        squirtle.evolve(squirtle);
//
//        charizard.setName("리자몽");
//
//
////        pikachu.setLevel(23);
////        pikachu.setHp(500);
//        pikachu.setLevel(23).setHp(500); //method chaining 기법
//
//
//
//        charizard.setLevel(36);
//
//
//        System.out.println(charizard.getName() + "의 체력은" + charizard.getHp() + "이고 레벨은" + charizard.getLevel() + "입니다.");
//        charizard.evolve(charizard);
//        pikachu.evolve(pikachu);
//        pikachu.evolve(pikachu);
//        pikachu.setName("라이츄");
//        System.out.println(pikachu.getName());
//        pikachu.evolve(pikachu);
//
//        System.out.println(pikachu.getName()
//                + "의 체력은" + pikachu.getHp()
//                + "이고 레벨은" + pikachu.getLevel()
//                + "입니다.");
//
//        charizard.attack(squirtle);
//        squirtle.attack();

    }

}


