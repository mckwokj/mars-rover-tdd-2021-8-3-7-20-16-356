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
        if (command.equals("M")) {
            move();
        } else if (command.equals("L")) {
            turnLeft();
        } else if (command.equals("R")) {
            turnRight();
        }
        getStatus();
    }

    private void move() {
        if (direction.equals("N")) {
            this.locationY++;
        } else if (direction.equals("S")) {
            this.locationY--;
        } else if (direction.equals("E")) {
            this.locationX++;
        } else if (direction.equals("W")) {
            this.locationX--;
        }
    }

    private void turnLeft() {
        if (direction.equals("N")) {
            this.direction = "W";
        } else if (direction.equals("S")) {
            this.direction = "E";
        } else if (direction.equals("E")) {
            this.direction = "N";
        }   else if (direction.equals("W")) {
            this.direction = "S";
        }
    }

    private void turnRight() {
        if (direction.equals("N")) {
            this.direction = "E";
        } else if (direction.equals("S")) {
            this.direction = "W";
        } else if (direction.equals("E")) {
            this.direction = "S";
        } else if (direction.equals("W")) {
            this.direction = "N";
        }
    }

    public String getStatus() {
        return String.format("%d %d %s", locationX, locationY, direction);
    }
}
