package com.codurance.commands;

import com.codurance.Rover;

public class TurnLeftCommand implements Command {

  private final Rover rover;

  public TurnLeftCommand(Rover rover) {
    this.rover = rover;
  }

  @Override
  public Rover execute() {
    return rover.left();
  }
}
