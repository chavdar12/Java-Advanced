import org.junit.jupiter.api.Test;

import static support.Console.check;

class PopulationCounterTest {
    @Test
    void countriesAndCitiesByPopulation() throws Exception {
        check("""
                UK (total population: 1100000)
                =>Yorkshire: 1000000
                =>London: 100000
                Bulgaria (total population: 1001000)
                =>Sofia: 1000000
                =>Veliko Tarnovo: 1000
                """, () -> PopulationCounter.main(new String[0]), """
                Sofia|Bulgaria|1000000
                Veliko Tarnovo|Bulgaria|1000
                London|UK|50000
                Yorkshire|UK|1000000
                London|UK|50000
                report
                """);
    }
}
