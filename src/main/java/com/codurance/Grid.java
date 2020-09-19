package com.codurance;

import com.codurance.position.Coordinate;
import java.util.Collections;
import java.util.List;

public class Grid {
  private static final int MAX_WIDTH = 10;
  private static final int MAX_HEIGHT = 10;

  private List<Coordinate> obstacles = Collections.emptyList();

  public Grid(){
  }

  public Grid(List<Coordinate> obstacles){
    this.obstacles = obstacles;
  }

  public Coordinate nextEast(Coordinate coordinate){
    return obstacles.contains(new Coordinate((coordinate.x + 1) % MAX_WIDTH, coordinate.y))
        ? coordinate : new Coordinate((coordinate.x + 1) % MAX_WIDTH, coordinate.y);
  }

  public Coordinate nextNorth(Coordinate coordinate){
    return obstacles.contains(new Coordinate(coordinate.x, (coordinate.y + 1) % MAX_HEIGHT))
        ? coordinate : new Coordinate(coordinate.x, (coordinate.y + 1) % MAX_HEIGHT);
  }

  public Coordinate nextSouth(Coordinate coordinate){
    return obstacles.contains(new Coordinate(coordinate.x, (coordinate.y > 0) ? coordinate.y - 1 : MAX_HEIGHT - 1))
        ? coordinate : new Coordinate(coordinate.x, (coordinate.y > 0) ? coordinate.y - 1 : MAX_HEIGHT - 1);
  }

  public Coordinate nextWest(Coordinate coordinate){
    return obstacles.contains(new Coordinate((coordinate.x > 0) ? coordinate.x - 1 : MAX_WIDTH - 1, coordinate.y))
        ? coordinate : new Coordinate((coordinate.x > 0) ? coordinate.x - 1 : MAX_WIDTH - 1, coordinate.y);
  }
}
