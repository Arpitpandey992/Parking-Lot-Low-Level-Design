package com.arpitpandey992;

public class SmallParkingSpot extends ParkingSpot {

    public SmallParkingSpot(Location location) {
        super(location);
    }

    @Override
    public double getHourlyParkingRate() {
        return 1;
    }
}
