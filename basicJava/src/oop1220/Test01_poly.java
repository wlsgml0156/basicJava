package oop1220;

class Father extends Object{//Object 상속
  //멤버변수 field
  public String name="아버지";
  public String addr="주소";
  
  //생성자함수 constructor
  public Father() {} //default constructor
  public Father(String name, String addr) {
      this.name = name; //멤버변수와 지역변수 구분
      this.addr = addr;
  }
  
  //멤버함수 method
  public void disp(){
    System.out.println(this.name);
    System.out.println(this.addr);
  }
}//class end

class Son extends Father {
  public Son() {}
  public Son(String n, String a) {
    super.name=n; //부모멤버접근 super
    super.addr=a;
  }
}//class end

class Daughter extends Father {
  String friend="절친";
  public Daughter() {}
  public Daughter(String n, String a) {
    super(n, a); //부모생성자함수 호출 super()
  }
}//class end




public class Test01_poly {
  public static void main(String[] args) {
    //다형 Polymorphism
    //상속관계에서의 다형성
    //부모클래스입장에서 형태가 여러가지
    //클래스들간의 형변환을 위해서
//--------------------------------------------
    /*
    double a=3.4;
    int b=(int)a; //강제형변환(cast연산)
    */
    
    //1)일반적인 방식의 객체 생성
    //->new 연산자를 사용
    //->POJO(Plain Old Java Object)방식
    /*
    Father fa=new Father();
    fa.disp();
    
    Son son=new Son("손흥민", "영국");
    son.disp();
    
    Daughter dau=new Daughter("김연아", "한국");
    dau.disp();
    */
//------------------------------------------------    
    //2)다형성을 이용한 객체를 생성
    
    /*
    //->자식클래스가 부모클래스에 대입 가능하다    
    Father fa=new Son("개나리", "관철동");
    fa.disp();
    
    fa=new Daughter("진달래", "인사동");
    fa.disp();
    
    //자식클래스에 추가된 멤버는 다형성의 대상이 아니다
    //System.out.println(fa.friend); 에러
    */
//--------------------------------------------------------------------    
    
    //->부모클래스는 자식클래스의 모양으로 형태를 바꾼후 대입 가능하다
    /*
    Father father=new Father();
    Son son=new Son();
    
    father=son;     //자식이 부모에 대입
    
    son=(Son)father;//부모가 자식에 대입
                    //Exception발생 
    */
//-------------------------------------------------------------    
    //자바 클래스의 최고 조상 : Object
    //자바의 모든클래스는 Object클래스의 후손이다
    //자바의 모든 클래스는 Object클래스에 대입가능하다
    //->다형성
    
    Object obj=new Integer(3);
    System.out.println(obj.toString());
    
    obj=new Father();
    System.out.println(obj.toString());
    
    
    
    
    
  }//main() end
}//class end
