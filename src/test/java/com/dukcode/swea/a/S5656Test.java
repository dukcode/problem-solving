package com.dukcode.swea.a;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;
import util.ProblemSolvingTest;

class S5656Test extends ProblemSolvingTest {

  public S5656Test() {
    super(3);
  }

  public static Stream<Arguments> setData() {
    return Stream.of(
        Arguments.of(
            """
                1
                3 10 10
                0 0 0 0 0 0 0 0 0 0
                1 0 1 0 1 0 0 0 0 0
                1 0 3 0 1 1 0 0 0 1
                1 1 1 0 1 2 0 0 0 9
                1 1 4 0 1 1 0 0 1 1
                1 1 4 1 1 1 2 1 1 1
                1 1 5 1 1 1 1 2 1 1
                1 1 6 1 1 1 1 1 2 1
                1 1 1 1 1 1 1 1 1 5
                1 1 7 1 1 1 1 1 1 1
                """,
            """
                #1 12
                """),
        Arguments.of(
            """
                1
                2 9 10
                0 0 0 0 0 0 0 0 0
                0 0 0 0 0 0 0 0 0
                0 1 0 0 0 0 0 0 0
                0 1 0 0 0 0 0 0 0
                1 1 0 0 1 0 0 0 0
                1 1 0 1 1 1 0 1 0
                1 1 0 1 1 1 0 1 0
                1 1 1 1 1 1 1 1 0
                1 1 3 1 6 1 1 1 1
                1 1 1 1 1 1 1 1 1
                """,
            """
                #1 27
                """)
    );
  }

  @Override
  protected void runMain() throws Exception {
    S5656.main(new String[0]);
  }
}