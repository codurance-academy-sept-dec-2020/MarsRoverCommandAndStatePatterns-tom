package com.codurance.directions;

import com.codurance.Rover;
import com.codurance.position.Coordinate;

public class East extends Direction {

  private static final int MAX_WIDTH = 10;
  private String name = "E";

  public Direction left() {
    return new North();
  }

  public Direction right() {
    return new South();
  }

  public String name() {
    return name;
  }

  public Rover move(Coordinate coordinate) {
    int x = coordinate.x;
    x = (x + 1) % MAX_WIDTH;
    coordinate = new Coordinate(x, coordinate.y);
    return new Rover(coordinate, this);
  }
}
