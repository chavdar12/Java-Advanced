import org.junit.jupiter.api.Test;

import static support.Console.check;

class UserLogsTest {
    @Test
    void countsIpsPerUser() throws Exception {
        check("""
                child0:
                192.23.33.40 => 1.
                destroyer:
                192.23.30.40 => 2, 192.23.30.41 => 1, 192.23.30.42 => 1.
                """, () -> UserLogs.main(new String[0]), """
                IP=192.23.30.40 message='Hello&derps.' user=destroyer
                IP=192.23.30.41 message='Hello&yall.' user=destroyer
                IP=192.23.33.40 message='Hello&hi.' user=child0
                IP=192.23.30.40 message='Hello&hi.' user=destroyer
                IP=192.23.30.42 message='Hello&Dudes.' user=destroyer
                end
                """);
    }
}
