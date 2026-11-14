package FamilyTree;

import org.junit.jupiter.api.Test;

import static support.Console.check;

class MainTest {
    // Main keeps its reader and collections in static fields, so there is one scenario per JVM
    @Test
    void resolvesParentsAndChildrenByNameOrDate() throws Exception {
        check("""
                Peter Petrov 23/5/1980
                Parents:
                George Petrov 11/11/1951
                Sara Petrova 13/9/1950
                Children:
                Ivan Petrov 1/1/2010
                """, () -> Main.main(new String[0]), """
                Peter Petrov
                11/11/1951 - 23/5/1980
                Sara Petrova - 23/5/1980
                George Petrov 11/11/1951
                Peter Petrov 23/5/1980
                Sara Petrova 13/9/1950
                Peter Petrov - Ivan Petrov
                Ivan Petrov 1/1/2010
                End
                """);
    }
}
