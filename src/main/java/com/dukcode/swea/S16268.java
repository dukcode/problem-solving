package com.dukcode.swea;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class S16268 {

  private static final int MN = -987_654_321;

  private static final int[] dy = {0, -1, 0, 1};
  private static final int[] dx = {1, 0, -1, 0};

  private static BufferedReader br;
  private static BufferedWriter bw;
  private static StringTokenizer st;

  private static int h;
  private static int w;

  private static int[][] board;

  public static void main(String[] args) throws IOException {
    br = new BufferedReader(new InputStreamReader(System.in));
    bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int t = Integer.parseInt(br.readLine());
    for (int tc = 1; tc <= t; tc++) {

      st = new StringTokenizer(br.readLine());
      h = Integer.parseInt(st.nextToken());
      w = Integer.parseInt(st.nextToken());

      board = new int[h][w];
      for (int y = 0; y < h; ++y) {
        st = new StringTokenizer(br.readLine());
        for (int x = 0; x < w; ++x) {
          board[y][x] = Integer.parseInt(st.nextToken());
        }
      }

      int ans = MN;
      for (int y = 0; y < h; ++y) {
        for (int x = 0; x < w; ++x) {
          int score = board[y][x];
          for (int dir = 0; dir < 4; ++dir) {
            int ny = y + dy[dir];
            int nx = x + dx[dir];

            if (ny < 0 || ny >= h || nx < 0 || nx >= w) {
              continue;
            }

            score += board[ny][nx];
          }

          ans = Math.max(ans, score);
        }
      }

      bw.write('#');
      bw.write(String.valueOf(tc));
      bw.write(' ');
      bw.write(String.valueOf(ans));
      bw.newLine();
    }

    br.close();
    bw.close();
  }


}
