package com.dukcode.solvedac.class_03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class B1764 {

  private static BufferedReader br;
  private static BufferedWriter bw;
  private static StringTokenizer st;

  public static void main(String[] args) throws IOException {
    br = new BufferedReader(new InputStreamReader(System.in));
    bw = new BufferedWriter(new OutputStreamWriter(System.out));

    st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());

    Set<String> set1 = new HashSet<>();
    for (int i = 0; i < n; i++) {
      set1.add(br.readLine());
    }

    Set<String> set2 = new HashSet<>();
    for (int i = 0; i < m; i++) {
      set2.add(br.readLine());
    }

    set1.retainAll(set2);
    List<String> names = new ArrayList<>(set1);
    names.sort(String::compareTo);

    bw.write(String.valueOf(names.size()));
    bw.newLine();
    for (String name : names) {
      bw.write(name);
      bw.newLine();
    }

    br.close();
    bw.close();
  }


}
