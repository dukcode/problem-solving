package com.dukcode.baekjoon.scc;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;
import util.ProblemSolvingTest;

class B6543Test extends ProblemSolvingTest {

  public B6543Test() {
    super(1.0);
  }

  public static Stream<Arguments> setData() {
    return Stream.of(
        Arguments.of(
            """
                3 3
                1 3 2 3 3 1
                2 1
                1 2
                0
                """,
            """
                1 3
                2
                """),
        Arguments.of(
            """
                2 1
                2 1
                2 0
                
                5 5
                1 2 2 3 3 1 5 4 4 3
                5 5
                1 2 2 3 3 1 3 4 4 5
                5 1
                5 1
                5 6
                1 2 2 3 3 1 3 4 4 5 5 3
                0
                """,
            """
                1
                1 2
                1 2 3
                5
                1 2 3 4
                1 2 3 4 5
                """)
    );
  }

  @Override
  protected void runMain() throws Exception {
    B6543.main(new String[0]);
  }
}