package com.dukcode.algospot.chap08_dynamic_programming;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

// https://chatgpt.com/share/a2893b23-e2ae-4c7b-9f4c-bf1f2455d506
public class Quantize {

  private static final int MX = 987_654_321;

  private static BufferedReader br;
  private static BufferedWriter bw;
  private static StringTokenizer st;

  private static int n;
  private static int s;
  private static int[] arr;

  private static int[][] cache;

  private static int[][] sumCache;
  private static int[][] sqSumCache;

  public static void main(String[] args) throws IOException {
    br = new BufferedReader(new InputStreamReader(System.in));
    bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int c = Integer.parseInt(br.readLine());
    while (c-- > 0) {
      st = new StringTokenizer(br.readLine());
      n = Integer.parseInt(st.nextToken());
      s = Integer.parseInt(st.nextToken());

      arr = new int[n];
      st = new StringTokenizer(br.readLine());
      for (int i = 0; i < n; ++i) {
        arr[i] = Integer.parseInt(st.nextToken());
      }

      Arrays.sort(arr);

      preCalc();

      cache = new int[s][n];
      for (int y = 0; y < s; ++y) {
        Arrays.fill(cache[y], -1);
      }

      bw.write(String.valueOf(quantize(s, 0)));
      bw.newLine();
    }

    br.close();
    bw.close();
  }

  private static void preCalc() {
    sumCache = new int[n][n];
    sqSumCache = new int[n][n];

    for (int st = 0; st < n; ++st) {
      int sum = 0;
      int sqSum = 0;
      for (int en = st; en < n; ++en) {
        sum += arr[en];
        sqSum += arr[en] * arr[en];

        sumCache[st][en] = sum;
        sqSumCache[st][en] = sqSum;
      }
    }

  }

  /**
   * @param numPart 나눌 파트 갯수
   * @param here    시작 인덱스
   */
  private static int quantize(int numPart, int here) {
    if (here == n) {
      return 0;
    }

    if (numPart == 0) {
      return MX;
    }

    if (cache[numPart - 1][here] != -1) {
      return cache[numPart - 1][here];
    }

    int ret = MX;
    for (int next = here + 1; next <= n; ++next) {
      ret = Math.min(ret, quantize(numPart - 1, next) + minSumOfSqErr(here, next - 1));
    }

    return cache[numPart - 1][here] = ret;
  }

  private static int minSumOfSqErr(int st, int en) {
    int n = en - st + 1;
    int sum = sumCache[st][en];
    int sqSum = sqSumCache[st][en];
    int m = Math.round((float) sum / n);

    return sqSum - 2 * m * sum + m * m * n;
  }

}
