package com.dukcode.algospot.chap30_shortest_path_problem;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;
import util.ProblemSolvingTest;

class RoutingTest extends ProblemSolvingTest {

  public RoutingTest() {
    super(1.0);
  }

  public static Stream<Arguments> setData() {
    return Stream.of(
        Arguments.of(
            """
                1
                7 14
                0 1 1.3
                0 2 1.1
                0 3 1.24
                3 4 1.17
                3 5 1.24
                3 1 2
                1 2 1.31
                1 2 1.26
                1 4 1.11
                1 5 1.37
                5 4 1.24
                4 6 1.77
                5 6 1.11
                2 6 1.2
                """,
            """
                1.3200000000
                """)
    );
  }

  @Override
  protected void runMain() throws Exception {
    Routing.main(new String[0]);
  }
}