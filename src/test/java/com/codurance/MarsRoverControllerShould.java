package com.codurance;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import com.codurance.directions.Direction;
import com.codurance.directions.East;
import com.codurance.directions.North;
import com.codurance.directions.South;
import com.codurance.directions.West;
import com.codurance.position.Coordinate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MarsRoverControllerShould {
  Grid grid;

  @BeforeEach
  void setUp() {
    grid = new Grid();
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
    Rover initialRover = new Rover(grid);
    MarsRoverController controller = new MarsRoverController(initialRover);
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
    Rover initialRover = new Rover(grid);
    MarsRoverController controller = new MarsRoverController(initialRover);
    String actualCoordinate = controller.execute(commands);
    assertThat(actualCoordinate, is(expectedCoordinate));
  }

//  @ParameterizedTest
//  @CsvSource({
//
//  })
//  void wraps_around_board() {
//
//  }
}
