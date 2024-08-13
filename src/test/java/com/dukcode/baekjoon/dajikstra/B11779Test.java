package com.dukcode.baekjoon.dajikstra;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;
import util.ProblemSolvingTest;

class B11779Test extends ProblemSolvingTest {

  public B11779Test() {
    super(1);
  }

  public static Stream<Arguments> setData() {
    return Stream.of(
        Arguments.of(
            """
                5
                8
                1 2 2
                1 3 3
                1 4 1
                1 5 10
                2 4 2
                3 4 1
                3 5 1
                4 5 3
                1 5
                """,
            """
                4
                3
                1 4 5
                """)
    );
  }

  @Override
  protected void runMain() throws Exception {
    B11779.main(new String[0]);
  }
}