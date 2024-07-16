package com.dukcode.algospot.chap08_dynamic_programming;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;
import util.ProblemSolvingTest;

class WildCardTest extends ProblemSolvingTest {

  public WildCardTest() {
    super(2);
  }

  public static Stream<Arguments> setData() {
    return Stream.of(
        Arguments.of(
            """
                2
                he?p
                3
                help
                heap
                helpp
                *p*
                3
                help
                papa
                hello
                """,
            """
                heap
                help
                help
                papa
                """),
        Arguments.of(
            """
                1
                *abc
                1
                abc
                """,
            """
                abc
                """)
    );
  }

  @Override
  protected void runMain() throws Exception {
    WildCard.main(new String[]{});
  }
}
