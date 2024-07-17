package com.dukcode.algospot.chap08_dynamic_programming;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Tiling2 {

  private static final int MOD = 1_000_000_007;

  private static BufferedReader br;
  private static BufferedWriter bw;

  private static int n;
  private static int[] cache;

  public static void main(String[] args) throws IOException {
    br = new BufferedReader(new InputStreamReader(System.in));
    bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int c = Integer.parseInt(br.readLine());
    while (c-- > 0) {
      n = Integer.parseInt(br.readLine());
      bw.write(String.valueOf(tiling()));
      bw.newLine();
    }

    br.close();
    bw.close();
  }

  private static int tiling() {
    cache = new int[n + 1];
    return tiling(n);
  }

  private static int tiling(int idx) {
    if (idx <= 2) {
      return idx;
    }

    if (cache[idx] != 0) {
      return cache[idx];
    }

    return cache[idx] = (tiling(idx - 1) + tiling(idx - 2)) % MOD;
  }


}
