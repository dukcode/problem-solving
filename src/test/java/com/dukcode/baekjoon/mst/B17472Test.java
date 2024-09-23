package com.dukcode.baekjoon.mst;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;
import util.ProblemSolvingTest;

class B17472Test extends ProblemSolvingTest {

  public B17472Test() {
    super(3);
  }

  public static Stream<Arguments> setData() {
    return Stream.of(
        Arguments.of(
            """
                7 8
                0 0 0 0 0 0 1 1
                1 1 0 0 0 0 1 1
                1 1 0 0 0 0 0 0
                1 1 0 0 0 1 1 0
                0 0 0 0 0 1 1 0
                0 0 0 0 0 0 0 0
                1 1 1 1 1 1 1 1
                """,
            """
                9
                """)

    );
  }

  @Override
  protected void runMain() throws Exception {
    B17472.main(new String[]{});
  }

}
