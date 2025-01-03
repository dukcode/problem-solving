package com.dukcode.baekjoon.simulation;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;
import util.ProblemSolvingTest;

class B17822Test extends ProblemSolvingTest {

  public B17822Test() {
    super(1);
  }

  public static Stream<Arguments> setData() {
    return Stream.of(
        Arguments.of(
            """
                4 4 1
                1 1 2 3
                5 2 4 2
                3 1 3 5
                2 1 3 2
                2 0 1
                """,
            """
                30
                """
        ),
        Arguments.of(
            """
                4 4 2
                1 1 2 3
                5 2 4 2
                3 1 3 5
                2 1 3 2
                2 0 1
                3 1 3
                """,
            """
                22
                """
        ),
        Arguments.of(
            """
                4 4 3
                1 1 2 3
                5 2 4 2
                3 1 3 5
                2 1 3 2
                2 0 1
                3 1 3
                2 0 2
                """,
            """
                22
                """
        ),
        Arguments.of(
            """
                4 4 4
                1 1 2 3
                5 2 4 2
                3 1 3 5
                2 1 3 2
                2 0 1
                3 1 3
                2 0 2
                3 1 1
                """,
            """
                0
                """
        ),
        Arguments.of(
            """
                4 6 3
                1 2 3 4 5 6
                2 3 4 5 6 7
                3 4 5 6 7 8
                4 5 6 7 8 9
                2 1 4
                3 0 1
                2 1 2
                """,
            """
                26
                """
        )
    );
  }

  @Override
  protected void runMain() throws Exception {
    B17822.main(null);
  }
}