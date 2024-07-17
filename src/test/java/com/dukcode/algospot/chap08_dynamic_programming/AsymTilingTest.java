package com.dukcode.algospot.chap08_dynamic_programming;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;
import util.ProblemSolvingTest;

class AsymTilingTest extends ProblemSolvingTest {

  public AsymTilingTest() {
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
                0
                2
                913227494
                """)
    );
  }

  @Override
  protected void runMain() throws Exception {
    AsymTiling.main(new String[]{});
  }
}
