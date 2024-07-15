package com.dukcode.swea;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class S1933 {

  private static BufferedReader br;
  private static BufferedWriter bw;
  private static StringTokenizer st;

  public static void main(String[] args) throws IOException {
    br = new BufferedReader(new InputStreamReader(System.in));
    bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int num = Integer.parseInt(br.readLine());

    List<Integer> divisors = new ArrayList<Integer>();
    for (int i = 1; i * i <= num; ++i) {
      if (num % i != 0) {
        continue;
      }

      divisors.add(i);
      if (i * i != num) {
        divisors.add(num / i);
      }
    }

    Collections.sort(divisors);
    for (Integer divisor : divisors) {
      bw.write(String.valueOf(divisor));
      bw.write(' ');
    }

    br.close();
    bw.close();
  }


}
