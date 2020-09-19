package com.codurance.commands;

import com.codurance.Rover;

public class EmptyCommand implements Command {

  private final Rover rover;

  public EmptyCommand(Rover rover) {
    this.rover = rover;
  }

  @Override
  public Rover execute() {
    throw new UnsupportedOperationException("implement me");
  }
}
