package com.codurance;

import com.codurance.directions.Direction;
import com.codurance.position.Coordinate;

public class Rover {
  private Coordinate coordinate;
  private Direction direction;

  public Rover(Coordinate coordinate, Direction direction) {
    this.coordinate = coordinate;
    this.direction = direction;
  }

  public Rover right() {
    return new Rover(coordinate, direction.right());
  }

  public Rover left() {
    return new Rover(coordinate, direction.left());
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
    return direction.move(new Coordinate(x(), y()));
  }
}
