package com.ohgiraffers.section02.itermediate;

import java.util.stream.IntStream;

public class Application1 {

    // 중계연산, 중간연산
    public static void main(String[] args) {

        /*
        * Stream<T> filter(Predicate<? super T> predicate);
        * 필터(filter)는 스트림에서 특정 데이터만 걸러내는 메소드
        * 매개변수로 받는 Predicate는 boolean을 리턴하는 함수형 인터페이스
        * */

        IntStream intStream = IntStream.range(0,10); // 0 ~ 9
        // i % 2 == 0 인 경우만 골라내기
        intStream.filter(i -> (i % 2) == 0) // 0, 2, 4, 6, 8
                .forEach(i -> System.out.print(i + " "));
    }
}
