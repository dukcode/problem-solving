package com.dukcode.jongman.chap28_dfs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class EdgeClassifier {

  private static BufferedReader br;
  private static BufferedWriter bw;
  private static StringTokenizer st;

  private static int n;
  private static int m;
  private static List<Integer>[] adj;
  private static int[] discovered;
  private static boolean[] finished;

  private static int counter;

  public static void main(String[] args) throws IOException {
    br = new BufferedReader(new InputStreamReader(System.in));
    bw = new BufferedWriter(new OutputStreamWriter(System.out));

    input();

    counter = 0;
    classify(0);

    br.close();
    bw.close();
  }

  private static void classify(int here) throws IOException {
    discovered[here] = counter++;

    for (int there : adj[here]) {
      bw.write("(" + here + ", " + there + ") is a ");

      if (discovered[there] == -1) {
        bw.write("트리 간선\n");
        classify(there);
        continue;
      }

      if (discovered[here] < discovered[there]) {
        bw.write("순방향 간선\n");
        continue;
      }

      if (!finished[there]) {
        bw.write("역방향 간선\n");
        continue;
      }

      bw.write("교차 간선\n");
    }

    finished[here] = true;
  }

  private static void input() throws IOException {
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

    discovered = new int[n];
    Arrays.fill(discovered, -1);
    finished = new boolean[n];
  }

}
