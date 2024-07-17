package com.dukcode.algospot.chap08_dynamic_programming;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Pi {

  private static final int MX = 987_654_321;

  private static BufferedReader br;
  private static BufferedWriter bw;

  private static String piece;

  private static int[] cache;

  public static void main(String[] args) throws IOException {
    br = new BufferedReader(new InputStreamReader(System.in));
    bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int c = Integer.parseInt(br.readLine());
    while (c-- > 0) {
      piece = br.readLine();

      cache = new int[piece.length()];
      Arrays.fill(cache, -1);
      bw.write(String.valueOf(calculate(0)));
      bw.newLine();
    }

    br.close();
    bw.close();
  }

  private static int calculate(int here) {
    if (here == piece.length()) {
      return 0;
    }

    if (cache[here] != -1) {
      return cache[here];
    }

    int ret = MX;
    for (int next = here + 3; next <= here + 5; ++next) {
      if (next > piece.length()) {
        continue;
      }

      ret = Math.min(ret, calculate(next) + getScore(here, next - 1));
    }

    return cache[here] = ret;
  }

  private static int getScore(int st, int en) {
    boolean isArithmeticSequence = true;
    int diff = piece.charAt(st + 1) - piece.charAt(st);
    for (int i = st; i < en; ++i) {
      if (piece.charAt(i + 1) - piece.charAt(i) != diff) {
        isArithmeticSequence = false;
        break;
      }
    }

    if (isArithmeticSequence) {
      if (diff == 0) {
        return 1;
      } else if (diff == 1 || diff == -1) {
        return 2;
      }

      return 5;
    }

    boolean isAlternative = true;
    for (int i = st + 2; i <= en; ++i) {
      if (piece.charAt(i - 2) != piece.charAt(i)) {
        isAlternative = false;
        break;
      }
    }

    if (isAlternative) {
      return 4;
    }

    return 10;
  }


}
