package com.dukcode.algospot.chap21_tree;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;
import util.ProblemSolvingTest;

class FortressTest extends ProblemSolvingTest {

  public FortressTest() {
    super(1);
  }

  public static Stream<Arguments> setData() {
    return Stream.of(
        Arguments.of(
            """
                2
                3
                5 5 15
                5 5 10
                5 5 5
                8
                21 15 20
                15 15 10
                13 12 5
                12 12 3
                19 19 2
                30 24 5
                32 10 7
                32 9 4
                """,
            """
                2
                5
                """)
    );
  }

  @Override
  protected void runMain() throws Exception {
    Fortress.main(new String[]{});
  }
}