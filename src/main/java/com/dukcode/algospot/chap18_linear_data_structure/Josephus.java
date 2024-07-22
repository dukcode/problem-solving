package com.dukcode.algospot.chap18_linear_data_structure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Josephus {

  private static BufferedReader br;
  private static BufferedWriter bw;
  private static StringTokenizer st;

  private static int n;
  private static int k;

  public static void main(String[] args) throws IOException {
    br = new BufferedReader(new InputStreamReader(System.in));
    bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int c = Integer.parseInt(br.readLine());
    while (c-- > 0) {
      st = new StringTokenizer(br.readLine());
      n = Integer.parseInt(st.nextToken());
      k = Integer.parseInt(st.nextToken());

      List<Integer> list = IntStream.range(1, n + 1)
          .boxed()
          .collect(Collectors.toCollection(LinkedList::new));

      while (list.size() > 2) {
        list.remove(0);
        for (int i = 0; i < k - 1; ++i) {
          list.add(list.remove(0));
        }
      }

      Collections.sort(list);
      bw.write(String.valueOf(list.get(0)));
      bw.write(' ');
      bw.write(String.valueOf(list.get(1)));
      bw.newLine();
    }

    br.close();
    bw.close();
  }

}
