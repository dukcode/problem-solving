package com.dukcode.algospot.chap18_linear_data_structure;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;
import util.ProblemSolvingTest;

class JosephusTest extends ProblemSolvingTest {

  public JosephusTest() {
    super(1);
  }

  public static Stream<Arguments> setData() {
    return Stream.of(
        Arguments.of(
            """
                2
                6 3
                40 3
                """,
            """
                3 5
                11 26
                """)
    );
  }

  @Override
  protected void runMain() throws Exception {
    Josephus.main(new String[]{});
  }
}
