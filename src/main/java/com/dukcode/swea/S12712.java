package com.dukcode.swea;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class S12712 {

  private static final int MN = -987_654_321;

  private static final int[] dy = {0, -1, 0, 1};
  private static final int[] dx = {1, 0, -1, 0};

  private static final int[] xdy = {1, 1, -1, -1};
  private static final int[] xdx = {1, -1, -1, 1};

  private static BufferedReader br;
  private static BufferedWriter bw;
  private static StringTokenizer st;

  private static int n;
  private static int m;

  private static int[][] board;

  public static void main(String[] args) throws IOException {
    br = new BufferedReader(new InputStreamReader(System.in));
    bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int t = Integer.parseInt(br.readLine());
    for (int tc = 1; tc <= t; tc++) {

      st = new StringTokenizer(br.readLine());
      n = Integer.parseInt(st.nextToken());
      m = Integer.parseInt(st.nextToken());

      board = new int[n][n];
      for (int y = 0; y < n; ++y) {
        st = new StringTokenizer(br.readLine());
        for (int x = 0; x < n; ++x) {
          int num = Integer.parseInt(st.nextToken());
          board[y][x] = num;
        }
      }

      int ans = MN;
      Loop:
      for (int y = 0; y < n; ++y) {
        for (int x = 0; x < n; ++x) {
          ans = Math.max(ans, calculateScore(y, x, true));
          ans = Math.max(ans, calculateScore(y, x, false));
        }
      }

      bw.write("#" + tc + " ");
      bw.write(String.valueOf(ans));
      bw.newLine();
    }

    br.close();
    bw.close();
  }

  private static int calculateScore(int y, int x, boolean isCross) {

    int score = board[y][x];

    for (int dist = 1; dist < m; ++dist) {
      for (int dir = 0; dir < 4; ++dir) {
        int ny = y + (isCross ? dy[dir] : xdy[dir]) * dist;
        int nx = x + (isCross ? dx[dir] : xdx[dir]) * dist;

        if (!inRange(ny, nx)) {
          continue;
        }

        score += board[ny][nx];
      }
    }

    return score;
  }

  private static boolean inRange(int y, int x) {
    return y >= 0 && y < n && x >= 0 && x < n;
  }


}
