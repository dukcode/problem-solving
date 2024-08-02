package com.dukcode.baekjoon.binary_search;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class BinarySearchTest {

  private int countNum(int[] sortedNums, int num) {
    int st = Arrays.binarySearch(sortedNums, num);

    if (st < 0) {
      return 0;
    }

    int en = Arrays.binarySearch(sortedNums, num + 1);
    en = en < 0 ? -(en + 1) : en;

    return en - st;
  }

  @Test
  void test() {
    int[] a = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6};

    System.out.println(Arrays.binarySearch(a, 1)); // 0
    System.out.println(Arrays.binarySearch(a, 2)); // 1
    System.out.println(Arrays.binarySearch(a, 3)); // 3
    System.out.println(Arrays.binarySearch(a, 4)); // 6
    System.out.println(Arrays.binarySearch(a, 5));
    System.out.println(Arrays.binarySearch(a, 6));

    assertThat(countNum(a, 1)).isEqualTo(1);
    assertThat(countNum(a, 2)).isEqualTo(2);
    assertThat(countNum(a, 3)).isEqualTo(3);
    assertThat(countNum(a, 4)).isEqualTo(4);
    assertThat(countNum(a, 5)).isEqualTo(4);
    assertThat(countNum(a, 6)).isEqualTo(6);
  }
}
