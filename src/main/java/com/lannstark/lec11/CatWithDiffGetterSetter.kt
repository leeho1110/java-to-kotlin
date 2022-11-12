package com.lannstark.lec11

class CatWithDiffGetterSetter(
    val name: String,
    _price: Int
) {
    /**
     * getter: Publi c
     * setter: Private
     *
     * Internal은 바이트 코드 상에선 결국 Pulbic 과 같다.
     * 따라서 Java 코드 작성 시 Kotlin 모듈의 internal 코드를 가져올 수 있다.
     */
    var price = _price
        private set
}