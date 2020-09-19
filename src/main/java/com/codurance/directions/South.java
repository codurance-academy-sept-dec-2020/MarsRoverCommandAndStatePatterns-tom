package com.codurance.directions;

import com.codurance.Grid;
import com.codurance.Rover;
import com.codurance.position.Coordinate;

public class South extends Direction {

  private final String name = "S";

  public Direction left() {
    return new East();
  }

  public Direction right() {
    return new West();
  }

  public String name() {
    return name;
  }

  public Rover move(Coordinate coordinate, Grid grid) {
    return new Rover(grid.nextSouth(coordinate), this, grid);
  }
}
