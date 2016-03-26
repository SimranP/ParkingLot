public class ObserverLessThreshold implements ParkingLotObserver{

    private ParkingLotObserver parkingLotObserver;
    private double threshold;

    public ObserverLessThreshold(ParkingLotObserver parkingLotObserver, double threshold) {
        this.parkingLotObserver = parkingLotObserver;
        this.threshold = threshold;
    }

    @Override
    public void inform(ParkingLot parkingLot) {
        if(parkingLot.isLess(threshold))
            parkingLotObserver.inform(parkingLot);
    }
}
