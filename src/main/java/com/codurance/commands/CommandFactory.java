package com.codurance.commands;

import java.util.Map;

public class CommandFactory {

  private static final String MOVE = "M";
  private static final String LEFT = "L";
  private static final String RIGHT = "R";
  private static String EMPTY = "";

  private static Map<String, Command> commands = Map.of(
      MOVE, new MoveCommand(),
      LEFT, new TurnLeftCommand(),
      RIGHT, new TurnRightCommand(),
      EMPTY, new EmptyCommand()
  );

  public static Command commandFrom(String command) {
    return commands.get(command);
  }
}
