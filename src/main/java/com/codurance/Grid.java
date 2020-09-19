package com.codurance;

import com.codurance.position.Coordinate;

public class Grid {
  private static final int MAX_WIDTH = 10;

  public Coordinate nextEast(Coordinate coordinate){
    int x = coordinate.x;
    x = (x + 1) % MAX_WIDTH;
    return new Coordinate(x, coordinate.y);
  }
}
