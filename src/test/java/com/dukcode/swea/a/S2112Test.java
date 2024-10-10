package com.dukcode.swea.a;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;
import util.ProblemSolvingTest;

class S2112Test extends ProblemSolvingTest {

  public S2112Test() {
    super(5);
  }

  public static Stream<Arguments> setData() {
    return Stream.of(
        Arguments.of(
            """
                1
                6 8 3
                0 0 1 0 1 0 0 1
                0 1 0 0 0 1 1 1
                0 1 1 1 0 0 0 0
                1 1 1 1 0 0 0 1
                0 1 1 0 1 0 0 1
                1 0 1 0 1 1 0 1
                """,
            """
                #1 2
                """
        )
    );
  }

  @Override
  protected void runMain() throws Exception {
    S2112.main(new String[0]);
  }
}