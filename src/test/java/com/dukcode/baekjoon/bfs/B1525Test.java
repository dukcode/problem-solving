package com.dukcode.baekjoon.bfs;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;
import util.ProblemSolvingTest;

class B1525Test extends ProblemSolvingTest {

  public B1525Test() {
    super(3);
  }

  public static Stream<Arguments> setData() {
    return Stream.of(
        Arguments.of(
            """
                1 0 3
                4 2 5
                7 8 6
                """,
            """
                3
                """),
        Arguments.of(
            """
                3 6 0
                8 1 2
                7 4 5
                """,
            """
                -1
                """)
    );
  }

  @Override
  protected void runMain() throws Exception {
    B1525.main(new String[]{});
  }

}
