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

public class CutVertexFinder {

  private static BufferedReader br;
  private static BufferedWriter bw;
  private static StringTokenizer st;

  private static int n;
  private static int m;
  private static List<Integer>[] adj;
  private static int[] discovered;

  private static int counter;
  private static boolean[] isCutVertex;

  public static void main(String[] args) throws IOException {
    br = new BufferedReader(new InputStreamReader(System.in));
    bw = new BufferedWriter(new OutputStreamWriter(System.out));

    input();

    isCutVertex = new boolean[n];
    counter = 0;
    findCutVertex(0, true);

    System.out.println(Arrays.toString(isCutVertex));

    br.close();
    bw.close();
  }

  /*
  here에서 갈 수 있는 가장 높은 back edge 도착지의 발견 순서
   */
  private static int findCutVertex(int here, boolean isRoot) {
    discovered[here] = counter++;
    int ret = discovered[here];
    int children = 0;
    for (int there : adj[here]) {

      if (discovered[there] == -1) {
        children++;
        int subtree = findCutVertex(there, false);
        if (!isRoot && subtree >= discovered[here]) {
          isCutVertex[here] = true;
        }
        ret = Math.min(ret, subtree);
        continue;
      }

      ret = Math.min(ret, discovered[there]);
    }

    if (isRoot) {
      isCutVertex[here] = (children >= 2);
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
