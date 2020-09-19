package com.codurance;

import com.codurance.commands.CommandFactory;

public class MarsRoverController {

  private static final String INTO_CHARACTERS = "";
  private static final String COORDINATE_FORMAT = "%d:%d:%s";
  private Rover rover;
  boolean isStopped;

  public MarsRoverController(Rover rover) {
    this.rover = rover;
    this.isStopped = false;
  }

  public String execute(String input) {
    String obstacleString = "";

    for (String command : commandsFrom(input)){
      Rover oldRover = rover;
      rover = CommandFactory.commandFrom(command).execute(rover);
      obstacleString = isStopped(oldRover);
    }

    return new StringBuilder(obstacleString).append(formatCoordinate()).toString();
  }

  private String isStopped(Rover oldRover) {
    return this.rover.isStopped(oldRover) ? "O:" : "";
  }

  private String formatCoordinate() {
    return String.format(COORDINATE_FORMAT, rover.x(), rover.y(), rover.direction());
  }

  private String[] commandsFrom(String input) {
    return input.split(INTO_CHARACTERS);
  }
}
