package com.dukcode.solvedac.class_03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class B11723 {

  private static BufferedReader br;
  private static BufferedWriter bw;
  private static StringTokenizer st;

  private static List<Integer> all;
  private static Set<Integer> set;

  public static void main(String[] args) throws IOException {
    br = new BufferedReader(new InputStreamReader(System.in));
    bw = new BufferedWriter(new OutputStreamWriter(System.out));

    all = IntStream.rangeClosed(1, 20).boxed().collect(Collectors.toList());
    set = new HashSet<>();

    int n = Integer.parseInt(br.readLine());

    for (int i = 0; i < n; ++i) {
      st = new StringTokenizer(br.readLine());
      String command = st.nextToken();
      execute(command, st);
    }

    br.close();
    bw.close();
  }

  /*
  add x: S에 x를 추가한다. (1 ≤ x ≤ 20) S에 x가 이미 있는 경우에는 연산을 무시한다.
  remove x: S에서 x를 제거한다. (1 ≤ x ≤ 20) S에 x가 없는 경우에는 연산을 무시한다.
  check x: S에 x가 있으면 1을, 없으면 0을 출력한다. (1 ≤ x ≤ 20)
  toggle x: S에 x가 있으면 x를 제거하고, 없으면 x를 추가한다. (1 ≤ x ≤ 20)
  all: S를 {1, 2, ..., 20} 으로 바꾼다.
  empty: S를 공집합으로 바꾼다.
   */
  private static void execute(String command, StringTokenizer st) throws IOException {
    switch (command) {
      case "add":
        int toAdd = Integer.parseInt(st.nextToken());
        set.add(toAdd);
        break;
      case "remove":
        int toRemove = Integer.parseInt(st.nextToken());
        set.remove(toRemove);
        break;
      case "check":
        int toCheck = Integer.parseInt(st.nextToken());
        bw.write(String.valueOf(set.contains(toCheck) ? 1 : 0));
        bw.newLine();
        break;
      case "toggle":
        int toToggle = Integer.parseInt(st.nextToken());
        if (set.contains(toToggle)) {
          set.remove(toToggle);
        } else {
          set.add(toToggle);
        }
        break;
      case "all":
        set = new HashSet<>(all);
        break;
      case "empty":
        set = new HashSet<>();
        break;
      default:
        break;
    }
  }

}
