package com.codurance.directions;

import com.codurance.Rover;
import com.codurance.position.Coordinate;

public class North extends Direction {

  private static final int MAX_HEIGHT = 10;
  private final String name = "N";
  private int stepWise = 1;

  public Direction left() {
    return new West();
  }

  public Direction right() {
    return new East();
  }

  public String name() {
    return name;
  }

  public Rover move(Coordinate coordinate) {
    int y = coordinate.y;
    y = (y + 1) % MAX_HEIGHT;
    coordinate = new Coordinate(coordinate.x, y);
    return new Rover(coordinate, this);
  }
}
