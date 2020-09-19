package com.codurance.directions;

import com.codurance.Rover;

public interface Direction {

  Direction left();
  Direction right();
  String name();
  Rover move(int x, int y);
}
