package com.dukcode.acmicpc.chap06_brute_force;

import com.dukcode.algospot.chap06_brute_force.Boggle;
import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;
import util.ProblemSolvingTest;

class BoggleTest extends ProblemSolvingTest {

  public BoggleTest() {
    super(3);
  }

  public static Stream<Arguments> setData() {
    return Stream.of(
        Arguments.of(
            """
                1
                URLPM
                XPRET
                GIAET
                XTNZY
                XOQRS
                6
                PRETTY
                GIRL
                REPEAT
                KARA
                PANDORA
                GIAZAPX
                """,
            """
                PRETTY YES
                GIRL YES
                REPEAT YES
                KARA NO
                PANDORA NO
                GIAZAPX YES
                """)
        );
  }

  @Override
  protected void runMain() throws Exception {
    Boggle.main(new String[]{});
  }

}
