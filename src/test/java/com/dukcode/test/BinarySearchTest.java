package com.dukcode.test;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class BinarySearchTest {

  @Test
  void test() {
    int n = 10;
    int[] arr = {1, 2, 2, 3, 4, 4, 5, 5, 5, 6};

    assertThat(lowerBound(arr, 2, 0, n)).isEqualTo(1);
    assertThat(upperBound(arr, 2, 0, n)).isEqualTo(3);
  }

  @Test
  void test2() {
    int n = 10;
    int[] arr = {1, 3, 3, 3, 4, 4, 5, 5, 5, 6};

    assertThat(lowerBound(arr, 2, 0, n)).isEqualTo(1);
    assertThat(upperBound(arr, 2, 0, n)).isEqualTo(1);
  }

  @Test
  void test3() {
    int n = 10;
    int[] arr = {10, 30, 30, 30, 40, 40, 50, 50, 50, 60};

    assertThat(lowerBound(arr, 2, 0, n)).isEqualTo(0);
    assertThat(upperBound(arr, 2, 0, n)).isEqualTo(0);
  }

  @Test
  void test4() {
    int n = 10;
    int[] arr = {10, 30, 30, 30, 40, 40, 50, 50, 50, 60};

    assertThat(lowerBound(arr, 100, 0, n)).isEqualTo(10);
    assertThat(upperBound(arr, 100, 0, n)).isEqualTo(10);
  }

  private int lowerBound(int[] arr, int target, int st, int en) {
    while (st < en) {
      int half = (st + en) / 2;

      if (arr[half] < target) {
        st = half + 1;
      } else {
        en = half;
      }

    }

    return st;
  }

  private int upperBound(int[] arr, int target, int st, int en) {
    while (st < en) {
      int half = (st + en) / 2;

      if (arr[half] <= target) {
        st = half + 1;
      } else {
        en = half;
      }

    }

    return st;
  }

}
