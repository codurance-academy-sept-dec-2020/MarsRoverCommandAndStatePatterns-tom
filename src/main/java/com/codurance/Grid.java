package com.codurance;

import com.codurance.position.Coordinate;

public class Grid {
  private static final int MAX_WIDTH = 10;
  private static final int MAX_HEIGHT = 10;

  public Coordinate nextEast(Coordinate coordinate){
    int x = coordinate.x;
    x = (x + 1) % MAX_WIDTH;
    return new Coordinate(x, coordinate.y);
  }

  public Coordinate nextNorth(Coordinate coordinate){
    int y = coordinate.y;
    y = (y + 1) % MAX_HEIGHT;
    return new Coordinate(coordinate.x, y);
  }

  public Coordinate nextSouth(Coordinate coordinate){
    int y = coordinate.y;
    y = (y > 0) ? y - 1 : MAX_HEIGHT - 1;
    return new Coordinate(coordinate.x, y);
  }

  public Coordinate nextWest(Coordinate coordinate){
    int x = coordinate.x;
    x = (x > 0) ? x - 1 : MAX_WIDTH - 1;
    return new Coordinate(x, coordinate.y);
  }
}
