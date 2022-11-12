package com.lannstark.lec11;

public abstract class StringUtils {

  private StringUtils() {}

  public boolean isDirectoryPath(String path) {
    return path.endsWith("/");
  }

}

/**
 * Kotlin에서는 패키지를 네임스페이스를 관리하는 용도로만 사용하기 때문에
 * Java에서 package-private처럼 사용하지 않는다. 대신 Internal이라는 키워드가 생겼다.
 *
 * Internal은 '같은 모듈에서만 접근 가능'하다는 의미이고
 * 모듈은 '한번에 컴파일되는 Kotlin 코드'를 의미한다.
 */

