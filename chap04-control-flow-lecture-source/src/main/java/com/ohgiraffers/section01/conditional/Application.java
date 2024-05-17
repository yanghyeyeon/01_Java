package com.ohgiraffers.section01.conditional;

public class Application {
    // 실행용 클래스
    public static void main(String[] args) {

        A_If aIf = new A_If();
        //aIf.testSimpleIfStatement(); // 단일 if 문
        //aIf.testNestedIfStatement();

        B_IfElse bIfElse = new B_IfElse();
        //bIfElse.testSimpleIfElseStatement(); // 단일 if-else
        //bIfElse.testNestedIfElseStatement(); // 중첩 if-else

        C_IfElseIf cIfElseIf = new C_IfElseIf();
        //cIfElseIf.testSimpleIfElseIfSatement();
        //cIfElseIf.testNestedIfElseIfStatement();


        D_Switch dSwitch = new D_Switch();
        //dSwitch.testSimpleSwitchStatement();
        dSwitch.testSwitchVendingMachine();



    }
}
