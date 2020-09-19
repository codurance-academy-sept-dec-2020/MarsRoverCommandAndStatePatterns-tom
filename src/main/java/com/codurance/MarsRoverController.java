package com.codurance;

import com.codurance.commands.CommandFactory;

public class MarsRoverController {

  private static final String INTO_CHARACTERS = "";
  private static final String COORDINATE_FORMAT = "%d:%d:%s";
  private Rover rover;

  public MarsRoverController(Rover rover) {
    this.rover = rover;
  }

  public String execute(String input) {
    for (String command : commandsFrom(input)){
      rover = CommandFactory.commandFrom(command).execute(rover);
    }

    return formatCoordinate();
  }

  private String formatCoordinate() {
    return String.format(COORDINATE_FORMAT, rover.x(), rover.y(), rover.direction());
  }

  private String[] commandsFrom(String input) {
    return input.split(INTO_CHARACTERS);
  }
}
