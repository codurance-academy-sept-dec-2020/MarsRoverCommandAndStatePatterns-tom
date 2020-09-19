package com.codurance.commands;

import com.codurance.Rover;

public class TurnRightCommand implements Command {

  private final Rover rover;

  public TurnRightCommand(Rover rover) {
    this.rover = rover;
  }

  @Override
  public Rover execute() {
    return rover.right();
  }
}
