public class ObserverAboveThreshold implements ParkingLotObserver {
    private ParkingLotObserver parkingLotObserver;
    private double threshold;

    public ObserverAboveThreshold(ParkingLotObserver parkingLotObserver, double threshold) {
        this.parkingLotObserver = parkingLotObserver;
        this.threshold = threshold;
    }

    @Override
    public void inform(ParkingLot parkingLot) {
        if(parkingLot.isAbove(threshold)){
            parkingLotObserver.inform(parkingLot);
        }
    }
}
