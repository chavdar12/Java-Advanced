import org.junit.jupiter.api.Test;

import static support.Console.check;

class BalancedParenthesesTest {
    @Test
    void balanced() throws Exception {
        check("YES", () -> BalancedParentheses.main(new String[0]), "{[()]}\n");
        check("YES", () -> BalancedParentheses.main(new String[0]), "{{[[(())]]}}\n");
    }

    @Test
    void wronglyNested() throws Exception {
        check("NO", () -> BalancedParentheses.main(new String[0]), "{[(])}\n");
    }

    @Test
    void unclosedBracketsAreNotBalanced() throws Exception {
        check("NO", () -> BalancedParentheses.main(new String[0]), "((\n");
    }
}
