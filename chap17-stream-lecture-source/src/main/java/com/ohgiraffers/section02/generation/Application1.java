package com.ohgiraffers.section02.generation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Application1 {

    public static void main(String[] args) {

        // 배열과 컬렉션 객체의 stream() 메소드를 활용한 스트림 생성

        String[] sarr = new String[] {"java", "oracle","jdbc"};

        Stream<String> strStream1 = Arrays.stream(sarr);
        strStream1.forEach(System.out::println);

        // 배열의 일부분(0번 인덱스부터 2번 인덱스 이전까지)를 스트림으로 변환
        System.out.println("=============== 배열 일부분만 스트림을 변환 ===============");
        Stream<String> strStream2 = Arrays.stream(sarr,0,2);
        strStream2.forEach(System.out::println);

        List<String> stringList = Arrays.asList("html","css","javascript"); // asList로 만들었을땐 수정,삭제 불가
        

    }
}
