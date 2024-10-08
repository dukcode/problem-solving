package com.dukcode.algospot.chap28_dfs;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;
import util.ProblemSolvingTest;

class DictionaryTest extends ProblemSolvingTest {

  public DictionaryTest() {
    super(1);
  }

  public static Stream<Arguments> setData() {
    return Stream.of(
        Arguments.of(
            """
                3
                3
                ba
                aa
                ab
                5
                gg
                kia
                lotte
                lg
                hanhwa
                6
                dictionary
                english
                is
                ordered
                ordinary
                this
                """,
            """
                INVALID HYPOTHESIS
                ogklhabcdefijmnpqrstuvwxyz
                abcdefghijklmnopqrstuvwxyz
                """)
    );
  }

  @Override
  protected void runMain() throws Exception {
    Dictionary.main(new String[0]);
  }
}