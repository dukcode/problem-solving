package com.dukcode.swea;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class S11092 {

  private static final int MX = 987_654_321;
  private static final int MN = -987_654_321;

  private static BufferedReader br;
  private static BufferedWriter bw;
  private static StringTokenizer st;

  private static int n;

  public static void main(String[] args) throws IOException {
    br = new BufferedReader(new InputStreamReader(System.in));
    bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int t = Integer.parseInt(br.readLine());
    for (int tc = 1; tc <= t; tc++) {
      n = Integer.parseInt(br.readLine());

      int minValue = MX;
      int minIdx = -1;
      int maxValue = MN;
      int maxIdx = -1;

      st = new StringTokenizer(br.readLine());
      for (int i = 0; i < n; ++i) {
        int num = Integer.parseInt(st.nextToken());

        if (num < minValue) {
          minValue = num;
          minIdx = i;
        }

        if (num >= maxValue) {
          maxValue = num;
          maxIdx = i;
        }
      }

      int ans = Math.abs(minIdx - maxIdx);

      bw.write("#" + tc + " ");
      bw.write(String.valueOf(ans));
      bw.newLine();
    }

    br.close();
    bw.close();
  }


}
