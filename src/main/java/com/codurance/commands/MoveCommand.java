package com.codurance.commands;

import com.codurance.Rover;

public class MoveCommand implements Command {

  @Override
  public Rover execute(Rover rover) {
    return rover.move();
  }
}
