package com.codurance.commands;

import com.codurance.Rover;

public class TurnLeftCommand implements Command {

  @Override
  public Rover execute(Rover rover) {
    return rover.left();
  }
}
