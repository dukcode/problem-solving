package com.dukcode.jongman.chap06_brute_force;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Combination {

  private static BufferedReader br;
  private static BufferedWriter bw;
  private static StringTokenizer st;

  private static int n;
  private static int r;

  private static List<Integer> picked;

  public static void main(String[] args) throws IOException {
    br = new BufferedReader(new InputStreamReader(System.in));
    bw = new BufferedWriter(new OutputStreamWriter(System.out));

    st = new StringTokenizer(br.readLine());
    n = Integer.parseInt(st.nextToken());
    r = Integer.parseInt(st.nextToken());

    picked = new ArrayList<>();
    combination(0);

    br.close();
    bw.close();

  }

  private static void combination(int num) throws IOException {

    if (picked.size() == r) {
      print();
      return;
    }

    for (int next = num + 1; next <= n; ++next) {
      picked.add(next);
      combination(next);
      picked.remove(picked.size() - 1);
    }

  }

  private static void print() throws IOException {
    for (Integer num : picked) {
      bw.write(String.valueOf(num));
      bw.write(' ');
    }
    bw.newLine();
  }
}
