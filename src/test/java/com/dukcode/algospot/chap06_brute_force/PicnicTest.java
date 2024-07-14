package com.dukcode.algospot.chap06_brute_force;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;
import util.ProblemSolvingTest;

class PicnicTest extends ProblemSolvingTest {

  public PicnicTest() {
    super(1);
  }

  public static Stream<Arguments> setData() {
    return Stream.of(
        Arguments.of(
            """
                3
                2 1
                0 1
                4 6
                0 1 1 2 2 3 3 0 0 2 1 3
                6 10
                0 1 0 2 1 2 1 3 1 4 2 3 2 4 3 4 3 5 4 5
                """,
            """
                1
                3
                4
                """)
        );
  }

  @Override
  protected void runMain() throws Exception {
    Picnic.main(new String[]{});
  }

}
