package com.dukcode.solvedac.class_02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class B2108 {

  private static BufferedReader br;
  private static BufferedWriter bw;

  public static void main(String[] args) throws IOException {
    br = new BufferedReader(new InputStreamReader(System.in));
    bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    for (int i = 0; i < n; ++i) {
      arr[i] = Integer.parseInt(br.readLine());
    }

    Arrays.sort(arr);

    int[] freq = new int[2 * 4_000 + 1];

    int sum = 0;
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < n; ++i) {
      freq[arr[i] + 4_000]++;
      sum += arr[i];
      max = Math.max(max, arr[i]);
      min = Math.min(min, arr[i]);
    }

    double avg = (double) sum / n;
    int median = arr[n / 2];
    int mostFreq = getMostFreq(freq);
    int range = max - min;

    bw.write(String.valueOf(Math.round(avg)));
    bw.newLine();
    bw.write(String.valueOf(median));
    bw.newLine();
    bw.write(String.valueOf(mostFreq));
    bw.newLine();
    bw.write(String.valueOf(range));

    br.close();
    bw.close();

  }

  private static int getMostFreq(int[] freq) {
    int maxFreq = Arrays.stream(freq).max().getAsInt();
    List<Integer> list = new ArrayList<>();
    for (int num = -4_000; num <= 4_000; ++num) {
      int idx = num + 4_000;
      if (freq[idx] == maxFreq) {
        list.add(num);
      }
    }

    list.sort(Comparator.naturalOrder());
    return list.size() == 1 ? list.get(0) : list.get(1);
  }

}
