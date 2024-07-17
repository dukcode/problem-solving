package com.dukcode.algospot.chap08_dynamic_programming;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;
import util.ProblemSolvingTest;

class PiTest extends ProblemSolvingTest {

  public PiTest() {
    super(1);
  }

  public static Stream<Arguments> setData() {
    return Stream.of(
        Arguments.of(
            """
                5
                12341234
                11111222
                12122222
                22222222
                12673939
                """,
            """
                4
                2
                5
                2
                14
                """)
    );
  }

  @Override
  protected void runMain() throws Exception {
    Pi.main(new String[]{});
  }
}
