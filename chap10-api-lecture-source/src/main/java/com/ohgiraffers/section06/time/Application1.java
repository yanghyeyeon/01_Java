package com.ohgiraffers.section06.time;

import java.time.*;

public class Application1 {

    // time 패키지 => Date, Calendar가 가지고 있는 단점을 해소하기위해 탄생
    public static void main(String[] args) {
        /*
        * time 패키지에는
        * LocalTime, LocalDate, LocalDateTime, ZoneDateTime
        * 클래스들이 있다.
        * */

        /*
        * LocalTime
        * 시간을 표현하는 클래스
        * - 시, 분, 초, 나노초
        * - 날짜 정보를 포함하지 않는다.
        * - 14:30:15.123
        * */

        LocalTime timeNow = LocalTime.now();
        System.out.println("timeNow = " + timeNow);
        LocalTime timeOf = LocalTime.of(15,25,1);
        System.out.println("timeOf = " + timeOf);

        /*
        * LocalDate
        * 날짜를 표현하는 클래스
        * - 연도, 월, 일
        * - 시간 정보를 포함하지 않는다.
        * - 2024-05-29
        * */
        LocalDate dateNow = LocalDate.now();
        System.out.println("dateNow = " + dateNow);
        LocalDate dateOf = LocalDate.of(2024,5,29);
        System.out.println("dateOf + " + dateOf);

        /*
        * ZoneDateTime
        * 날짜와 시간, 시간대를 함께 포함하는 클래스
        * - 연도, 월, 일, 시, 분, 초, 시간대
        * -  2024-05-29T14:3:15.123+02:00[Asia/Seoul]
        * */
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("zonedDateTime = " + zonedDateTime);
        ZonedDateTime zsomedDateTimeOf = ZonedDateTime.of(dateOf,timeOf, ZoneId.of("Asia/Seoul"));
        System.out.println("zonedDateTimeOf = " + zsomedDateTimeOf);

        /*
        * LocalDateTime
        * 날짜와 시간을 함께 표현하는 클래스
        * - 연도, 월, 일, 시, 분,초, 나노초
        * - 2024-05-29T14:0:15.123
        * */
        LocalDateTime dateTimeNow = LocalDateTime.now();
        System.out.println("dateTimeNow = " + dateTimeNow);
        LocalDateTime localDateTimeOf = LocalDateTime.of(2024,5,9,9,30,15,123000000);
        System.out.println("localDateTimeOF = " + localDateTimeOf);

    }
}
