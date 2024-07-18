package com.dukcode.algospot.chap08_dynamic_programming;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;
import util.ProblemSolvingTest;

class PolyTest extends ProblemSolvingTest {

  public PolyTest() {
    super(1);
  }

  public static Stream<Arguments> setData() {
    return Stream.of(
        Arguments.of(
            """
                3
                2
                4
                92
                """,
            """
                2
                19
                4841817
                """)
    );
  }

  @Override
  protected void runMain() throws Exception {
    Poly.main(new String[]{});
  }
}
