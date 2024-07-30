package com.dukcode.algospot.chap22_binary_search_tree;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;
import util.ProblemSolvingTest;

class RunningMedianTest extends ProblemSolvingTest {

  public RunningMedianTest() {
    super(1);
  }

  public static Stream<Arguments> setData() {
    return Stream.of(
        Arguments.of(
            """
                3
                10 1 0
                10 1 1
                10000 1273 4936
                """,
            """
                19830
                19850
                2448920
                """)
    );
  }

  @Override
  protected void runMain() throws Exception {
    RunningMedian.main(new String[0]);
  }
}