package com.dukcode.algospot.chap07_divide_and_conquer;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;
import util.ProblemSolvingTest;

class FenceTest extends ProblemSolvingTest {

  public FenceTest() {
    super(1);
  }

  public static Stream<Arguments> setData() {
    return Stream.of(
        Arguments.of(
            """
                3
                7
                7 1 5 9 6 7 3
                7
                1 4 4 4 4 1 1
                4
                1 8 2 2
                """,
            """
                20
                16
                8
                """)
    );
  }

  @Override
  protected void runMain() throws Exception {
    Fence.main(new String[]{});
  }
}
