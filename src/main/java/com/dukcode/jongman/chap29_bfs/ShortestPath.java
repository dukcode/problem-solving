package com.dukcode.jongman.chap29_bfs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class ShortestPath {


  private static BufferedReader br;
  private static BufferedWriter bw;
  private static StringTokenizer st;

  private static int n;
  private static int m;
  private static List<Integer>[] adj;

  private static int[] distance;
  private static int[] parent;

  public static void main(String[] args) throws IOException {
    br = new BufferedReader(new InputStreamReader(System.in));
    bw = new BufferedWriter(new OutputStreamWriter(System.out));

    st = new StringTokenizer(br.readLine());
    n = Integer.parseInt(st.nextToken());
    m = Integer.parseInt(st.nextToken());

    adj = new List[n];
    for (int i = 0; i < n; ++i) {
      adj[i] = new ArrayList<>();
    }

    for (int i = 0; i < m; ++i) {
      st = new StringTokenizer(br.readLine());
      int from = Integer.parseInt(st.nextToken());
      int to = Integer.parseInt(st.nextToken());

      adj[from].add(to);
    }

    List<Integer> path = shortestPath(0, 4);
    bw.write(Arrays.toString(path.toArray()));

    br.close();
    bw.close();
  }

  private static List<Integer> shortestPath(int from, int to) {
    distance = new int[n];
    Arrays.fill(distance, -1);
    parent = new int[n];
    Arrays.fill(parent, -1);

    bfs(from);
    return shortestPath(to);
  }

  private static void bfs(int start) {

    Queue<Integer> q = new ArrayDeque<>();
    q.offer(start);
    distance[start] = 0;
    parent[start] = start;

    while (!q.isEmpty()) {
      int here = q.poll();
      for (int there : adj[here]) {
        if (distance[there] != -1) {
          continue;
        }

        q.offer(there);
        distance[there] = distance[here] + 1;
        parent[there] = here;
      }
    }

  }

  private static List<Integer> shortestPath(int v) {
    List<Integer> path = new ArrayList<>();
    path.add(v);
    while (parent[v] != v) {
      path.add(parent[v]);
      v = parent[v];
    }

    Collections.reverse(path);
    return path;
  }


}
