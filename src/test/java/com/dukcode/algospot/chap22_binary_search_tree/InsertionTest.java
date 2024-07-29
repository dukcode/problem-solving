package com.dukcode.algospot.chap22_binary_search_tree;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;
import util.ProblemSolvingTest;

class InsertionTest extends ProblemSolvingTest {

  public InsertionTest() {
    super(1);
  }

  public static Stream<Arguments> setData() {
    return Stream.of(
        Arguments.of(
            """
                2
                5
                0 1 1 2 3
                4
                0 1 2 3
                """,
            """
                5 1 4 3 2
                4 3 2 1
                """)
    );
  }

  @Override
  protected void runMain() throws Exception {
    Insertion.main(new String[]{});
  }
}