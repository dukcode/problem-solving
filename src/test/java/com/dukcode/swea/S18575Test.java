package com.dukcode.swea;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;
import util.ProblemSolvingTest;

class S18575Test extends ProblemSolvingTest {

  public S18575Test() {
    super(1);
  }

  public static Stream<Arguments> setData() {
    return Stream.of(
        Arguments.of(
            """
                3
                4
                1 1 1 1
                1 2 1 1
                1 1 1 1
                1 1 1 1
                5
                3 3 2 2 3
                2 4 5 2 3
                4 2 1 2 4
                1 3 5 3 3
                1 4 5 2 3
                5
                1 3 5 2 3
                2 2 5 5 5
                3 4 2 1 1
                1 5 2 5 4
                5 2 3 4 1
                """,
            """
                #1 1
                #2 10
                #3 13
                """)
    );
  }

  @Override
  protected void runMain() throws Exception {
    S18575.main(new String[]{});
  }
}
