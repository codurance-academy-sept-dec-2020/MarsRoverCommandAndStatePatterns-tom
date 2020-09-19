package com.codurance.directions;

import com.codurance.Grid;
import com.codurance.Rover;
import com.codurance.position.Coordinate;

public abstract class Direction {
  public abstract Direction left();
  public abstract Direction right();
  public abstract String name();
  public abstract Rover move(Coordinate coordinate, Grid grid);
}
