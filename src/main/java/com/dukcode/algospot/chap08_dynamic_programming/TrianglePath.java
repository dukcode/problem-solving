package com.dukcode.algospot.chap08_dynamic_programming;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class TrianglePath {

  private static final int MN = -987_654_321;

  private static BufferedReader br;
  private static BufferedWriter bw;
  private static StringTokenizer st;

  private static int n;
  private static int[][] board;

  private static int[][] cache;

  public static void main(String[] args) throws IOException {
    br = new BufferedReader(new InputStreamReader(System.in));
    bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int c = Integer.parseInt(br.readLine());
    while (c-- > 0) {
      n = Integer.parseInt(br.readLine());

      board = new int[n][n];
      for (int y = 0; y < n; ++y) {
        st = new StringTokenizer(br.readLine());
        for (int x = 0; x <= y; ++x) {
          board[y][x] = Integer.parseInt(st.nextToken());
        }
      }

      cache = new int[n][n];
      for (int y = 0; y < n; ++y) {
        Arrays.fill(cache[y], -1);
      }

      bw.write(String.valueOf(findMaxValue(0, 0)));
      bw.newLine();
    }

    br.close();
    bw.close();
  }

  private static int findMaxValue(int y, int x) {
    if (y == n) {
      return 0;
    }

    if (cache[y][x] != -1) {
      return cache[y][x];
    }

    return cache[y][x] = board[y][x] + Math.max(findMaxValue(y + 1, x), findMaxValue(y + 1, x + 1));
  }


}
