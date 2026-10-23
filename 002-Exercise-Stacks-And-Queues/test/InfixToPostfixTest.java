import org.junit.jupiter.api.Test;

import static support.Console.check;

class InfixToPostfixTest {
    @Test
    void handlesParentheses() throws Exception {
        check("5 3 2 + /", () -> InfixToPostfix.main(new String[0]), "5 / ( 3 + 2 )\n");
    }

    @Test
    void isLeftAssociative() throws Exception {
        check("1 2 + 3 +", () -> InfixToPostfix.main(new String[0]), "1 + 2 + 3\n");
    }

    @Test
    void respectsPrecedence() throws Exception {
        check("7 13 12 4 - / +", () -> InfixToPostfix.main(new String[0]), "7 + 13 / ( 12 - 4 )\n");
    }
}
