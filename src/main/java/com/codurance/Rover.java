package com.codurance;

import com.codurance.directions.Direction;

public class Rover {

  private final int x;
  private final int y;
  private Direction direction;

  public Rover(int x, int y, Direction direction) {
    this.x = x;
    this.y = y;
    this.direction = direction;
  }

  public Rover right() {
    return new Rover(x, y, direction.right());
  }

  public Rover left() {
    return new Rover(x, y, direction.left());
  }

  public int x() {
    return x;
  }

  public int y() {
    return y;
  }

  public String direction() {
    return direction.name();
  }

  public Rover move() {
    return direction.move(x, y);
  }
}
