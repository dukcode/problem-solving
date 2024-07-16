package com.dukcode.algospot.chap08_dynamic_programming;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;
import util.ProblemSolvingTest;

class JlisTest extends ProblemSolvingTest {

  public JlisTest() {
    super(2);
  }

  public static Stream<Arguments> setData() {
    return Stream.of(
        Arguments.of(
            """
                3
                3 3
                1 2 4
                3 4 7
                3 3
                1 2 3
                4 5 6
                5 3
                10 20 30 1 2
                10 20 30
                """,
            """
                5
                6
                5
                """)
    );
  }

  @Override
  protected void runMain() throws Exception {
    Jlis.main(new String[]{});
  }
}
