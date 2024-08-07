package com.dukcode.test;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;

public class HashMapTest {

  @Test
  void test() {
    Map<List<Integer>, String> map = new HashMap<>();

    List<Integer> a = new ArrayList<>();
    List<Integer> b = new ArrayList<>();

    for (int i = 0; i < 3; ++i) {
      a.add(i);
      b.add(i);
    }

    map.put(a, "a");

    assertThat(map.get(a)).isEqualTo("a");
    assertThat(map.get(b)).isEqualTo("a");

    a.add(3);
    assertThat(map.get(a)).isEqualTo(null);
    assertThat(map.get(b)).isEqualTo(null);
  }

}
