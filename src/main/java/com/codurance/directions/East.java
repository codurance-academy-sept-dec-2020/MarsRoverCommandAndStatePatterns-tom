package com.codurance.directions;

import com.codurance.Rover;

public class East implements Direction {

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
    throw new UnsupportedOperationException("Implement me!");
  }

  @Override
  public Rover move(int x, int y) {
    throw new UnsupportedOperationException("Implement me!");
  }
}
