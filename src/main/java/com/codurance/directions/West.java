package com.codurance.directions;

import com.codurance.Rover;
import com.codurance.position.Coordinate;

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
    Coordinate coordinate = new Coordinate(x + stepWise, y);
    return new Rover(coordinate, this);
  }
}
