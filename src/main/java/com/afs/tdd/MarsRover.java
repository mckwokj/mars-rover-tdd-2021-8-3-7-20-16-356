package com.afs.tdd;

import enums.Direction;

public class MarsRover {

    private int locationX;
    private int locationY;
    private Direction direction; // better to use enum

    public MarsRover(int locationX, int locationY, Direction direction) {
        this.locationX = locationX;
        this.locationY = locationY;
        this.direction = direction;
    }

    public void executeCommands(String commands) {
        for (String command: commands.split("")) {
            executeCommand(command);
        }
    }

    private void executeCommand(String command) {
        if (command.equals("M")) {
            move();
        } else if (command.equals("L")) {
            turnLeft();
        } else if (command.equals("R")) {
            turnRight();
        }
    }

    private void move() {
        switch(direction) {
            case N: this.locationY++; break;
            case S: this.locationY--; break;
            case E: this.locationX++; break;
            case W: this.locationX--; break;
        }
    }

    private void turnLeft() {
        switch(direction) {
            case N: this.direction = Direction.W; break;
            case S: this.direction = Direction.E; break;
            case E: this.direction = Direction.N; break;
            case W: this.direction = Direction.S; break;
        }
    }

    private void turnRight() {
        switch(direction) {
            case N: this.direction = Direction.E; break;
            case S: this.direction = Direction.W; break;
            case E: this.direction = Direction.S; break;
            case W: this.direction = Direction.N; break;
        }
    }

    public String getStatus() {
        return String.format("%d %d %s", locationX, locationY, direction);
    }
}
