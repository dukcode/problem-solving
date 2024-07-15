package com.dukcode.swea;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;
import util.ProblemSolvingTest;

class S2071Test extends ProblemSolvingTest {

  public S2071Test() {
    super(30);
  }

  public static Stream<Arguments> setData() {
    return Stream.of(
        Arguments.of(
            """
                3
                3 17 1 39 8 41 2 32 99 2
                22 8 5 123 7 2 63 7 3 46
                6 63 2 3 58 76 21 33 8 1
                """,
            """
                #1 24
                #2 29
                #3 27
                """)
    );
  }

  @Override
  protected void runMain() throws Exception {
    S2071.main(new String[]{});
  }
}
