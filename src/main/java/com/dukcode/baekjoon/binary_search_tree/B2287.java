package com.dukcode.baekjoon.binary_search_tree;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class B2287 {

  private static BufferedReader br;
  private static BufferedWriter bw;
  private static StringTokenizer st;

  private static int k;
  private static int n;

  private static Set<Integer>[] cache;

  public static void main(String[] args) throws IOException {
    br = new BufferedReader(new InputStreamReader(System.in));
    bw = new BufferedWriter(new OutputStreamWriter(System.out));

    k = Integer.parseInt(br.readLine());
    n = Integer.parseInt(br.readLine());
    cache = new Set[8];
    int base = 0;
    for (int i = 0; i < 8; ++i) {
      cache[i] = new HashSet<>();
      base = 10 * base + k;
      cache[i].add(base);
    }

    for (int len = 1; len <= 8; ++len) {
      for (int left = 1; left * 2 <= len; ++left) {
        int right = len - left;
        for (int a : cache[left - 1]) {
          for (int b : cache[right - 1]) {
            if (a != b) {
              cache[len - 1].add(Math.abs(a - b));
            }

            cache[len - 1].add(a * b);
            cache[len - 1].add(a + b);
            cache[len - 1].add(Math.max(a, b) / Math.min(a, b));
          }
        }
      }
    }

    for (int i = 0; i < n; i++) {
      int num = Integer.parseInt(br.readLine());

      int ans = -1;
      for (int len = 1; len <= 8; ++len) {
        if (cache[len - 1].contains(num)) {
          ans = len;
          break;
        }

      }

      bw.write(ans == -1 ? "NO" : String.valueOf(ans));
      bw.newLine();

    }

    br.close();
    bw.close();
  }


}
