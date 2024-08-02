package com.dukcode.baekjoon.binary_search;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;
import util.ProblemSolvingTest;

class B3151Test extends ProblemSolvingTest {

  public B3151Test() {
    super(4);
  }

  public static Stream<Arguments> setData() {
    return Stream.of(
        Arguments.of(
            """
                5
                -5 -4 0 4 5
                """,
            """
                2
                """),
        Arguments.of(
            """
                10
                2 -5 2 3 -4 7 -4 0 1 -6
                """,
            """
                6
                """)
    );
  }

  @Override
  protected void runMain() throws Exception {
    B3151.main(new String[0]);
  }
}