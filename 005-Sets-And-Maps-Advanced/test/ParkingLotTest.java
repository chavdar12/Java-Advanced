import org.junit.jupiter.api.Test;

import static support.Console.check;

class ParkingLotTest {
    @Test
    void keepsParkedCarsInArrivalOrder() throws Exception {
        check("CA9999TT\nCA2844AA\nCA9876HH\nCA2822UU", () -> ParkingLot.main(new String[0]), """
                IN, CA2844AA
                IN, CA1234TA
                OUT, CA2844AA
                IN, CA9999TT
                IN, CA2866HI
                OUT, CA1234TA
                IN, CA2844AA
                OUT, CA2866HI
                IN, CA9876HH
                IN, CA2822UU
                END
                """);
    }

    @Test
    void emptyLot() throws Exception {
        check("Parking Lot is Empty", () -> ParkingLot.main(new String[0]), "IN, CA2844AA\nOUT, CA2844AA\nEND\n");
    }
}
