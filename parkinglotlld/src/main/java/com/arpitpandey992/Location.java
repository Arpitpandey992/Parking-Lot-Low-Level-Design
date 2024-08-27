package com.arpitpandey992;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Location {
    private int x, y;

    public double getDistanceFrom(Location location2) {
        double delX = location2.getX() - this.x;
        double delY = location2.getY() - this.y;

        return Math.sqrt(delX * delX + delY * delY);
    }

    public String toString() {
        return String.format("latitude: %d, longitude: %d", this.x, this.y);
    }
}
