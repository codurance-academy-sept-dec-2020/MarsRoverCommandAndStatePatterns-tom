package com.codurance.directions;

import com.codurance.Grid;
import com.codurance.Rover;
import com.codurance.position.Coordinate;

public class East extends Direction {

  private String name = "E";

  public Direction left() {
    return new North();
  }

  public Direction right() {
    return new South();
  }

  public String name() {
    return name;
  }

  public Rover move(Coordinate coordinate, Grid grid) {
    return new Rover(grid.nextEast(coordinate), this, grid);
  }
}
