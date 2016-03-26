public class Attendant implements ParkingLotObserver {
    @Override
    public void inform(ParkingLot parkingLot) {
        System.out.println("Attendant got inform.");
    }
}

