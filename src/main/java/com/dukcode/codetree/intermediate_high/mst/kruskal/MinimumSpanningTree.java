package com.dukcode.codetree.intermediate_high.mst.kruskal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class MinimumSpanningTree {

  private static BufferedReader br;
  private static BufferedWriter bw;
  private static StringTokenizer st;

  private static int n;
  private static int m;

  private static Edge[] edges;

  private static int[] parent;
  private static int[] rank;

  public static void main(String[] args) throws IOException {
    br = new BufferedReader(new InputStreamReader(System.in));
    bw = new BufferedWriter(new OutputStreamWriter(System.out));

    st = new StringTokenizer(br.readLine());
    n = Integer.parseInt(st.nextToken());
    m = Integer.parseInt(st.nextToken());

    edges = new Edge[m];

    for (int i = 0; i < m; i++) {
      st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken()) - 1;
      int b = Integer.parseInt(st.nextToken()) - 1;
      int cost = Integer.parseInt(st.nextToken());

      edges[i] = new Edge(a, b, cost);
    }

    Arrays.sort(edges, (e1, e2) -> Integer.compare(e1.cost, e2.cost));

    parent = IntStream.range(0, n).toArray();
    rank = new int[n];

    int sumCost = 0;
    for (Edge e : edges) {
      int a = e.a;
      int b = e.b;

      if (union(a, b)) {
        sumCost += e.cost;
      }
    }

    bw.write(String.valueOf(sumCost));

    br.close();
    bw.close();
  }

  private static boolean union(int a, int b) {
    int rootA = findRoot(a);
    int rootB = findRoot(b);

    if (rootA == rootB) {
      return false;
    }

    if (rank[rootA] > rank[rootB]) {
      parent[rootB] = rootA;
    } else if (rank[rootA] < rank[rootB]) {
      parent[rootA] = rootB;
    } else {
      parent[rootA] = rootB;
      rank[rootB]++;
    }

    return true;
  }

  private static int findRoot(int x) {
    if (parent[x] == x) {
      return x;
    }

    return parent[x] = findRoot(parent[x]);
  }

  private static class Edge {

    int a;
    int b;
    int cost;

    public Edge(int a, int b, int cost) {
      this.a = a;
      this.b = b;
      this.cost = cost;
    }
  }
}
