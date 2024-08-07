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

public class BridgeFinder {

  private static BufferedReader br;
  private static BufferedWriter bw;
  private static StringTokenizer st;

  private static int n;
  private static int m;
  private static List<Integer>[] adj;
  private static int[] discovered;

  private static int counter;
  private static boolean[][] isBridge;
  private static int[] parent;

  public static void main(String[] args) throws IOException {
    br = new BufferedReader(new InputStreamReader(System.in));
    bw = new BufferedWriter(new OutputStreamWriter(System.out));

    input();

    isBridge = new boolean[n][n];
    parent = new int[n];
    Arrays.fill(parent, -1);
    counter = 0;
    findBridge(0);

    System.out.println(Arrays.toString(isBridge));

    br.close();
    bw.close();
  }

  private static int findBridge(int here) {
    discovered[here] = counter++;
    int ret = discovered[here];
    for (int there : adj[here]) {
      if (parent[here] == there) {
        continue;
      }
      if (discovered[there] == -1) {
        parent[there] = here;
        int subtree = findBridge(there);
        if (subtree > discovered[here]) {
          isBridge[here][there] = true;
        }
        ret = Math.min(ret, subtree);
        continue;
      }

      ret = Math.min(ret, discovered[there]);
    }

    return ret;
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
      adj[to].add(from);
    }

    discovered = new int[n];
    Arrays.fill(discovered, -1);
  }

}
