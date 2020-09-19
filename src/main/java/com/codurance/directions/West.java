package com.codurance.directions;

import com.codurance.Rover;
import com.codurance.position.Coordinate;

public class West extends Direction {

  private String name = "W";
  private int stepWise = -1;

  public Direction left() {
    return new South();
  }

  public Direction right() {
    return new North();
  }

  public String name() {
    return name;
  }

  public Rover move(Coordinate coordinate) {
    coordinate = new Coordinate(coordinate.x + stepWise, coordinate.y);
    return new Rover(coordinate, this);
  }
}
