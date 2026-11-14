import org.junit.jupiter.api.Test;

import static support.Console.check;

class LogsAggregatorTest {
    @Test
    void aggregatesDurationAndIps() throws Exception {
        check("""
                alex: 62 [10.10.17.33, 212.50.118.81]
                peter: 303 [10.10.17.34, 10.10.17.35, 192.168.0.11]
                """, () -> LogsAggregator.main(new String[0]), """
                7
                192.168.0.11 peter 33
                10.10.17.33 alex 12
                10.10.17.35 peter 30
                10.10.17.34 peter 120
                10.10.17.34 peter 120
                212.50.118.81 alex 46
                212.50.118.81 alex 4
                """);
    }
}
