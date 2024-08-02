package com.dukcode.baekjoon.binary_search;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B3151 {

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
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }

    Arrays.sort(arr);

    long cnt = 0;
    for (int first = 0; first < n; first++) {
      for (int second = first + 1; second < n; second++) {
        int counter = -arr[first] - arr[second];
        int st = Arrays.binarySearch(arr, second + 1, n, counter);

        if (st < 0) {
          continue;
        }

        int en = st;
        while (en < n && arr[en] == counter) {
          en++;
        }

        while (st > second + 1 && arr[st - 1] == counter) {
          st--;
        }

        cnt += en - st;
      }
    }

    bw.write(String.valueOf(cnt));

    br.close();
    bw.close();
  }


}
