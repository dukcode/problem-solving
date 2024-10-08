package com.dukcode.algospot.chap30_shortest_path_problem;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;
import util.ProblemSolvingTest;

class FireTrucksTest extends ProblemSolvingTest {

  public FireTrucksTest() {
    super(2.0);
  }

  public static Stream<Arguments> setData() {
    return Stream.of(
        Arguments.of(
            """
                1
                8 12 3 2
                1 2 3
                1 6 9
                2 3 6
                3 4 4
                3 5 2
                4 5 7
                6 5 5
                8 6 5
                6 7 3
                8 7 3
                7 5 1
                2 8 3
                2 3 5
                4 6
                """,
            """
                16
                """)
    );
  }

  @Override
  protected void runMain() throws Exception {
    FireTrucks.main(new String[0]);
  }
}