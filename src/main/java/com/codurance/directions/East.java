package com.codurance.directions;

import com.codurance.Rover;
import com.codurance.position.Coordinate;

public class East extends Direction {

  private String name = "E";
  private int stepWise = 1;

  public Direction left() {
    return new North();
  }

  public Direction right() {
    return new South();
  }

  public String name() {
    return name;
  }

  public Rover move(Coordinate coordinate) {
    coordinate = new Coordinate(coordinate.x + stepWise, coordinate.y);
    return new Rover(coordinate, this);
  }
}
