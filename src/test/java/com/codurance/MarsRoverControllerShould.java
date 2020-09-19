package com.codurance;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MarsRoverControllerShould {
  @ParameterizedTest
  @CsvSource({
      "1, 2, N, M, '1 3 N'",
      "1, 3, N, MM, '1 5 N'",
      "1, 3, N, MMMMM, '1 8 N'",
      "1, 8, S, M, '1 7 S'"
  })
  public void move(int initialX, int initialY, String initialDirection, String commands, String expectedCoordinate) {
    final MarsRoverController rover = new MarsRoverController(new Rover(initialX, initialY, directionFor(initialDirection)));
    String actualCoordinate = rover.execute(commands);

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
