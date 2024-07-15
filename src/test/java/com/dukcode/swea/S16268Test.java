package com.dukcode.swea;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;
import util.ProblemSolvingTest;

class S16268Test extends ProblemSolvingTest {

  public S16268Test() {
    super(1);
  }

  public static Stream<Arguments> setData() {
    return Stream.of(
        Arguments.of(
            """
                3
                3 5
                2 1 1 2 2
                2 2 1 2 2
                2 2 1 1 2
                5 5
                3 4 1 2 3
                3 4 1 3 2
                2 3 2 4 1
                1 4 4 1 3
                2 2 3 4 4
                5 8
                1 3 4 4 4 4 3 3
                4 1 2 4 3 1 4 4
                4 1 4 4 1 4 2 1
                3 2 4 2 1 1 2 1
                4 4 1 4 4 2 2 2
                """,
            """
                #1 8
                #2 16
                #3 17
                """)
    );
  }

  @Override
  protected void runMain() throws Exception {
    S16268.main(new String[]{});
  }
}
