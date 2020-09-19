package com.codurance;

import com.codurance.directions.Direction;
import com.codurance.directions.North;
import com.codurance.position.Coordinate;

public class Rover {

  private Grid grid;
  private Coordinate coordinate;
  private Direction direction;

  public Rover(Grid grid){
    this.grid = grid;
    this.coordinate = new Coordinate(0, 0);
    this.direction = new North();
  }

  public Rover(Coordinate coordinate, Direction direction, Grid grid) {
    this.coordinate = coordinate;
    this.direction = direction;
    this.grid = grid;
  }

  public Rover right() {
    return new Rover(coordinate, direction.right(), this.grid);
  }

  public Rover left() {
    return new Rover(coordinate, direction.left(), this.grid);
  }

  public int x() {
    return this.coordinate.x;
  }

  public int y() {
    return this.coordinate.y;
  }

  public String direction() {
    return direction.name();
  }

  public Rover move() {
    return direction.move(new Coordinate(x(), y()), this.grid);
  }
}
