package com.dukcode.jongman.chap08_dynamic_programming;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;
import util.ProblemSolvingTest;

class LisTest extends ProblemSolvingTest {

  public LisTest() {
    super(1);
  }

  public static Stream<Arguments> setData() {
    return Stream.of(
        Arguments.of(
            """
                6
                10 20 10 30 20 50
                """,
            """
                4
                """)
    );
  }

  @Override
  protected void runMain() throws Exception {
    Lis.main(new String[]{});
  }
}
