package oop1216;

public class Test01_method {
  
  //메소드 작성 영역(멤버함수)
  
  //void 리턴값이 없다
  public static void test1() {
      System.out.println("JAVA");
  }//test1() end
  
  public static void test2() {
      System.out.println("KOREA");
      return; //함수를 호출한 시점으로 되돌아 간다
              //마지막 return명령어는 생략가능하다
  }//test2() end
  
  public static void test3(int a) {//a는 매개변수(parameter)
    System.out.println(a);
    return; //생략가능하다
  }//test3() end
  
  public static void test4(int a, int b, int c) {
    //매개변수의 자료형은 생략 할 수 없다
    System.out.println(a+b+c);
  }//test4() end
  
  public static void test5(double a, double b) {
    System.out.println(a+b);
  }//test5() end
  
  public static void test6(char ch, byte num) {
    for(int a=1; a<=num; a++) {
      System.out.print(ch);
    }//for end
  }//test6() end
  
  public static void main(String[] args) {
    //Method 메소드 ★★★★★
    //->함수, function, procedure
    //->일정한 기능을 가지고 있는 것
    //->식별자 : 프로젝트명 basicJava
    //           팩키지명   oop1216
    //           클래스명   Test01_method.java (소스프로그램)
    //                      Test01_method.class(목적프로그램) -> 여러개의 클래스파일(.class)을 하나로 압축(.jar)
    //           변수명, 함수명
    //->형식) 리턴형 함수명(){ 처리내용들 }
    //-> "test"문자열상수, test변수, test()함수
    //->함수 작성시 고려사항 : 매개변수(parameter), 리턴값
    //->함수정의(작성)하고, 함수를 호출함으로써 수행된다
    //->사용자 정의 함수(user defined)
//----------------------------------------------------------
         
    //1)전달값(argument value)이 없는 경우
    /*
    test1(); //함수호출
    test1();
    test1();
    
    test2();
    test1();
    */
//-----------------------------------------------------------
    //10    int형
    //10L   long형
    //3.4f  float형
    //5.6d  double형
    //7.8   double
//----------------------------------------------    
    //2)전달값이 있는 경우
    test3(10);
    test3(20);
    test3(50);
    
    test4(7, 8, 9);//전달값은 1개이상 가능하다
    test4(1, 2, 3);
    
    test5(1.2, 3.4);
    
    byte num=100; 
    test6('#', num); 
    
    
  }//main() end
}//class end
