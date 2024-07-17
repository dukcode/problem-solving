package com.dukcode.algospot.chap08_dynamic_programming;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;
import util.ProblemSolvingTest;

class TriPathCntTest extends ProblemSolvingTest {

  public TriPathCntTest() {
    super(5);
  }

  public static Stream<Arguments> setData() {
    return Stream.of(
        Arguments.of(
            """
                2
                4
                1
                1 1
                1 1 1
                1 1 1 1
                4
                9
                5 7
                1 3 2
                3 5 5 6
                """,
            """
                8
                3
                """)
    );
  }

  @Override
  protected void runMain() throws Exception {
    TriPathCnt.main(new String[]{});
  }
}
