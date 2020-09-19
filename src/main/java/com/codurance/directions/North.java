package com.codurance.directions;

import com.codurance.Rover;

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
    return new Rover(x, y + stepWise, this);
  }
}
