package com.dukcode.swea;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;
import util.ProblemSolvingTest;

class S9367Test extends ProblemSolvingTest {

  public S9367Test() {
    super(1.5);
  }

  public static Stream<Arguments> setData() {
    return Stream.of(
        Arguments.of(
            """
                4
                5
                1 2 3 4 5
                5
                4 5 1 2 3
                5
                5 4 3 2 1
                8
                1 2 1 2 3 1 2 1
                """,
            """
                #1 5
                #2 3
                #3 1
                #4 3
                """)
    );
  }

  @Override
  protected void runMain() throws Exception {
    S9367.main(new String[]{});
  }
}
