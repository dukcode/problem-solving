package com.dukcode.baekjoon.daijkstra;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;
import util.ProblemSolvingTest;

class B1238Test extends ProblemSolvingTest {

  public B1238Test() {
    super(1);
  }

  public static Stream<Arguments> setData() {
    return Stream.of(
        Arguments.of(
            """
                4 8 2
                1 2 4
                1 3 2
                1 4 7
                2 1 1
                2 3 5
                3 1 2
                3 4 4
                4 2 3
                """,
            """
                10
                """)
    );
  }

  @Override
  protected void runMain() throws Exception {
    B1238.main(new String[0]);
  }

}