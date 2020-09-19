package com.codurance.directions;

import com.codurance.Rover;

public class East implements Direction {

  private String name = "E";

  @Override
  public Direction left() {
    throw new UnsupportedOperationException("Implement me!");
  }

  @Override
  public Direction right() {
    return new South();
  }

  @Override
  public String name() {
    return name;
  }

  @Override
  public Rover move(int x, int y) {
    throw new UnsupportedOperationException("Implement me!");
  }
}
