package com.codurance.directions;

import com.codurance.Rover;
import com.codurance.position.Coordinate;

public class South implements Direction {
  private final String name = "S";
  private int stepWise = -1;

  @Override
  public Direction left() {
    return new East();
  }

  @Override
  public Direction right() {
    return new West();
  }

  @Override
  public String name() {
    return name;
  }

  @Override
  public Rover move(int x, int y) {
    Coordinate coordinate = new Coordinate(x, y + stepWise);
    return new Rover(coordinate, this);
  }
}
