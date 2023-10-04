package generic;

import Pokemonster.*;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<Pokemon> pokemons = new ArrayList<>();
        pokemons.add(new Pikachu(new NoFly())); //add 이용
        pokemons.add(new Squirtle(new NoFly()));
        pokemons.add(new Charizard(new Wings()));

        for (Pokemon p : pokemons)
            p.attack();
    }
}
