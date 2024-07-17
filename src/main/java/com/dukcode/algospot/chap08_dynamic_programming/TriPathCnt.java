package com.dukcode.algospot.chap08_dynamic_programming;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class TriPathCnt {

  private static BufferedReader br;
  private static BufferedWriter bw;
  private static StringTokenizer st;

  private static int n;

  private static int[][] board;
  private static int[][] scoreCache;
  private static int[][] pathCache;

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

      bw.write(String.valueOf(solve()));
      bw.newLine();
    }

    br.close();
    bw.close();
  }

  private static int solve() {
    scoreCache = new int[n][n];
    pathCache = new int[n][n];
    for (int y = 0; y < n; ++y) {
      Arrays.fill(scoreCache[y], -1);
      Arrays.fill(pathCache[y], -1);
    }

    calculateMaxScore(0, 0);

    return calculateNumPath(0, 0);
  }

  private static int calculateNumPath(int y, int x) {
    if (y == n - 1) {
      return 1;
    }

    if (pathCache[y][x] != -1) {
      return pathCache[y][x];
    }

    int ret = 0;

    if (calculateMaxScore(y + 1, x) >= calculateMaxScore(y + 1, x + 1)) {
      ret += calculateNumPath(y + 1, x);
    }

    if (calculateMaxScore(y + 1, x) <= calculateMaxScore(y + 1, x + 1)) {
      ret += calculateNumPath(y + 1, x + 1);
    }

    return pathCache[y][x] = ret;
  }

  private static int calculateMaxScore(int y, int x) {
    if (y == n) {
      return 0;
    }

    if (scoreCache[y][x] != -1) {
      return scoreCache[y][x];
    }

    return scoreCache[y][x] =
        board[y][x] + Math.max(calculateMaxScore(y + 1, x), calculateMaxScore(y + 1, x + 1));
  }


}
