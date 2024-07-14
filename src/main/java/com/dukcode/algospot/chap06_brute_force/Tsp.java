package com.dukcode.algospot.chap06_brute_force;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Tsp {

  private static final int MX = 987_654_321;

  private static BufferedReader br;
  private static BufferedWriter bw;
  private static StringTokenizer st;

  private static int n;
  private static int[][] dist;

  private static boolean[] visited;

  public static void main(String[] args) throws IOException {
    br = new BufferedReader(new InputStreamReader(System.in));
    bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int c = Integer.parseInt(br.readLine());
    while (c-- > 0) {
      n = Integer.parseInt(br.readLine());

      dist = new int[n][n];
      for (int from = 0; from < n; from++) {
        st = new StringTokenizer(br.readLine());
        for (int to = 0; to < n; to++) {
          dist[from][to] = Integer.parseInt(st.nextToken());
        }
      }

      visited = new boolean[n];
      bw.write(String.valueOf(shortestDist(0, 0, 1)));
      bw.newLine();
    }

    br.close();
    bw.close();

  }

  private static int shortestDist(int start, int here, int countVisited) {
    visited[here] = true;

    if (countVisited == n) {
      return dist[here][start];
    }

    int ret = MX;
    for (int next = 0; next < n; next++) {
      if (visited[next]) {
        continue;
      }

      visited[next] = true;
      ret = Math.min(ret, shortestDist(start, next, countVisited + 1) + dist[here][next]);
      visited[next] = false;
    }

    return ret;
  }

}
