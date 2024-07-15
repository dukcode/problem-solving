package com.dukcode.swea;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;
import util.ProblemSolvingTest;

class S20396Test extends ProblemSolvingTest {

  public S20396Test() {
    super(1);
  }

  public static Stream<Arguments> setData() {
    return Stream.of(
        Arguments.of(
            """
                3
                5 1
                0 1 0 1 0
                2 2
                5 1
                0 1 0 0 0
                2 3
                10 4
                0 1 1 0 0 1 0 1 0 1
                3 2
                5 3
                4 4
                8 4
                """,
            """
                #1 0 1 1 1 0
                #2 0 1 1 1 0
                #3 0 1 1 1 1 1 1 1 1 1
                """)
    );
  }

  @Override
  protected void runMain() throws Exception {
    S20396.main(new String[]{});
  }
}

