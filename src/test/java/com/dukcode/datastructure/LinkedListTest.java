package com.dukcode.datastructure;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class LinkedListTest {

  @Test
  void 리스트_뒤에_값을_추가할_수_있다() {
    LinkedList<Integer> list = new LinkedList<>();

    list.addLast(1);
    list.addLast(2);

    assertThat(list.toString()).isEqualTo("[1, 2]");
  }

  @Test
  void 리스트_앞에_값을_추가할_수_있다() {
    LinkedList<Integer> list = new LinkedList<>();

    list.addFirst(1);
    list.addFirst(2);

    assertThat(list.toString()).isEqualTo("[2, 1]");
  }

  @Test
  void 리스트에_값을_추가할_수_있다() {
    LinkedList<Integer> list = new LinkedList<>();

    list.addFirst(1);
    list.addFirst(2);
    list.addLast(3);
    list.addLast(4);
    assertThat(list.toString()).isEqualTo("[2, 1, 3, 4]");

    list.add(3, 10);
    assertThat(list.toString()).isEqualTo("[2, 1, 3, 10, 4]");

    list.add(0, 11);
    assertThat(list.toString()).isEqualTo("[11, 2, 1, 3, 10, 4]");

    list.add(2, 12);
    assertThat(list.toString()).isEqualTo("[11, 2, 12, 1, 3, 10, 4]");

    list.add(7, 13);
    assertThat(list.toString()).isEqualTo("[11, 2, 12, 1, 3, 10, 4, 13]");
  }

  @Test
  void 리스트의_값을_변경할_수_있다() {
    LinkedList<Integer> list = new LinkedList<>();

    list.addLast(1);
    list.addLast(2);
    list.addLast(3);
    list.addLast(4);

    list.set(1, 10);
    assertThat(list.toString()).isEqualTo("[1, 10, 3, 4]");
  }

  @Test
  void 리스트의_값을_조회할_수_있다() {
    LinkedList<Integer> list = new LinkedList<>();

    list.addLast(1);
    list.addLast(2);
    list.addLast(3);
    list.addLast(4);

    assertThat(list.get(0)).isEqualTo(1);
    assertThat(list.get(1)).isEqualTo(2);
    assertThat(list.get(2)).isEqualTo(3);
    assertThat(list.get(3)).isEqualTo(4);
  }

  @Test
  void 리스트의_값을_삭제할_수_있다() {
    LinkedList<Integer> list = new LinkedList<>();

    list.addLast(1);
    list.addLast(2);
    list.addLast(3);
    list.addLast(4);
    list.addLast(5);

    assertThat(list.removeFirst()).isEqualTo(1);
    assertThat(list.toString()).isEqualTo("[2, 3, 4, 5]");

    assertThat(list.remove(2)).isEqualTo(4);
    assertThat(list.toString()).isEqualTo("[2, 3, 5]");

    assertThat(list.removeLast()).isEqualTo(5);
    assertThat(list.toString()).isEqualTo("[2, 3]");
  }
}