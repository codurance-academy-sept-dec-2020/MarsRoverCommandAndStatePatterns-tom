package com.codurance;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import com.codurance.directions.Direction;
import com.codurance.directions.East;
import com.codurance.directions.North;
import com.codurance.directions.South;
import com.codurance.directions.West;
import com.codurance.position.Coordinate;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MarsRoverControllerShould {
  Grid grid;
  Rover rover;
  MarsRoverController controller;

  @BeforeEach
  void setUp() {
    grid = new Grid();
    rover = new Rover(grid);
    controller = new MarsRoverController(rover);
  }

  @ParameterizedTest
  @CsvSource({
      "M, '0:1:N'",
      "MM, '0:2:N'",
      "MMMMM, '0:5:N'"
  })
  public void move(String commands, String expectedCoordinate) {
    final MarsRoverController controller = new MarsRoverController(new Rover(grid));
    String actualCoordinate = controller.execute(commands);

    assertThat(actualCoordinate, is(expectedCoordinate));
  }

  @ParameterizedTest
  @CsvSource({
      "R, E",
      "RR, S",
      "L, W",
      "LL, S"
  })
  void turn(String commands, String expectedDirection) {
    String actualPosition = controller.execute(commands);
    String expectedPosition = "0:0:" + expectedDirection;
    assertThat(actualPosition, is(expectedPosition));
  }

  @ParameterizedTest
  @CsvSource({
      "LMLMLMLMM, '0:1:N'",
      "RMRMRMRMM, '0:1:N'",
  })
  void move_and_turn(String commands, String expectedCoordinate) {
    String actualCoordinate = controller.execute(commands);
    assertThat(actualCoordinate, is(expectedCoordinate));
  }

  @ParameterizedTest
  @CsvSource({
    "LMM, '8:0:W'"
  })
  void wraps(String commands, String expectedCoordinate) {
    String actualCoordinate = controller.execute(commands);
    assertThat(actualCoordinate, is(expectedCoordinate));
  }

  @Test
  void stops_at_obstacle() {
    grid = new Grid(List.of(new Coordinate(0, 2)));
    rover = new Rover(grid);
    controller = new MarsRoverController(rover);
    String actualCoordinate = controller.execute("MM");
    assertThat(actualCoordinate, is("O:0:1:N"));
  }
}
