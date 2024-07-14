package com.dukcode.algospot.chap06_brute_force;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;
import util.ProblemSolvingTest;

class ClockSyncTest extends ProblemSolvingTest {

  public ClockSyncTest() {
    super(3);
  }

  public static Stream<Arguments> setData() {
    return Stream.of(
        Arguments.of(
            """
                2
                12 6 6 6 6 6 12 12 12 12 12 12 12 12 12 12
                12 9 3 12 6 6 9 3 12 9 12 9 12 12 6 6
                """,
            """
                2
                9
                """)
    );
  }

  @Override
  protected void runMain() throws Exception {
    ClockSync.main(new String[]{});
  }

}
