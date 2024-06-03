package com.ohgiraffers.section02.stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application2 {

    public static void main(String[] args) {

        /*
        * FileReader
        * FileInputStream 과 사용하는 방법이 거의 동일하다.
        * 단, byte 단위가 아닌 character 단위로 읽어들이는 부분이 차이점.
        * => 2바이트이던 3바이트이던 글자 단위로 읽어오기 때문에 한글도 정상적으로 읽을 수 있다.
        * */

        FileReader fr = null;

        try {
            fr = new FileReader("src/main/java/com/ohgiraffers/section02/stream/testReader.txt");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            // 자원 반납
            if(fr != null) {
                try {

                    fr.close();

                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
