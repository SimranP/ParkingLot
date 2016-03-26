import org.junit.Test;

import static org.mockito.Mockito.*;

public class ParkingLotObserverTest {
    @Test
    public void attendant_gets_to_know_when_a_car_park_in_parking_lot() {
        ParkingLot parkingLot = new ParkingLot(2);
        ParkingLotObserver mockObserver = mock(ParkingLotObserver.class);
        parkingLot.addObserver(mockObserver);
        parkingLot.park(new Object());
        verify(mockObserver).inform(parkingLot);
    }
}