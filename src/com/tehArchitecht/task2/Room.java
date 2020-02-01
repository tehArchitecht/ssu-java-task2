package com.tehArchitecht.task2;

public class Room {
    private static final double windowArea = 2.0*15.0;
    private static final double doorArea = 2.0*8.0;

    private double length;
    private double width;
    private double height;

    public Room() {
        length = 0.0;
        width = 0.0;
        height = 0.0;
    }

    public Room(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double totalWallArea() {
        return 2.0*(width + length)*height;
    }

    public double wallAreaExcludingWindowsAndDoors() {
        return totalWallArea() - windowArea - doorArea;
    }

    @Override
    public String toString() {
        return "Room{" +
                "length=" + length +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
