package BankAccount;

import org.junit.jupiter.api.Test;

import static support.Console.check;

class MainTest {
    // account ids and the interest rate are static, so the whole scenario lives in one test
    @Test
    void createDepositAndInterest() throws Exception {
        check("""
                Account ID1 created
                Account ID2 created
                Deposited 20 to ID1
                Account does not exist
                Deposited 10 to ID2
                30.00
                15.00
                Account does not exist
                Withdrew 5 from ID1
                Insufficient balance
                """, () -> Main.main(new String[0]), """
                Create
                Create
                Deposit 1 20
                Deposit 3 20
                Deposit 2 10
                SetInterest 1.5
                GetInterest 1 1
                GetInterest 2 1
                GetInterest 3 1
                Withdraw 1 5
                Withdraw 1 100
                End
                """);
    }
}
