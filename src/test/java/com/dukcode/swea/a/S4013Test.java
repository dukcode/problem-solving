package com.dukcode.swea.a;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;
import util.ProblemSolvingTest;

class S4013Test extends ProblemSolvingTest {


  public S4013Test() {
    super(3);
  }

  public static Stream<Arguments> setData() {
    return Stream.of(
        Arguments.of(
            """
                7
                2
                1 0 1 0 0 1 0 1
                0 0 1 0 1 1 1 1
                0 0 1 1 0 0 0 1
                0 1 0 1 1 0 0 0
                2 -1
                1 1
                7
                0 0 1 1 0 1 1 1
                0 1 0 1 1 0 0 0
                1 1 1 0 0 0 0 1
                1 1 1 0 0 1 0 0
                4 1
                2 1
                2 -1
                3 1
                2 1
                4 1
                2 -1
                10
                1 0 0 0 0 0 0 1
                1 0 1 0 1 1 0 1
                1 0 0 1 0 0 0 1
                1 1 0 1 0 1 1 1
                2 1
                1 1
                2 -1
                3 1
                3 -1
                2 -1
                2 -1
                1 1
                4 1
                4 1
                10
                0 1 0 0 1 1 0 0
                0 1 1 0 1 0 1 1
                0 0 0 0 0 1 1 0
                0 0 1 0 1 0 1 1
                3 1
                1 -1
                2 1
                4 -1
                3 1
                3 -1
                4 -1
                2 -1
                1 -1
                3 -1
                10
                0 1 0 1 0 1 0 0
                0 1 1 1 1 1 0 1
                1 0 0 0 0 1 1 0
                1 0 0 0 0 0 0 1
                1 1
                4 -1
                4 -1
                2 -1
                2 -1
                2 -1
                3 -1
                2 1
                3 1
                3 -1
                20
                1 0 0 0 1 1 0 0
                1 0 0 1 1 1 0 0
                0 1 1 1 0 1 1 1
                1 1 1 1 0 1 1 1
                1 1
                4 -1
                4 -1
                2 -1
                3 -1
                1 1
                4 1
                4 -1
                4 -1
                4 -1
                3 -1
                3 -1
                4 -1
                4 -1
                2 -1
                1 1
                3 -1
                3 -1
                2 1
                1 1
                20
                0 0 1 1 1 0 1 0
                0 1 0 0 1 0 1 0
                1 1 1 0 1 0 1 0
                0 0 1 0 0 1 1 1
                1 -1
                4 -1
                3 -1
                1 1
                4 1
                2 1
                1 -1
                4 1
                2 -1
                4 -1
                1 1
                4 -1
                1 1
                2 -1
                1 -1
                3 -1
                1 1
                2 1
                3 1
                3 -1
                
                """,
            """
                #1 13
                #2 15
                #3 10
                #4 2
                #5 6
                #6 5
                #7 4
                """)
    );
  }

  @Override
  protected void runMain() throws Exception {
    S4013.main(new String[0]);
  }
}