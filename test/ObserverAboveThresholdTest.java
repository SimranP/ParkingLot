import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

public class ObserverAboveThresholdTest {
    @Test
    public void attendant_is_not_interrupted_when_parking_is_not_full() {
        ParkingLot parkingLot = new ParkingLot(2);
        ObserverAboveThreshold mock = mock(ObserverAboveThreshold.class);
        parkingLot.addObserver(mock);
        verify(mock,never()).inform(parkingLot);
    }

    @Test
    public void attendant_gets_to_know_if_parking_is_full() {
        ParkingLot parkingLot = new ParkingLot(2);
        ParkingLotObserver mock = mock(ObserverAboveThreshold.class);
        ObserverAboveThreshold attendant = new ObserverAboveThreshold(mock, 1.0);
        parkingLot.addObserver(attendant);
        parkingLot.park(new Object());
        parkingLot.park(new Object());
        verify(mock).inform(parkingLot);
    }
}
