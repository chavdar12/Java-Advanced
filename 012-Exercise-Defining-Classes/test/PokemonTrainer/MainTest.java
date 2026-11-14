package PokemonTrainer;

import org.junit.jupiter.api.Test;

import static support.Console.check;

class MainTest {
    // Main keeps its reader and collections in static fields, so there is one scenario per JVM
    @Test
    void pokemonDieOnlyAtZeroHealth() throws Exception {
        // Pikachu ends on 2 health and must survive
        check("Narry 1 1\nSam 0 0\nJohn 0 1", () -> Main.main(new String[0]), """
                Sam Blastoise Water 18
                Narry Pikachu Electricity 22
                John Kadabra Psychic 90
                Tournament
                Fire
                Electricity
                Fire
                End
                """);
    }
}
