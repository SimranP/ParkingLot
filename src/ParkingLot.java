import java.util.HashSet;

public class ParkingLot {
    private final HashSet<Object> parkingArea;
    private int capacity;
    private HashSet<ParkingLotObserver> observers = new HashSet<>();

    public ParkingLot(int capacity) {
        this.capacity = capacity;
        parkingArea = new HashSet<>(capacity);
    }

    public void park(Object car) {
        if (isFull())
            throw new ParkingLotIsFullException();
        parkingArea.add(car);
        for (ParkingLotObserver observer : observers)
            observer.inform(this);
    }


    public boolean isFull() {
        return parkingArea.size() == capacity;
    }

    public void addObserver(ParkingLotObserver observer) {
        observers.add(observer);
    }

    public Integer size() {
        return parkingArea.size();
    }

    public boolean isAbove(double threshold) {
        return size() >= capacity * threshold;
    }

    public boolean isLess(double threshold) {
        return size() < capacity * threshold;
    }
}
