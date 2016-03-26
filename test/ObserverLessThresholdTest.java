import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class ObserverLessThresholdTest {
    @Test
    public void attendant_gets_to_know_when_parking_lot_is_less_than_20_percent() {
        ParkingLot parkingLot = new ParkingLot(10);
        ParkingLotObserver mock = mock(ParkingLotObserver.class);
        ObserverLessThreshold attendant = new ObserverLessThreshold(mock, 0.2);
        parkingLot.addObserver(attendant);
        parkingLot.park(new Object());
        verify(mock).inform(parkingLot);
    }
}
