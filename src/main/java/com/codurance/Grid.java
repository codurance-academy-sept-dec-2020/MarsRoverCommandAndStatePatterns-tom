package com.codurance;

import com.codurance.position.Coordinate;

public class Grid {
  private static final int MAX_WIDTH = 10;
  private static final int MAX_HEIGHT = 10;

  public Coordinate nextEast(Coordinate coordinate){
    return new Coordinate((coordinate.x + 1) % MAX_WIDTH, coordinate.y);
  }

  public Coordinate nextNorth(Coordinate coordinate){
    return new Coordinate(coordinate.x, (coordinate.y + 1) % MAX_HEIGHT);
  }

  public Coordinate nextSouth(Coordinate coordinate){
    return new Coordinate(coordinate.x, (coordinate.y > 0) ? coordinate.y - 1 : MAX_HEIGHT - 1);
  }

  public Coordinate nextWest(Coordinate coordinate){
    return new Coordinate((coordinate.x > 0) ? coordinate.x - 1 : MAX_WIDTH - 1, coordinate.y);
  }
}
