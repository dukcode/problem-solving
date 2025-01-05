package com.dukcode.solvedac.class_02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringJoiner;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class B11866 {

  private static BufferedReader br;
  private static BufferedWriter bw;
  private static StringTokenizer st;

  public static void main(String[] args) throws IOException {
    br = new BufferedReader(new InputStreamReader(System.in));
    bw = new BufferedWriter(new OutputStreamWriter(System.out));

    st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int k = Integer.parseInt(st.nextToken());

    Deque<Integer> dq = IntStream.rangeClosed(1, n)
        .boxed()
        .collect(Collectors.toCollection(LinkedList::new));

    StringJoiner sj = new StringJoiner(", ", "<", ">");
    while (!dq.isEmpty()) {
      for (int i = 0; i < k - 1; ++i) {
        dq.offerLast(dq.pollFirst());
      }

      int num = dq.pollFirst();
      sj.add(String.valueOf(num));
    }

    bw.write(sj.toString());

    br.close();
    bw.close();

  }

}
