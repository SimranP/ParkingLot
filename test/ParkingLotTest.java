import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ParkingLotTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void parking_lot_should_park_a_car_in_the_lot() {
        ParkingLot parkingLot = new ParkingLot(5);
        Object car = new Object();
        parkingLot.park(car);
    }

    @Test
    public void parking_lot_throws_exception_when_lot_is_full() {
        ParkingLot parkingLot = new ParkingLot(0);
        Object car = new Object();
        thrown.expect(ParkingLotIsFullException.class);
        parkingLot.park(car);
    }

    @Test
    public void isFull_tells_if_the_parking_lot_is_not_full() {
        ParkingLot parkingLot = new ParkingLot(5);
        Object car = new Object();
        parkingLot.park(car);
        assertFalse(parkingLot.isFull());
    }

    @Test
    public void isFull_tells_if_the_parking_lot_is_full() {
        ParkingLot parkingLot = new ParkingLot(2);
        Object car = new Object();
        Object car2 = new Object();
        parkingLot.park(car);
        parkingLot.park(car2);
        assertTrue(parkingLot.isFull());
    }
}
