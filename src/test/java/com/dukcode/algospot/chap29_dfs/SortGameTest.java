package com.dukcode.algospot.chap29_dfs;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;
import util.ProblemSolvingTest;

class SortGameTest extends ProblemSolvingTest {

  public SortGameTest() {
    super(1);
  }

  public static Stream<Arguments> setData() {
    return Stream.of(
        Arguments.of(
            """
                3
                8
                1 2 3 4 8 7 6 5
                4
                3 4 1 2
                3
                1 2 3
                """,
            """
                1
                2
                0
                """)
    );
  }

  @Override
  protected void runMain() throws Exception {
    SortGame.main(new String[0]);
  }
}