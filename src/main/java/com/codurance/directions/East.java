package com.codurance.directions;

import com.codurance.Rover;

public class East implements Direction {

  private String name = "E";
  private int stepWise = -1;

  @Override
  public Direction left() {
    return new North();
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
    return new Rover(x, y + stepWise, this);
  }
}
