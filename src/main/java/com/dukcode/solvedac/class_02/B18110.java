package com.dukcode.solvedac.class_02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B18110 {

  private static BufferedReader br;
  private static BufferedWriter bw;
  private static StringTokenizer st;

  private static int n;
  private static int[] evals;

  public static void main(String[] args) throws IOException {
    br = new BufferedReader(new InputStreamReader(System.in));
    bw = new BufferedWriter(new OutputStreamWriter(System.out));

    n = Integer.parseInt(br.readLine());
    evals = new int[n];
    for (int i = 0; i < n; i++) {
      evals[i] = Integer.parseInt(br.readLine());
    }

    Arrays.sort(evals);

    int cntPass = (int) Math.round(n * 0.15);

    double sum = 0.0;
    for (int i = cntPass; i < n - cntPass; ++i) {
      sum += evals[i];
    }

    bw.write(String.valueOf(Math.round(sum / (n - 2 * cntPass))));

    br.close();
    bw.close();

  }

}
