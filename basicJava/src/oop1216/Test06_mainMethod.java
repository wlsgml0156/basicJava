package oop1216;

public class Test06_mainMethod {

  public static void test() {
      //에러.
      //main()함수는 사용자가 임의로 호출할 수 없다
      //main();
    
      /* main() 함수의 호출  
         ->Java Virtual Marchine(JVM) 자바 가상 머신이
         ->자바클래스(.class)를 실행시 호출해 준다
 
                [Random Access Memory] 주기억장치
             
                Hello.class
           -----------------------------------------
                   JVM -> Hello.class의 main() 호출
           ----------------------------------------- 
             Operation System(운영체제) : Windows,Linux,MacOS
           -----------------------------------------
      */
    
    
  }//test() end
  
  public static void main(String[] args) {
    //main()함수에 값을 전달하는 예제

    //default package에 있는 
    //MainTest.java 참조
    //-> 실습은 [cmd명령프롬프트]에서 합니다
    
    /*
      시작 -> cmd
      >dir           목록확인
      >cls           화면클리어
      >d:            드라이브 변경
      >cd java1209   폴더이동
      >cd workspace
      >cd basicJava
      >cd src
      >javac MainTest.java               컴파일(번역)하면 MainTest.class생성
      >java MainTest SEOUL BUSAN JEJU    .class파일 실행시 전달값은
    
    */
    
  }//main() end
}//class end
