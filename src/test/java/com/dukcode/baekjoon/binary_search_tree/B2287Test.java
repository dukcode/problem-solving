package com.dukcode.baekjoon.binary_search_tree;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;
import util.ProblemSolvingTest;

class B2287Test extends ProblemSolvingTest {

  public B2287Test() {
    super(1);
  }

  public static Stream<Arguments> setData() {
    return Stream.of(
        Arguments.of(
            """
                5
                2
                12
                31168
                """,
            """
                4
                NO
                """)
    );
  }

  @Override
  protected void runMain() throws Exception {
    B2287.main(new String[0]);
  }
}