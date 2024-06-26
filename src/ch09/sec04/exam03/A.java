//package ch09.sec04.exam03;
//
//public class A {
////    메소드
//    public void method1(int arg) {
////        로컬 변수
//        int var = 1;
////        로컬 클래스가 추가되면서 arg의 var는 상수 처리된다.
////        즉, 읽기는 가능하지만 쓰기가 불가능해진다.
//
////        로컬 클래스
//        class B {
////            메소드
//            void method2() {
////                로컬 변수 읽기
//                System.out.println("arg : " + arg);
//                System.out.println("var : " + var);
////                로컬 변수 수정(오류)
////                arg =2;
////                var=2;
//            }
//        }
////        로컬 객체 생성
//        B b = new B();
////        로컬 객체 메소드 호출
//        b.method2();
//
////        로컬 변수 수정(오류)
//        arg =3;
//        var=3;
//        }
//    }
//
//
