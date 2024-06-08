package com.ohgiraffers.section02.generation;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Application2 {

    public static void main(String[] args) {

        /*
        * 기본타입 스트림 생성
        * range(시작값, 종료값) : 시작값부터 1씩 증가하는 숫자로 종료값 전까지 범위의 스트림 생성
        * rangeClosed(시작값, 종료값) : 시작값부터 1씩 증가하는 숫자로 종료값까지 범위의 스트림 생성
        * */

        IntStream intStream = IntStream.range(5,10);
        intStream.forEach(value -> System.out.print(value + " "));
        System.out.println(); // 줄바꿈

        LongStream longStream2 = LongStream.rangeClosed(5,10);
        longStream2.forEach(value -> System.out.print(value + " "));
        System.out.println(); // 줄바꿈

        /*
        * Wrapper 클래스자료형의 스트림으로 변환이 필요할 때 boxing을 통해 할 수 있다.
        * doubles(갯수) : 갯수만큼 생성하여 반환
        * boxed() : 기본 타입 스트림언 XXXStream을 박싱하여 Wrapper 타입의  Stream<XXX>으로 반환
        * */

        // 실수형 랜덤 수 5개를 담은 doubleStream
        Stream<Double> doubleStream = new Random().doubles(5).boxed();
        doubleStream.forEach(value -> System.out.print(value + " "));
        System.out.println(); // 줄바꿈
    }
}
