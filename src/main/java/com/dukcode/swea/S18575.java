package com.dukcode.swea;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class S18575 {

  private static final int MX = 987_654_321;
  private static final int MN = -987_654_321;

  private static final int ROW = 0;
  private static final int COL = 1;

  private static BufferedReader br;
  private static BufferedWriter bw;
  private static StringTokenizer st;

  private static int n;

  private static int[][] board;
  private static int[][] cache;

  public static void main(String[] args) throws IOException {
    br = new BufferedReader(new InputStreamReader(System.in));
    bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int t = Integer.parseInt(br.readLine());
    for (int tc = 1; tc <= t; tc++) {
      n = Integer.parseInt(br.readLine());

      cache = new int[2][n];
      board = new int[n][n];
      for (int y = 0; y < n; ++y) {
        st = new StringTokenizer(br.readLine());
        for (int x = 0; x < n; ++x) {
          int num = Integer.parseInt(st.nextToken());
          board[y][x] = num;
          cache[ROW][x] += num;
          cache[COL][y] += num;
        }
      }

      int maxScore = MN;
      int minScore = MX;
      for (int y = 0; y < n; ++y) {
        for (int x = 0; x < n; ++x) {
          int score = cache[ROW][x] + cache[COL][y] - board[y][x];
          maxScore = Math.max(maxScore, score);
          minScore = Math.min(minScore, score);
        }
      }

      bw.write('#');
      bw.write(String.valueOf(tc));
      bw.write(' ');
      bw.write(String.valueOf(maxScore - minScore));
      bw.newLine();
    }

    br.close();
    bw.close();
  }


}
