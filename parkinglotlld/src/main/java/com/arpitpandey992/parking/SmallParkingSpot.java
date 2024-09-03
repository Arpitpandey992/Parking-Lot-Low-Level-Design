package com.arpitpandey992.parking;

import com.arpitpandey992.Location;

public class SmallParkingSpot extends ParkingSpot {

    public SmallParkingSpot(Location location) {
        super(location);
    }

    @Override
    public double getHourlyParkingRate() {
        return 1;
    }
}
