package com.dukcode.algospot.chap08_dynamic_programming;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;
import util.ProblemSolvingTest;

class JumpGameTest extends ProblemSolvingTest {

  public JumpGameTest() {
    super(3);
  }

  public static Stream<Arguments> setData() {
    return Stream.of(
        Arguments.of(
            """
                2
                7
                2 5 1 6 1 4 1
                6 1 1 2 2 9 3
                7 2 3 2 1 3 1
                1 1 3 1 7 1 2
                4 1 2 3 4 1 2
                3 3 1 2 3 4 1
                1 5 2 9 4 7 0
                7
                2 5 1 6 1 4 1
                6 1 1 2 2 9 3
                7 2 3 2 1 3 1
                1 1 3 1 7 1 2
                4 1 2 3 4 1 3
                3 3 1 2 3 4 1
                1 5 2 9 4 7 0
                """,
            """
                YES
                NO
                """)
    );
  }

  @Override
  protected void runMain() throws Exception {
    JumpGame.main(new String[]{});
  }
}
