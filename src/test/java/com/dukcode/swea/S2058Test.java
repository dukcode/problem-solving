package com.dukcode.swea;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;
import util.ProblemSolvingTest;

class S2058Test extends ProblemSolvingTest {

  public S2058Test() {
    super(30);
  }

  public static Stream<Arguments> setData() {
    return Stream.of(
        Arguments.of(
            """
                6789
                """,
            """
                30
                """)
    );
  }

  @Override
  protected void runMain() throws Exception {
    S2058.main(new String[]{});
  }
}
