package com.dukcode.algospot.chap08_dynamic_programming;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;
import util.ProblemSolvingTest;

class Tiling2Test extends ProblemSolvingTest {

  public Tiling2Test() {
    super(1);
  }

  public static Stream<Arguments> setData() {
    return Stream.of(
        Arguments.of(
            """
                3
                1
                5
                100
                """,
            """
                1
                8
                782204094
                """)
    );
  }

  @Override
  protected void runMain() throws Exception {
    Tiling2.main(new String[]{});
  }
}
