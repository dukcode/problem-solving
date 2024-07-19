package com.dukcode.algospot.chap08_dynamic_programming;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Numb3rs {

  private static BufferedReader br;
  private static BufferedWriter bw;
  private static StringTokenizer st;
  private static int n;
  private static int d;
  private static int p;

  private static boolean[][] isConnected;

  private static double[][] probabilities;
  private static int[] outDegrees;

  public static void main(String[] args) throws IOException {
    br = new BufferedReader(new InputStreamReader(System.in));
    bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int c = Integer.parseInt(br.readLine());
    while (c-- > 0) {
      st = new StringTokenizer(br.readLine());
      n = Integer.parseInt(st.nextToken());
      d = Integer.parseInt(st.nextToken());
      p = Integer.parseInt(st.nextToken());

      isConnected = new boolean[n][n];
      outDegrees = new int[n];
      for (int from = 0; from < n; ++from) {
        st = new StringTokenizer(br.readLine());
        for (int to = 0; to < n; ++to) {
          boolean connected = Integer.parseInt(st.nextToken()) == 1;
          if (connected) {
            isConnected[from][to] = true;
            outDegrees[from]++;
          }
        }
      }

      probabilities = new double[d + 1][n];
      for (int day = 1; day <= d; day++) {
        Arrays.fill(probabilities[day], -1.0);
      }

      probabilities[0][p] = 1.0;

      int t = Integer.parseInt(br.readLine());
      st = new StringTokenizer(br.readLine());
      for (int i = 0; i < t; ++i) {
        int village = Integer.parseInt(st.nextToken());

        bw.write(String.format("%.8f", calcProb(d, village)));
        bw.write(' ');
      }

      bw.newLine();

    }

    br.close();
    bw.close();
  }

  private static double calcProb(int day, int here) {
    if (day == 0) {
      return probabilities[day][here];
    }

    if (probabilities[day][here] != -1.0) {
      return probabilities[day][here];
    }

    double ret = 0.0;
    for (int before = 0; before < n; before++) {
      if (!isConnected[before][here]) {
        continue;
      }

      ret += calcProb(day - 1, before) / outDegrees[before];
    }

    return probabilities[day][here] = ret;
  }

}
