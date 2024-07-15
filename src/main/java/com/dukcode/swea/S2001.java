package com.dukcode.swea;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class S2001 {

  private static final int MN = -987_654_321;

  private static BufferedReader br;
  private static BufferedWriter bw;
  private static StringTokenizer st;

  private static int n;
  private static int m;

  private static int[][] cache;

  public static void main(String[] args) throws IOException {
    br = new BufferedReader(new InputStreamReader(System.in));
    bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int t = Integer.parseInt(br.readLine());
    for (int tc = 1; tc <= t; tc++) {

      st = new StringTokenizer(br.readLine());
      n = Integer.parseInt(st.nextToken());
      m = Integer.parseInt(st.nextToken());

      cache = new int[n][n];
      for (int y = 0; y < n; ++y) {
        st = new StringTokenizer(br.readLine());
        for (int x = 0; x < n; ++x) {
          int num = Integer.parseInt(st.nextToken());

          int upper = y == 0 ? 0 : cache[y - 1][x];
          int left = x == 0 ? 0 : cache[y][x - 1];
          int leftUpper = y == 0 || x == 0 ? 0 : cache[y - 1][x - 1];
          cache[y][x] = num + upper + left - leftUpper;
        }
      }

      int ans = MN;
      for (int y = m - 1; y < n; ++y) {
        for (int x = m - 1; x < n; ++x) {
          int upper = y - m < 0 ? 0 : cache[y - m][x];
          int left = x - m < 0 ? 0 : cache[y][x - m];
          int leftUpper = y - m < 0 || x - m < 0 ? 0 : cache[y - m][x - m];
          ans = Math.max(ans, cache[y][x] - left - upper + leftUpper);
        }
      }

      bw.write("#" + tc + " ");
      bw.write(String.valueOf(ans));
      bw.newLine();
    }

    br.close();
    bw.close();
  }


}
