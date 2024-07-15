package com.dukcode.jongman.chap07_divide_and_conquer;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;

import com.dukcode.algospot.chap07_divide_and_conquer.QuadTree;

import util.ProblemSolvingTest;

class QuadTreeTest extends ProblemSolvingTest {

  public QuadTreeTest() {
    super(3);
  }

  public static Stream<Arguments> setData() {
    return Stream.of(
        Arguments.of(
            """
                3
                w
                xbbww
                xbbwxbwbw
                """,
            """
                w
                xwwbb
                xwxbwbwbb
                """));
  }

  @Override
  protected void runMain() throws Exception {
    QuadTree.main(new String[] {});
  }

}
