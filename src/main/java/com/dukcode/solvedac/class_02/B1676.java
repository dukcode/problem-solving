package com.dukcode.solvedac.class_02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B1676 {

  private static BufferedReader br;
  private static BufferedWriter bw;
  private static StringTokenizer st;


  public static void main(String[] args) throws IOException {
    br = new BufferedReader(new InputStreamReader(System.in));
    bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());

    int cnt2 = 0;
    int cnt5 = 0;

    for (int i = 1; i <= n; ++i) {
      int num = i;

      while (num % 2 == 0) {
        num /= 2;
        cnt2++;
      }

      while (num % 5 == 0) {
        num /= 5;
        cnt5++;
      }
    }

    bw.write(String.valueOf(Math.min(cnt2, cnt5)));

    br.close();
    bw.close();

  }

}
