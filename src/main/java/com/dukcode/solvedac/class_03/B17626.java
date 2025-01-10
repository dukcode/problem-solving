package com.dukcode.solvedac.class_03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B17626 {

  private static BufferedReader br;
  private static BufferedWriter bw;
  private static StringTokenizer st;

  private static int[] dp;

  public static void main(String[] args) throws IOException {
    br = new BufferedReader(new InputStreamReader(System.in));
    bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());

    dp = new int[n + 1];
    for (int num = 1; num <= n; ++num) {
      dp[num] = Integer.MAX_VALUE;
      for (int i = 1; i * i <= num; ++i) {
        dp[num] = Math.min(dp[num], dp[num - i * i] + 1);
      }
    }

    bw.write(String.valueOf(dp[n]));

    br.close();
    bw.close();
  }


  public static void print(String s) {
    System.out.print(s);
  }

}
