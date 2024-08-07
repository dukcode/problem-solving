package com.dukcode.jongman.chap29_bfs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Bfs {

  private static BufferedReader br;
  private static BufferedWriter bw;
  private static StringTokenizer st;

  private static int n;
  private static List<Integer>[] adj;

  private static List<Integer> bfs(int start) {
    List<Integer> order = new ArrayList<Integer>();
    boolean[] discovered = new boolean[n];

    Queue<Integer> q = new ArrayDeque<>();

    q.offer(start);
    discovered[start] = true;

    while (!q.isEmpty()) {
      int here = q.poll();
      order.add(here);
      for (int there : adj[here]) {
        if (discovered[there]) {
          continue;
        }

        discovered[there] = true;
        q.offer(there);
      }
    }

    return order;
  }

}
