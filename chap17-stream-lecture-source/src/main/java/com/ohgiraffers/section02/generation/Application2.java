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

        // 문자열을 intStream으로 변환
        IntStream helloworldChars = "hello world".chars(); // 문자열을 int 형으로 변경
        helloworldChars.forEach(v -> System.out.print(v + " "));
        System.out.println();

        Stream<String> stringStream1 = Stream.of("java","oracle","jdbc");
        Stream<String> stringStream2 = Stream.of("html", "css", "javascript");

        // 스트림은 1회성으로 사용 가능하며, 이미 최종 연산이 끝난 스트림은 재사용이 불가능하다.
        // 다시 사용할 시 IllegalStateException이 발생한다.
//        stringStream1.forEach(System.out::println);
//        stringStream2.forEach(System.out::println);

        /*
        * concat() : 두개의 스트림을 동일 타입 스트림으로 합치기
        * */

        System.out.println("================ concatStream ================");
        Stream<String> concatStream = Stream.concat(stringStream1, stringStream2);
        concatStream.forEach(System.out::println);
    }
}
