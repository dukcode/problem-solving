package com.dukcode.algospot.chap08_dynamic_programming;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;
import util.ProblemSolvingTest;

class TrianglePathTest extends ProblemSolvingTest {

  public TrianglePathTest() {
    super(5);
  }

  public static Stream<Arguments> setData() {
    return Stream.of(
        Arguments.of(
            """
                2
                5
                6
                1  2
                3  7  4
                9  4  1  7
                2  7  5  9  4
                5
                1
                2 4
                8 16 8
                32 64 32 64
                128 256 128 256 128
                """,
            """
                28
                341
                """)
    );
  }

  @Override
  protected void runMain() throws Exception {
    TrianglePath.main(new String[]{});
  }
}
