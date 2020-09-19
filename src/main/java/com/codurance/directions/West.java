package com.codurance.directions;

import com.codurance.Grid;
import com.codurance.Rover;
import com.codurance.position.Coordinate;

public class West extends Direction {

  private String name = "W";

  public Direction left() {
    return new South();
  }

  public Direction right() {
    return new North();
  }

  public String name() {
    return name;
  }

  public Rover move(Coordinate coordinate, Grid grid) {
    return new Rover(grid.nextWest(coordinate), this, grid);
  }

  @Override
  public boolean isSameAs(String direction) {
    return name().equals(direction);
  }
}
