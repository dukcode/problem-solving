package com.dukcode.baekjoon.daijkstra;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;
import util.ProblemSolvingTest;

class B1753Test extends ProblemSolvingTest {

  public B1753Test() {
    super(1);
  }

  public static Stream<Arguments> setData() {
    return Stream.of(
        Arguments.of(
            """
                5 6
                1
                5 1 1
                1 2 2
                1 3 3
                2 3 4
                2 4 5
                3 4 6
                """,
            """
                0
                2
                3
                7
                INF
                """)
    );
  }

  @Override
  protected void runMain() throws Exception {
    B1753.main(new String[0]);
  }
}