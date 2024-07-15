package com.dukcode.swea;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class S20396 {

  private static BufferedReader br;
  private static BufferedWriter bw;
  private static StringTokenizer st;

  private static int n;
  private static int m;

  private static boolean[] arr;

  public static void main(String[] args) throws Exception {
    br = new BufferedReader(new InputStreamReader(System.in));
    bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int t = Integer.parseInt(br.readLine());
    for (int tc = 1; tc <= t; tc++) {
      st = new StringTokenizer(br.readLine());
      n = Integer.parseInt(st.nextToken());
      m = Integer.parseInt(st.nextToken());

      arr = new boolean[n];
      st = new StringTokenizer(br.readLine());
      for (int i = 0; i < n; i++) {
        arr[i] = !st.nextToken().equals("0");
      }

      for (int i = 0; i < m; ++i) {
        st = new StringTokenizer(br.readLine());
        int from = Integer.parseInt(st.nextToken()) - 1;
        int num = Integer.parseInt(st.nextToken());
        flip(from, num);
      }

      bw.write("#");
      bw.write(String.valueOf(tc));
      bw.write(' ');

      for (boolean stone : arr) {
        bw.write(String.valueOf(stone ? 1 : 0));
        bw.write(' ');
      }
      bw.newLine();
    }

    br.close();
    bw.close();
  }

  private static void flip(int from, int num) {
    boolean pivot = arr[from];
    for (int here = from; here < from + num; ++here) {
      if (here >= n) {
        break;
      }
      arr[here] = pivot;
    }
  }

}
