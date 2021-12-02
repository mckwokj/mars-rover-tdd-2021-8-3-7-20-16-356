package com.afs.tdd;

public class MarsRover {

    enum Direction {
        N, E, S, W
    }


    private int locationX;
    private int locationY;
    private String direction;

    public MarsRover(int locationX, int locationY, String direction) {
        this.locationX = locationX;
        this.locationY = locationY;
        this.direction = direction;
    }

    public void executeCommand(String command) {
        move("N");
        getStatus();
    }

    private void move(String direction) {
        if (direction.equals("N")) {
            this.locationY++;
        }
    }

    public String getStatus() {
        return String.format("%d %d %s", locationX, locationY, direction);
    }
}
