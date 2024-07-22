package com.dukcode.algospot.chap19_queue_stack_deque;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;
import util.ProblemSolvingTest;

class ItesTest extends ProblemSolvingTest {

  public ItesTest() {
    super(15);
  }

  public static Stream<Arguments> setData() {
    return Stream.of(
        Arguments.of(
            """
                3
                8791 20
                5265 5000
                3578452 5000000
                """,
            """
                1
                4
                1049
                """)
    );
  }

  @Override
  protected void runMain() throws Exception {
    Ites.main(new String[]{});
  }
}