package com.dukcode.baekjoon.daijkstra;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;
import util.ProblemSolvingTest;

class B1504Test extends ProblemSolvingTest {

  public B1504Test() {
    super(1);
  }

  public static Stream<Arguments> setData() {
    return Stream.of(
        Arguments.of(
            """
                4 6
                1 2 3
                2 3 3
                3 4 1
                1 3 5
                2 4 5
                1 4 4
                2 3
                """,
            """
                7
                """),
        Arguments.of(
            """
                2 1
                1 2 1000
                1 2
                """,
            """
                1000
                """),
        Arguments.of(
            """
                2 0
                1 2
                """,
            """
                -1
                """),
        Arguments.of(
            """
                4 0
                2 3
                """,
            """
                -1
                """),
        Arguments.of(
            """
                3 3
                1 3 1
                1 2 100
                2 3 200
                2 3
                """,
            """
                201
                """)
    );
  }

  @Override
  protected void runMain() throws Exception {
    B1504.main(new String[0]);
  }
}