package com.lannstark.lec02;

import org.jetbrains.annotations.Nullable;

public class Person {

  private final String name;

  public Person(String name) {
    this.name = name;
  }

  @Nullable // 만약 어노테이션이 없다면
  public String getName() {
    return name;
  }

}


