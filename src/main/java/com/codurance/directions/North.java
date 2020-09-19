package com.codurance.directions;

import com.codurance.Rover;
import com.codurance.position.Coordinate;

public class North implements Direction {
  private final String name = "N";
  private int stepWise = 1;

  @Override
  public Direction left() {
    return new West();
  }

  @Override
  public Direction right() {
    return new East();
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
