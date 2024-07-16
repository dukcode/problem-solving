package com.dukcode.algospot.chap08_dynamic_programming;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WildCard {

  private static final int TRUE = 1;
  private static final int FALSE = 0;
  private static final int NONE = -1;

  private static BufferedReader br;
  private static BufferedWriter bw;

  private static String pattern;
  private static int n;
  private static String word;

  private static int[][] cache;

  public static void main(String[] args) throws IOException {
    br = new BufferedReader(new InputStreamReader(System.in));
    bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int c = Integer.parseInt(br.readLine());
    while (c-- > 0) {
      pattern = br.readLine();
      n = Integer.parseInt(br.readLine());
      List<String> ans = new ArrayList<>();
      for (int i = 0; i < n; i++) {
        word = br.readLine();

        cache = new int[pattern.length() + 1][word.length() + 1];
        for (int y = 0; y <= pattern.length(); ++y) {
          Arrays.fill(cache[y], NONE);
        }

        if (match2(0, 0) == TRUE) {
          ans.add(word);
        }
      }

      Collections.sort(ans);

      for (String matchWord : ans) {
        bw.write(matchWord);
        bw.newLine();
      }

    }

    br.close();
    bw.close();
  }

  // cache = n * n
  private static int match(int p, int w) {
    if (p == pattern.length() || w == word.length()) {
      if (p == pattern.length() && w == word.length()) {
        return TRUE;
      }

      if (p == pattern.length()) {
        return FALSE;
      }

      if (pattern.charAt(p) == '*') {
        return match(p + 1, w);
      }

      return FALSE;
    }

    if (cache[p][w] != NONE) {
      return cache[p][w];
    }

    if (pattern.charAt(p) == '*') {
      return cache[p][w] = match(p, w + 1) | match(p + 1, w);
    }

    if (pattern.charAt(p) == '?' || pattern.charAt(p) == word.charAt(w)) {
      return cache[p][w] = match(p + 1, w + 1);
    }

    return cache[p][w] = FALSE;
  }

  // cache = (n + 1) * (n + 1)
  private static int match2(int p, int w) {
    if (cache[p][w] != NONE) {
      return cache[p][w];
    }

    if (p < pattern.length() && w < word.length() &&
        (pattern.charAt(p) == '?' || pattern.charAt(p) == word.charAt(w))) {
      return cache[p][w] = match(p + 1, w + 1);
    }

    if (p == pattern.length()) {
      return (w == word.length()) ? TRUE : FALSE;
    }

    if (pattern.charAt(p) == '*') {
      return cache[p][w] =
          (match2(p + 1, w) |
              ((w < word.length() && match2(p, w + 1) == TRUE) ? TRUE : FALSE));
    }

    return cache[p][w] = FALSE;
  }

// *a
// abc
}
