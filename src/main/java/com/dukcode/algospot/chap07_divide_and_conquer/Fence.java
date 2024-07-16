package com.dukcode.algospot.chap07_divide_and_conquer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Fence {

  private static BufferedReader br;
  private static BufferedWriter bw;
  private static StringTokenizer st;

  private static int n;
  private static int[] arr;

  public static void main(String[] args) throws IOException {
    br = new BufferedReader(new InputStreamReader(System.in));
    bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int c = Integer.parseInt(br.readLine());
    while (c-- > 0) {
      n = Integer.parseInt(br.readLine());
      arr = new int[n];
      st = new StringTokenizer(br.readLine());
      for (int i = 0; i < n; i++) {
        arr[i] = Integer.parseInt(st.nextToken());
      }

      bw.write(String.valueOf(solve(0, n - 1)));
      bw.newLine();
    }

    br.close();
    bw.close();
  }

  private static int solve(int l, int r) {
    if (l == r) {
      return arr[l];
    }

    int half = (l + r) / 2;

    int ret = Math.max(solve(l, half), solve(half + 1, r));

    int left = half;
    int right = half + 1;
    int height = Math.min(arr[left], arr[right]);
    ret = Math.max(ret, 2 * height);

    while (l < left || right < r) {
      if (right == r || (l < left && arr[left - 1] > arr[right + 1])) {
        height = Math.min(height, arr[--left]);
      } else {
        height = Math.min(height, arr[++right]);
      }
      ret = Math.max(ret, height * (right - left + 1));
    }

    return ret;
  }

}
