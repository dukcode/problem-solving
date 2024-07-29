package com.dukcode.algospot.chap22_binary_search_tree;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;
import util.ProblemSolvingTest;

class Nerd2Test extends ProblemSolvingTest {

  public Nerd2Test() {
    super(1);
  }

  public static Stream<Arguments> setData() {
    return Stream.of(
        Arguments.of(
            """
                2
                4
                72 50
                57 67
                74 55
                64 60
                5
                1 5
                2 4
                3 3
                4 2
                5 1
                """,
            """
                8
                15
                """)
    );
  }

  @Override
  protected void runMain() throws Exception {
    Nerd2.main(new String[]{});
  }
}