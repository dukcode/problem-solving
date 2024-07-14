package com.dukcode.jongman.chap06_brute_force;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;
import util.ProblemSolvingTest;

class TspTest extends ProblemSolvingTest {

  public TspTest() {
    super(3);
  }

  public static Stream<Arguments> setData() {
    return Stream.of(
        Arguments.of(
            """
                1
                3
                0 1 2
                1 0 3
                2 3 0
                """,
            """
                6
                """),
        Arguments.of(
            """
                1
                4
                0 10 15 20
                10 0 35 25
                15 35 0 30
                20 25 30 0
                """,
            """
                80
                """
        ),
        Arguments.of(
            """
                2
                3
                0 29 20
                29 0 15
                20 15 0
                4
                0 5 9 10
                5 0 7 12
                9 7 0 8
                10 12 8 0
                """,
            """
                64
                30
                """
        )
    );
  }

  @Override
  protected void runMain() throws Exception {
    Tsp.main(new String[]{});
  }

}
