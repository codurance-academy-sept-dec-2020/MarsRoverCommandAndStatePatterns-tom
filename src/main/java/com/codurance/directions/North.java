package com.codurance.directions;

import com.codurance.Rover;
import com.codurance.position.Coordinate;

public class North extends Direction {
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
    coordinate = new Coordinate(coordinate.x, coordinate.y + stepWise);
    return new Rover(coordinate, this);
  }
}
