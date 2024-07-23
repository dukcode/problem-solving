package com.dukcode.algospot.chap21_tree;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;
import util.ProblemSolvingTest;

class TraversalTest extends ProblemSolvingTest {

  public TraversalTest() {
    super(1);
  }

  public static Stream<Arguments> setData() {
    return Stream.of(
        Arguments.of(
            """
                2
                7
                27 16 9 12 54 36 72
                9 12 16 27 36 54 72
                6
                409 479 10 838 150 441
                409 10 479 150 838 441
                """,
            """
                12 9 16 36 72 54 27
                10 150 441 838 479 409
                """)
    );
  }

  @Override
  protected void runMain() throws Exception {
    Traversal.main(new String[]{});
  }
}