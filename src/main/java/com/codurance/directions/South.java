package com.codurance.directions;

import com.codurance.Rover;

public class South implements Direction {
  private final String name = "S";
  private int stepWise = -1;

  @Override
  public Direction left() {
    throw new UnsupportedOperationException("Implement me!");
  }

  @Override
  public Direction right() {
    throw new UnsupportedOperationException("Implement me!");
  }

  @Override
  public String name() {
    return name;
  }

  @Override
  public Rover move(int x, int y) {
    return new Rover(x, y + stepWise, this);
  }
}
