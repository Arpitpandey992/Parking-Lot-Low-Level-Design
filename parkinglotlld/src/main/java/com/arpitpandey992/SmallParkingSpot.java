package com.arpitpandey992;

public class SmallParkingSpot extends ParkingSpot {

    public SmallParkingSpot(Location location) {
        super(location);
    }

    @Override
    public double getHourlyParkingRate() { // TODO: change double to Money class
        return 1;
    }

}
