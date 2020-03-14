package oop1219;

class Korea extends Object {
          //자바의 모든 클래스는 Object클래스를 상속받아야 한다
          //extends Object는 생략가능
  
  String name="대한민국";//private   상속안됨.
                         //package   상속됨.  oop1219팩키지내에서만 접근
                         //protected 상속됨.  자식클래스가 있는 다른 팩키지에서도 접근
                         //public    상속됨.  basicJava프로젝트내에서 모두 접근
  final void view() {
    System.out.println("Korea.view()...");
  }
  public void disp() {
    System.out.println("Korea.disp()"+this.name);
  }  
  
}//class end


class Seoul extends Korea {
  String name="서울특별시"; //재정의
  /* 에러
     final method는 더이상 오버라이드할 수 없다
     void view() {}
  */
  @Override            //<-annotation
                       //재정의
  public void disp() {
    System.out.println("Seoul.disp()..."+this.name);
  }
  
}//class end

class Busan extends Korea{
  String name="부산광역시";

  //오버라이드 할때 : Ctrl+Space 또는
  //Source->Override/Implements Methods...사용
  @Override
  public void disp() {
    System.out.println("Busan.disp()..."+this.name);
  }
  
}//class end

class Jeju extends Object{
         //extends Object 생략할수 있다
  
  @Override
  public String toString() {
    return "제주특별자치";
  }  
  
}//class end


class Suwon { //extends Object생략되어 있다
  private String id="soldesk";
  private String pw="1234";
  
  @Override
  public String toString() {
    return "Suwon [id=" + id + ", pw=" + pw + "]";
  }
  
}//class end


public class Test03_override extends Object {
  
  public static void main(String[] args) {
    //Method Override 함수 재정의
    //->상속관계에서 메소드를 다시 수정(리폼)
    
    //Method Overload 함수 중복 정의
    
    /*
       자바의 기본팩키지      java.lang
       자바의 최고 조상클래스 Object클래스
       자바의 모든 클래스는 생성할 때 무조건 Object클래스를 상속받는다
       자바의 모든 클래스는 Object의 후손이다(맞다)   
    */
//--------------------------------------------
    
    //오버라이드 하기전
    //se 참조(reference)변수 = 객체(object)
    /*
    Seoul se=new Seoul();
    System.out.println(se.name);//대한민국
    se.view();
    se.disp();//Korea.disp() 대한민국
    */
    
    //오버라이드 한후
    /*
    Seoul se=new Seoul();
    System.out.println(se.name);//서울특별시
    se.view();
    se.disp();//Seoul.disp() 서울특별시
    */
//------------------------------------------------
    Busan bu=new Busan();
    Jeju  je=new Jeju();
    
    System.out.println(bu.toString());
    System.out.println(je.toString());

    //toString()메소드명 생략할 수 있다
    System.out.println(bu);
    System.out.println(je);
    
    Suwon su=new Suwon();
    System.out.println(su.toString());
    System.out.println(su);
    
    
    
    
    
    
    

  }//main() end
}//class end
