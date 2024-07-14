package com.dukcode.jongman.chap06_brute_force;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NextPermutation {

  private static BufferedReader br;
  private static BufferedWriter bw;
  private static StringTokenizer st;

  private static int n;
  private static int[] arr;

  public static void main(String[] args) throws IOException {
    br = new BufferedReader(new InputStreamReader(System.in));
    bw = new BufferedWriter(new OutputStreamWriter(System.out));

    n = Integer.parseInt(br.readLine());

    arr = new int[n];
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < n; ++i) {
      arr[i] = Integer.parseInt(st.nextToken());
    }

    Arrays.sort(arr);

    do {
      for (int num : arr) {
        bw.write(String.valueOf(num));
        bw.write(' ');
      }
      bw.newLine();
    } while (nextPermutation());

    br.close();
    bw.close();

  }

  private static boolean nextPermutation() {
    int l = n - 2;
    while (l >= 0 && arr[l] >= arr[l + 1]) {
      l--;
    }

    if (l == -1) {
      return false;
    }

    int r = n - 1;
    while (r >= 0 && arr[l] >= arr[r]) {
      r--;
    }

    swap(l, r);

    int st = l + 1;
    int en = n - 1;
    while (st < en) {
      swap(st++, en--);
    }

    return true;
  }

  private static void swap(int a, int b) {
    int tmp = arr[a];
    arr[a] = arr[b];
    arr[b] = tmp;
  }

}
