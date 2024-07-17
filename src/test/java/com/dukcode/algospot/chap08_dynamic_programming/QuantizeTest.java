package com.dukcode.algospot.chap08_dynamic_programming;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;
import util.ProblemSolvingTest;

class QuantizeTest extends ProblemSolvingTest {

  public QuantizeTest() {
    super(3);
  }

  public static Stream<Arguments> setData() {
    return Stream.of(
        Arguments.of(
            """
                2
                10 3
                3 3 3 1 2 3 2 2 2 1
                9 3
                1 744 755 4 897 902 890 6 777
                """,
            """
                0
                651
                """),
        Arguments.of(
            """
                1
                5 3
                1 1 1 1 1
                """,
            """
                0
                """)
    );
  }

  @Override
  protected void runMain() throws Exception {
    Quantize.main(new String[]{});
  }
}
