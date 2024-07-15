package com.dukcode.swea;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class S2058 {

  private static BufferedReader br;
  private static BufferedWriter bw;
  private static StringTokenizer st;

  public static void main(String[] args) throws IOException {
    br = new BufferedReader(new InputStreamReader(System.in));
    bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int num = Integer.parseInt(br.readLine());

    int ans = 0;
    while (num > 0) {
      ans += num % 10;
      num /= 10;
    }

    bw.write(String.valueOf(ans));

    br.close();
    bw.close();
  }


}
