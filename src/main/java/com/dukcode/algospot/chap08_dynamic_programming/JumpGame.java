package com.dukcode.algospot.chap08_dynamic_programming;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class JumpGame {

  private static final int TRUE = 1;
  private static final int FALSE = 0;
  private static final int NONE = -1;

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
        for (int x = 0; x < n; ++x) {
          board[y][x] = Integer.parseInt(st.nextToken());
        }
      }

      cache = new int[n][n];
      for (int y = 0; y < n; ++y) {
        Arrays.fill(cache[y], NONE);
      }

      bw.write(canWin(0, 0) == TRUE ? "YES" : "NO");
      bw.newLine();
    }

    br.close();
    bw.close();
  }

  private static int canWin(int y, int x) {
    if (y == n - 1 && x == n - 1) {
      return TRUE;
    }

    if (y < 0 || y >= n || x < 0 || x >= n) {
      return FALSE;
    }

    if (cache[y][x] != NONE) {
      return cache[y][x];
    }

    return cache[y][x] = (canWin(y + board[y][x], x) | canWin(y, x + board[y][x]));
  }


}
