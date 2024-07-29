package com.dukcode.algospot.chap22_binary_search_tree;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Insertion {

  private static BufferedReader br;
  private static BufferedWriter bw;
  private static StringTokenizer st;

  private static int n;
  private static int[] moves;
  private static TreeSet<Integer> tree;

  public static void main(String[] args) throws IOException {
    br = new BufferedReader(new InputStreamReader(System.in));
    bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int c = Integer.parseInt(br.readLine());
    while (c-- > 0) {
      n = Integer.parseInt(br.readLine());

      tree = IntStream.range(1, n + 1).boxed().collect(Collectors.toCollection(TreeSet::new));

      moves = new int[n];
      st = new StringTokenizer(br.readLine());
      for (int i = 0; i < n; ++i) {
        moves[i] = Integer.parseInt(st.nextToken());
      }

      int[] ans = new int[n];
      for (int i = n - 1; i >= 0; --i) {
        int move = moves[i];

        int e = getKthLargestElement(move + 1);
        tree.remove(e);
        ans[i] = e;
      }

      for (int num : ans) {
        bw.write(String.valueOf(num));
        bw.write(' ');
      }
      bw.newLine();
    }

    br.close();
    bw.close();
  }

  private static Integer getKthLargestElement(int k) {
    Iterator<Integer> it = tree.descendingIterator();

    Integer ret = null;
    for (int i = 0; i < k; ++i) {
      ret = it.next();
    }

    return ret;
  }


}
