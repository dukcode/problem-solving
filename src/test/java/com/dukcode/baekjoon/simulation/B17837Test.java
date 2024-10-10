package com.dukcode.baekjoon.simulation;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;
import util.ProblemSolvingTest;

class B17837Test extends ProblemSolvingTest {

  public B17837Test() {
    super(5);
  }

  public static Stream<Arguments> setData() {
    return Stream.of(
        Arguments.of(
            """
                6 10
                0 1 2 0 1 1
                1 2 0 1 1 0
                2 1 0 1 1 0
                1 0 1 1 0 2
                2 0 1 2 0 1
                0 2 1 0 2 1
                1 1 1
                2 2 2
                3 3 4
                4 4 1
                5 5 3
                6 6 2
                1 6 3
                6 1 2
                2 4 3
                4 2 1
                """,
            """
                7
                """
        ),
        Arguments.of(
            """
                4 4
                0 0 2 0
                0 0 1 0
                0 0 1 2
                0 2 0 0
                2 1 1
                3 2 3
                2 2 1
                4 1 2
                """,
            """
                -1
                """
        ),
        Arguments.of(
            """
                4 4
                0 0 0 0
                0 0 0 0
                0 0 0 0
                0 0 0 0
                1 1 1
                1 2 1
                1 3 1
                3 3 3
                """,
            """
                2
                """
        ),
        Arguments.of(
            """
                4 4
                0 0 0 0
                0 0 0 0
                0 0 0 0
                0 0 0 0
                1 1 1
                1 2 1
                1 3 1
                1 4 1
                """,
            """
                1
                """
        ),
        Arguments.of(
            """
                4 4
                0 0 0 0
                0 0 0 0
                0 0 0 0
                0 0 0 0
                1 1 1
                1 2 1
                1 3 1
                2 4 3
                """,
            """
                1
                """
        )
    );
  }

  @Override
  protected void runMain() throws Exception {
    B17837.main(null);
  }
}