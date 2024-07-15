package com.dukcode.swea;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;
import util.ProblemSolvingTest;

class S1933Test extends ProblemSolvingTest {

  public S1933Test() {
    super(2);
  }

  public static Stream<Arguments> setData() {
    return Stream.of(
        Arguments.of(
            """
                10
                """,
            """
                1 2 5 10
                """)
    );
  }

  @Override
  protected void runMain() throws Exception {
    S1933.main(new String[]{});
  }
}
