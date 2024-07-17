package com.dukcode.algospot.chap08_dynamic_programming;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;
import util.ProblemSolvingTest;

class SnailTest extends ProblemSolvingTest {

  public SnailTest() {
    super(1);
  }

  public static Stream<Arguments> setData() {
    return Stream.of(
        Arguments.of(
            """
                4
                5 4
                5 3
                4 2
                3 2
                """,
            """
                0.9960937500
                0.8437500000
                0.5625000000
                0.9375000000
                """)
    );
  }

  @Override
  protected void runMain() throws Exception {
    Snail.main(new String[]{});
  }
}
