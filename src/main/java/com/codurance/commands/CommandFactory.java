package com.codurance.commands;

import com.codurance.Rover;
import java.util.HashMap;
import java.util.Map;

public class CommandFactory {

  private Rover rover;
  private static final String MOVE = "M";
  private static final String LEFT = "L";
  private static final String RIGHT = "R";
  private String EMPTY = "";

  private Map<String, Command> commands;

  public CommandFactory(Rover rover) {
    commands = new HashMap<>();
    commands.put(MOVE, new MoveCommand(rover));
    commands.put(LEFT, new TurnLeftCommand(rover));
    commands.put(RIGHT, new TurnRightCommand(rover));
    commands.put(EMPTY, new EmptyCommand(rover));
  }

  public Command commandFrom(String command) {
    return commands.get(command);
  }
}
