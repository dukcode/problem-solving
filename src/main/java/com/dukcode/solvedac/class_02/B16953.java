package com.dukcode.solvedac.class_02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B16953 {

  private static BufferedReader br;
  private static BufferedWriter bw;
  private static StringTokenizer st;

  private static int ans;

  public static void main(String[] args) throws IOException {
    br = new BufferedReader(new InputStreamReader(System.in));
    bw = new BufferedWriter(new OutputStreamWriter(System.out));

    st = new StringTokenizer(br.readLine());
    long a = Long.parseLong(st.nextToken());
    long b = Long.parseLong(st.nextToken());

    ans = Integer.MAX_VALUE;
    solve(1, a, b);
    bw.write(String.valueOf(ans == Integer.MAX_VALUE ? -1 : ans));

    br.close();
    bw.close();

  }

  private static void solve(int cnt, long fr, long to) {
    if (fr == to) {
      ans = cnt;
      return;
    }

    if (fr > to || ans <= cnt) {
      return;
    }

    solve(cnt + 1, fr * 2, to);
    solve(cnt + 1, fr * 10 + 1, to);
  }

}
