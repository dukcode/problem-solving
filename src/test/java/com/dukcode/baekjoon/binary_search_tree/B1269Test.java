package com.dukcode.baekjoon.binary_search_tree;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;
import util.ProblemSolvingTest;

class B1269Test extends ProblemSolvingTest {

  public B1269Test() {
    super(1);
  }

  public static Stream<Arguments> setData() {
    return Stream.of(
        Arguments.of(
            """
                3 5
                1 2 4
                2 3 4 5 6
                """,
            """
                4
                """)
    );
  }

  @Override
  protected void runMain() throws Exception {
    B1269.main(new String[]{});
  }
}