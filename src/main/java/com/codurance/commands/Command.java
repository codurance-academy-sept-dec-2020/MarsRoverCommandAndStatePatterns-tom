package com.codurance.commands;

import com.codurance.Rover;

public interface Command {
  Rover execute();
}
