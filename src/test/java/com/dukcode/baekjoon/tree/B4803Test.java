package com.dukcode.baekjoon.tree;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;
import util.ProblemSolvingTest;

class B4803Test extends ProblemSolvingTest {

  public B4803Test() {
    super(1.0);
  }

  public static Stream<Arguments> setData() {
    return Stream.of(
        Arguments.of(
            """
                6 3
                1 2
                2 3
                3 4
                6 5
                1 2
                2 3
                3 4
                4 5
                5 6
                6 6
                1 2
                2 3
                1 3
                4 5
                5 6
                6 4
                0 0
                """,
            """
                Case 1: A forest of 3 trees.
                Case 2: There is one tree.
                Case 3: No trees.
                """)
    );
  }

  @Override
  protected void runMain() throws Exception {
    B4803.main(new String[0]);
  }
}