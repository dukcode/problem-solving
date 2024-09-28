package com.dukcode.baekjoon.union_find;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;
import util.ProblemSolvingTest;

class B1717Test extends ProblemSolvingTest {

  public B1717Test() {
    super(3);
  }

  public static Stream<Arguments> setData() {
    return Stream.of(
        Arguments.of(
            """
                7 8
                0 1 3
                1 1 7
                0 7 6
                1 7 1
                0 3 7
                0 4 2
                0 1 1
                1 1 1
                """,
            """
                NO
                NO
                YES
                """)
    );
  }

  @Override
  protected void runMain() throws Exception {
    B1717.main(new String[]{});
  }

}
