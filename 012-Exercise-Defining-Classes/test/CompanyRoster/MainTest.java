package CompanyRoster;

import org.junit.jupiter.api.Test;

import static support.Console.check;

class MainTest {
    @Test
    void highestAverageSalary() throws Exception {
        check("""
                Highest Average Salary: Development
                Sam 840.20 sam@sam.com -1
                Peter 120.00 peter@abv.bg 28
                """, () -> Main.main(new String[0]), """
                4
                Peter 120.00 Dev Development peter@abv.bg 28
                Tina 333.33 Manager Marketing 33
                Sam 840.20 ProjectLeader Development sam@sam.com
                George 0.20 Freeloader Nowhere 18
                """);
    }

    @Test
    void averageNotTotal() throws Exception {
        check("""
                Highest Average Salary: B
                Bob 200.00 n/a -1
                """, () -> Main.main(new String[0]), """
                4
                Ann 100 Dev A
                Ben 100 Dev A
                Cid 100 Dev A
                Bob 200 Dev B
                """);
    }
}
