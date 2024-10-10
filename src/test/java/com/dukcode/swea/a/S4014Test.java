package com.dukcode.swea.a;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;
import util.ProblemSolvingTest;

class S4014Test extends ProblemSolvingTest {

  public S4014Test() {
    super(5);
  }


  public static Stream<Arguments> setData() {
    return Stream.of(
        Arguments.of(
            """
                1
                6 2
                3 3 3 2 1 1
                3 3 3 2 2 1
                3 3 3 3 3 2
                2 2 3 2 2 2
                2 2 3 2 2 2
                2 2 2 2 2 2
                """,
            """
                #1 7
                """
        )
    );
  }

  @Override
  protected void runMain() throws Exception {
    S4014.main(new String[0]);
  }
}