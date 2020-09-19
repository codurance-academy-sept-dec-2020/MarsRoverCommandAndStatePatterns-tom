package com.codurance.directions;

import com.codurance.Rover;

public class West implements Direction {

  private String name = "W";

  @Override
  public Direction left() {
    return new South();
  }

  @Override
  public Direction right() {
    return new North();
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
