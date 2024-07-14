package com.dukcode.algospot.chap06_brute_force;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;
import util.ProblemSolvingTest;

class BoardCoverTest extends ProblemSolvingTest {

  public BoardCoverTest() {
    super(3);
  }

  public static Stream<Arguments> setData() {
    return Stream.of(
        Arguments.of(
            """
                3
                3 7
                #.....#
                #.....#
                ##...##
                3 7
                #.....#
                #.....#
                ##..###
                8 10
                ##########
                #........#
                #........#
                #........#
                #........#
                #........#
                #........#
                ##########
                """,
            """
                0
                2
                1514
                """)
    );
  }

  @Override
  protected void runMain() throws Exception {
    BoardCover.main(new String[]{});
  }

}
