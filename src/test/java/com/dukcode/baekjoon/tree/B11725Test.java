package com.dukcode.baekjoon.tree;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;
import util.ProblemSolvingTest;

class B11725Test extends ProblemSolvingTest {

  public B11725Test() {
    super(1.0);
  }

  public static Stream<Arguments> setData() {
    return Stream.of(
        Arguments.of(
            """
                7
                1 6
                6 3
                3 5
                4 1
                2 4
                4 7
                """,
            """
                4
                6
                1
                3
                1
                4
                """),
        Arguments.of(
            """
                12
                1 2
                1 3
                2 4
                3 5
                3 6
                4 7
                4 8
                5 9
                5 10
                6 11
                6 12
                """,
            """
                1
                1
                2
                3
                3
                4
                4
                5
                5
                6
                6
                """
        )
    );
  }

  @Override
  protected void runMain() throws Exception {
    B11725.main(new String[0]);
  }
}