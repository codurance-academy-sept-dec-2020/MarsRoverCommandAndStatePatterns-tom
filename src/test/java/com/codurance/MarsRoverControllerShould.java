package com.codurance;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import com.codurance.directions.Direction;
import com.codurance.directions.East;
import com.codurance.directions.North;
import com.codurance.directions.South;
import com.codurance.directions.West;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MarsRoverControllerShould {
  @ParameterizedTest
  @CsvSource({
      "1, 2, N, M, '1:3:N'",
      "1, 3, N, MM, '1:5:N'",
      "1, 3, N, MMMMM, '1:8:N'",
      "1, 8, S, M, '1:7:S'",
      "2, 3, E, M, '2:2:E'",
      "2, 3, W, M, '1:3:W'"
  })
  public void move(int initialX, int initialY, String initialDirection, String commands, String expectedCoordinate) {
    final MarsRoverController controller = new MarsRoverController(new Rover(initialX, initialY, directionFor(initialDirection)));
    String actualCoordinate = controller.execute(commands);

    assertThat(actualCoordinate, is(expectedCoordinate));
  }

  @ParameterizedTest
  @CsvSource({
      "N, R, E",
      "N, RR, S",
      "N, L, W",
      "N, LL, S",
      "E, R, S",
      "E, RR, W",
      "E, L, N",
      "E, LL, W",
      "S, L, E",
      "S, LL, N",
      "S, R, W",
      "S, RR, N",
      "W, L, S",
      "W, LL, E",
      "W, R, N",
      "W, RR, E"
  })
  void turn(String initialPosition, String commands, String expectedDirection) {
    Rover initialRover = new Rover(1, 1, directionFor(initialPosition));
    MarsRoverController controller = new MarsRoverController(initialRover);
    String actualPosition = controller.execute(commands);
    String expectedPosition = "1:1:" + expectedDirection;
    assertThat(actualPosition, is(expectedPosition));
  }

  @ParameterizedTest
  @CsvSource({
      "1, 2, N, LMLMLMLMM, '1:3:N'",
      "1, 2, N, RMRMRMRMM, '1:3:N'",
  })
  void move_and_turn(int initialX, int initialY, String initialDirection, String commands, String expectedCoordinate) {
    Rover initialRover = new Rover(initialX, initialY, directionFor(initialDirection));
    MarsRoverController controller = new MarsRoverController(initialRover);
    String actualCoordinate = controller.execute(commands);
    assertThat(actualCoordinate, is(expectedCoordinate));
  }

  private Direction directionFor(String initialDirection) {
    if (initialDirection.equals("N"))
      return new North();
    if (initialDirection.equals("E"))
      return new East();
    if (initialDirection.equals("S"))
      return new South();
    return new West();
  }
}
