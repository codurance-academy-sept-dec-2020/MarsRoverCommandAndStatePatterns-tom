package com.codurance.directions;

import com.codurance.Rover;

public class West implements Direction {

  private String name = "W";
  private int stepWise = -1;

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
    return new Rover(x + stepWise, y, this);
  }
}
