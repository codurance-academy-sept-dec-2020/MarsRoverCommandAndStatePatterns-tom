package com.codurance.directions;

import com.codurance.Grid;
import com.codurance.Rover;
import com.codurance.position.Coordinate;

public class South extends Direction {

  private static final int MAX_HEIGHT = 10;
  private final String name = "S";
  private int stepWise = -1;

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
    int y = coordinate.y;
    y = (y > 0) ? y + stepWise : MAX_HEIGHT - 1;
    coordinate = new Coordinate(coordinate.x, y);
    return new Rover(coordinate, this, grid);
  }
}
