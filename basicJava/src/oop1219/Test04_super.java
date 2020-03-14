package oop1219;

class School{
  String name="학교";
  public School() {
    System.out.println("School()...");
  }
}//class end

class MiddleSchool extends School{
  String name="중학교";
  public MiddleSchool() {
    
    //상속관계에서 부모생성자함수 호출명령어
    super();  //생략가능하다    
    
    System.out.println("MiddleSchool()...");
  }
}//class end

class HighSchool extends School {
  String name="고등학교"; //멤버변수
  
  public HighSchool() {
    super();
    System.out.println("HighSchool()...");
  }
  
  public void disp() {
    String name="종로고등학교";//지역변수
    System.out.println(name);      //종로고등학교
    System.out.println(this.name); //고등학교
    System.out.println(super.name);//학교    
  }//end
  
}//class end




public class Test04_super {
  public static void main(String[] args) {
    //부모, 조상 super
    
    //super   : 자식클래스에서 부모클래스의 멤버변수에 접근할때
    //super() : 자식클래스의 생성자함수가
    //          부모클래스의 생성자함수를 호출할때
    
    //this    : 멤버변수(field)와 지역변수를 구분하기 위해
    //this()  : 자신이 자신의 생성자함수를 호출할때
    
    //부모클래스 superclass
    //자식클래스 subclass
//---------------------------------------------------
    //상속관계에서 생성자 함수 호출순서
    //부모 생성자 먼저 호출 -> 자신 생성자 호출
    
    /*
    //School() -> MiddleSchool()
    MiddleSchool ms=new MiddleSchool();
    //자신의 멤버가 우선순위가 높다
    System.out.println(ms.name);//중학교
    */
//----------------------------------------------------    
  //School() -> HighSchool()
    HighSchool hs=new HighSchool();
    hs.disp();
    

  }//main() end
}//class end
