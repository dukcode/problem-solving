package com.dukcode.jongman.chap06_brute_force;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;
import util.ProblemSolvingTest;

class CombinationTest extends ProblemSolvingTest {

  public CombinationTest() {
    super(3);
  }

  public static Stream<Arguments> setData() {
    return Stream.of(
        Arguments.of(
            """
                3 2
                """,
            """
                1 2
                1 3
                2 3
                """),
        Arguments.of(
            """
                4 3
                """,
            """
                1 2 3
                1 2 4
                1 3 4
                2 3 4
                """)
    );
  }

  @Override
  protected void runMain() throws Exception {
    Combination.main(new String[]{});
  }

}
