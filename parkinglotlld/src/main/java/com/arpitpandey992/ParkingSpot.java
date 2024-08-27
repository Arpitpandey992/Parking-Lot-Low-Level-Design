package com.arpitpandey992;

import com.arpitpandey992.exceptions.ParkingSpotFreeException;
import com.arpitpandey992.exceptions.ParkingSpotOccupiedException;
import com.arpitpandey992.types.ParkingStatus;

import lombok.Getter;

public abstract class ParkingSpot {
    @Getter
    private Location location;
    private ParkingStatus parkingStatus;

    public ParkingSpot(Location location) {
        this.location = location;
        parkingStatus = ParkingStatus.FREE;
    }

    public boolean isParkingSlotFree() {
        return this.parkingStatus.equals(ParkingStatus.FREE);
    }

    public synchronized void occupyParkingSpot() throws ParkingSpotOccupiedException {
        if (!this.isParkingSlotFree()) {
            // ideally, occupy command should work every time since we will only try to
            // occupy free slots
            throw new ParkingSpotOccupiedException(
                    String.format("parking spot at location: %s is already occupied", this.location.toString()));
        }
        this.parkingStatus = ParkingStatus.OCCUPIED;
    }

    public synchronized void freeParkingSlot() throws ParkingSpotFreeException {
        if (this.isParkingSlotFree()) {
            // ideally, occupy command should work every time since we will only try to
            // occupy free slots
            throw new ParkingSpotFreeException(
                    String.format("parking spot at location: %s is already occupied", this.location.toString()));
        }
        this.parkingStatus = ParkingStatus.FREE;
    }

    public abstract double getHourlyParkingRate();
}
