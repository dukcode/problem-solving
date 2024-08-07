package com.dukcode.algospot.chap29_dfs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.StringTokenizer;

public class SortGame {

  private static BufferedReader br;
  private static BufferedWriter bw;
  private static StringTokenizer st;

  private static int n;
  private static List<Integer> nums;

  private static List<Integer> reverse(List<Integer> list, int st, int en) {
    List<Integer> ret = new ArrayList<>(list);
    while (st < --en) {
      Collections.swap(ret, st++, en);
    }

    return ret;
  }

  public static void main(String[] args) throws IOException {
    br = new BufferedReader(new InputStreamReader(System.in));
    bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int c = Integer.parseInt(br.readLine());
    while (c-- > 0) {
      n = Integer.parseInt(br.readLine());

      nums = new ArrayList<>();
      st = new StringTokenizer(br.readLine());
      for (int i = 0; i < n; ++i) {
        nums.add(Integer.parseInt(st.nextToken()));
      }

      bw.write(String.valueOf(bfs()));
      bw.newLine();

    }

    br.close();
    bw.close();
  }

  private static int bfs() {
    List<Integer> sortedNums = new ArrayList<>(nums);
    Collections.sort(sortedNums);

    Map<List<Integer>, Integer> dist = new HashMap<>();
    Queue<List<Integer>> q = new LinkedList<>();

    dist.put(nums, 0);
    q.offer(new ArrayList<>(nums));

    while (!q.isEmpty()) {
      List<Integer> here = q.poll();
      int distNow = dist.get(here);

      if (here.equals(sortedNums)) {
        return dist.get(here);
      }

      for (int st = 0; st < n - 2; ++st) {
        for (int en = st + 2; en <= n; ++en) {
          List<Integer> there = reverse(here, st, en);

          if (dist.containsKey(there)) {
            continue;
          }

          q.offer(there);
          dist.put(there, distNow + 1);
        }
      }
    }

    return -1;
  }

}
