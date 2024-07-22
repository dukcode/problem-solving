package com.dukcode.algospot.chap19_queue_stack_deque;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;
import util.ProblemSolvingTest;

class Brackets2Test extends ProblemSolvingTest {


  public Brackets2Test() {
    super(1);
  }

  public static Stream<Arguments> setData() {
    return Stream.of(
        Arguments.of(
            """
                5
                ()()
                ({[}])
                ({}[(){}])
                (()
                ())
                """,
            """
                YES
                NO
                YES
                NO
                NO
                """)
    );
  }

  @Override
  protected void runMain() throws Exception {
    Brackets2.main(new String[]{});
  }
}