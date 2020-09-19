package com.codurance.directions;

import com.codurance.Rover;
import com.codurance.position.Coordinate;

public class South extends Direction {
  private final String name = "S";
  private int stepWise = -1;

  public Direction left() {
    return new East();
  }

  public Direction right() {
    return new West();
  }

  public String name() {
    return name;
  }

  public Rover move(Coordinate coordinate) {
    coordinate = new Coordinate(coordinate.x, coordinate.y + stepWise);
    return new Rover(coordinate, this);
  }
}
