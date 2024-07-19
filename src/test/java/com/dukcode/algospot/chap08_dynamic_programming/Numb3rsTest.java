package com.dukcode.algospot.chap08_dynamic_programming;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;
import util.ProblemSolvingTest;

class Numb3rsTest extends ProblemSolvingTest {

  public Numb3rsTest() {
    super(2);
  }

  public static Stream<Arguments> setData() {
    return Stream.of(
        Arguments.of(
            """
                2
                5 2 0
                0 1 1 1 0
                1 0 0 0 1
                1 0 0 0 0
                1 0 0 0 0
                0 1 0 0 0
                3
                0 2 4
                8 2 3
                0 1 1 1 0 0 0 0
                1 0 0 1 0 0 0 0
                1 0 0 1 0 0 0 0
                1 1 1 0 1 1 0 0
                0 0 0 1 0 0 1 1
                0 0 0 1 0 0 0 1
                0 0 0 0 1 0 0 0
                0 0 0 0 1 1 0 0
                4
                3 1 2 6
                """,
            """
                0.83333333 0.00000000 0.16666667
                0.43333333 0.06666667 0.06666667 0.06666667
                """)
    );
  }

  @Override
  protected void runMain() throws Exception {
    Numb3rs.main(new String[]{});
  }
}
