package com.dukcode.jongman.chap06_brute_force;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;
import util.ProblemSolvingTest;

class NextPermutationTest extends ProblemSolvingTest {

  public NextPermutationTest() {
    super(3);
  }

  public static Stream<Arguments> setData() {
    return Stream.of(
        Arguments.of(
            """
                3
                1 2 3
                """,
            """
                1 2 3
                1 3 2
                2 1 3
                2 3 1
                3 1 2
                3 2 1
                """),
        Arguments.of(
            """
                4
                0 0 1 1
                """,
            """
                0 0 1 1
                0 1 0 1
                0 1 1 0
                1 0 0 1
                1 0 1 0
                1 1 0 0
                """)
    );
  }

  @Override
  protected void runMain() throws Exception {
    NextPermutation.main(new String[]{});
  }

}
