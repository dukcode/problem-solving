package com.dukcode.swea;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class S9367 {

  private static final int MN = -987_654_321;

  private static BufferedReader br;
  private static BufferedWriter bw;
  private static StringTokenizer st;

  private static int n;
  private static int[] arr;

  public static void main(String[] args) throws IOException {
    br = new BufferedReader(new InputStreamReader(System.in));
    bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int t = Integer.parseInt(br.readLine());
    for (int tc = 1; tc <= t; tc++) {

      n = Integer.parseInt(br.readLine());

      arr = new int[n + 1];
      st = new StringTokenizer(br.readLine());
      for (int i = 0; i < n; ++i) {
        arr[i] = Integer.parseInt(st.nextToken());
      }
      arr[n] = MN;

      int ans = 0;
      int cntIncrease = 1;
      for (int i = 1; i <= n; ++i) {
        if (arr[i - 1] >= arr[i]) {
          ans = Math.max(ans, cntIncrease);
          cntIncrease = 1;
          continue;
        }

        cntIncrease++;
      }

      bw.write("#" + tc + " ");
      bw.write(String.valueOf(ans));
      bw.newLine();
    }

    br.close();
    bw.close();
  }


}
