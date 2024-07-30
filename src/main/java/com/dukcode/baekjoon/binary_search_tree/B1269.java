package com.dukcode.baekjoon.binary_search_tree;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class B1269 {

  private static BufferedReader br;
  private static BufferedWriter bw;
  private static StringTokenizer st;

  private static int na;
  private static int nb;

  private static Set<Integer> set;

  public static void main(String[] args) throws IOException {
    br = new BufferedReader(new InputStreamReader(System.in));
    bw = new BufferedWriter(new OutputStreamWriter(System.out));

    st = new StringTokenizer(br.readLine());
    na = Integer.parseInt(st.nextToken());
    nb = Integer.parseInt(st.nextToken());

    set = new HashSet<>();

    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < na; i++) {
      int num = Integer.parseInt(st.nextToken());
      set.add(num);
    }

    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < nb; i++) {
      int num = Integer.parseInt(st.nextToken());
      if (set.contains(num)) {
        set.remove(num);
        continue;
      }

      set.add(num);
    }

    bw.write(String.valueOf(set.size()));

    br.close();
    bw.close();
  }


}
