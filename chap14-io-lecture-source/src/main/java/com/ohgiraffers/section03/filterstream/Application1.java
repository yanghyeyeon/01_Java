package com.ohgiraffers.section03.filterstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Application1 {

    // BufferedWriter & BufferedReader
    public static void main(String[] args) {

        /*
        * java.io 패키지의 입출력 스트림은 기본(기반)스트림과 필터(보조) 스트림으로 분류할 수 있다.
        * 기본 스트림은 외부 데이터에 직접 연결되는 스트림이고
        * 필터 스트림은 외부 데이터에 직접 연결하는 것이 아니라 기본 스트림에 추가로 사용 가능한 스트림이다.
        * 주로 성능을 향상시키는 목적으로 사용된다.
        * 생성자 쪽에 매개변수로 다른 스트림을 이요하는 클래스를 필터 스트림이라고 할 수 있다.
        * */

        BufferedWriter bw = null;

        try {
            bw = new BufferedWriter(new FileWriter("src/main/java/com/ohgiraffers/section03/filterstream/testBufferd.txt"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
