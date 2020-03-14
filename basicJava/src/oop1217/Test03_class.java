package oop1217; //<-현재클래스의 저장 위치
                 //<-한번만 선언한다

//다른 팩키지의 클래스를 사용하려면
//import로 팩키지 선언후 사용한다
import java.io.*;

class Sungjuk{ //클래스의 첫글자 대부분 대문자로 한다
               //package class Sungjuk{}
               //->package가 생략되어 있다  
  
  /*
    Access Modifier 접근지정, 접근수정, 접근제어
    ->private   : 비공개.   클래스 외부에서는 접근 불가능. 특정값을 은폐할 수 있다
    ->package   : 생략한다. 현재 팩키지내에서만 접근가능하다
    ->protected : 상속관계에 있는 클래스가 다른 팩키지에 있는 경우
    ->public    : 공개. basicJava프로젝트내에서 모두 접근 가능
  */  
//-----------------------------------------------------------  
  //클래스내부의 멤버들 간에는 
  //Access Modifier와 상관없이 접근 가능하다
  
  //멤버변수 field
  public String name; //클래스외부에서 접근가능하다
  int kor, eng, mat;  //package가 생략되어 있다
  private int aver;   //클래스외부에서 접근 불가능
  
  //멤버함수 method
  private void view() {}//view() end
  
  void calc() {//package생략되어 있음
    //클래스내부의 멤버들간에는
    //접근제어와 상관없이 서로 접근가능하다
    aver=(kor+eng+mat)/3;    
  }//calc() end
  
  public void disp() {
    System.out.println(name);
    System.out.println(kor);
    System.out.println(eng);
    System.out.println(mat);
    System.out.println(aver);
  }//disp() end
  
}//class end


public class Test03_class {
  public static void main(String[] args) {
    //클래스 class
    //->사용자 정의 참조자료형
    //->구성멤버  : 멤버변수(field)와 멤버함수(method)로 구성된다
    //->new연산자 : 클래스를 사용하려면 메모리를 할당하고 사용한다
    //->메모리할당형식) new 생성자함수() => 객체(Object)라 한다
    
    //기본자료형
    int a; //4byte메모리 할당
           //a는 변수(Variable)
    
    //참조자료형(클래스)
    //new Sungjuk(); //RAM의 heap공간에 할당
                     //객체(Object)
                 
    //Object Oriented Program 객체지향 프로그램
    
    Sungjuk sj=new Sungjuk(); //#50주소에 메모리할당
                              //sj 참조변수(reference)
    
    //참조변수를 통해 객체에 접근하는 연산자
    // . 연산자
    sj.name="손흥민";
    sj.kor=90;
    sj.eng=85;
    sj.mat=100;
    //sj.aver 에러. private속성은 클래스외부에서 접근 불가능
    
    System.out.println(sj.name);
    System.out.println(sj.kor);
    System.out.println(sj.eng);
    System.out.println(sj.mat);
    
    //sj.view();에러. private속성은 클래스외부에서 접근 불가능
    sj.calc();
    sj.disp();
//---------------------------------------------------    
    Sungjuk sungjuk=new Sungjuk();
    sungjuk.name="박지성";
    sungjuk.kor=100;
    sungjuk.eng=95;
    sungjuk.mat=85;
    sungjuk.calc();
    sungjuk.disp();
//-------------------------------------------    
    //참조변수가 가지고 있는 객체의 주소값
    System.out.println(sj.hashCode());
    System.out.println(sungjuk.hashCode());
    
    int b=3;
    int c=b;
    
    Sungjuk tmp=sj;
    System.out.println(tmp.hashCode());
    
    
    
  }//main() end
}//class end

