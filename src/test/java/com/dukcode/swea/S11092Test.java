package com.dukcode.swea;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;
import util.ProblemSolvingTest;

class S11092Test extends ProblemSolvingTest {

  public S11092Test() {
    super(1);
  }

  public static Stream<Arguments> setData() {
    return Stream.of(
        Arguments.of(
            """
                3
                5
                1 1 2 3 3
                10
                3 10 5 5 8 3 9 1 3 3
                20
                4 1 6 7 9 4 1 4 8 4 1 6 5 3 1 4 3 1 10 10
                """,
            """
                #1 4
                #2 6
                #3 18
                """)
    );
  }

  @Override
  protected void runMain() throws Exception {
    S11092.main(new String[]{});
  }
}
