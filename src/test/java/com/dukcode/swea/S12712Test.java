package com.dukcode.swea;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;
import util.ProblemSolvingTest;

class S12712Test extends ProblemSolvingTest {

  public S12712Test() {
    super(30);
  }

  public static Stream<Arguments> setData() {
    return Stream.of(
        Arguments.of(
            """
                2
                5 2
                1 3 3 6 7
                8 13 9 12 8
                4 16 11 12 6
                2 4 1 23 2
                9 13 4 7 3
                6 3
                29 21 26 9 5 8
                21 19 8 0 21 19
                9 24 2 11 4 24
                19 29 1 0 21 19
                10 29 6 18 4 3
                29 11 15 3 3 29
                """,
            """
                #1 64
                #2 157
                """)
    );
  }

  @Override
  protected void runMain() throws Exception {
    S12712.main(new String[]{});
  }
}
