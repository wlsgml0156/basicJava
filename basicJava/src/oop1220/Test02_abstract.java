package oop1220;

abstract class Animal {//추상클래스
  String name;
  void view() {}       //일반메소드
  abstract void disp();//추상메소드(미완성메소드)
}//class end


//추상클래스는 자식들의 부모역할만 주로 한다

//추상클래스를 상속받은 자식클래스는
//반드시 추상메소드를 완성해야 한다(override)
class Elephant extends Animal {
  @Override //재정의
  void disp() {
    System.out.println("점보");
  }
}//class end


class Tuna extends Animal {
  @Override
  void disp() {
    System.out.println("니모");
  }
}//class end


public class Test02_abstract {
  public static void main(String[] args) {
    //추상클래스 Abstract class
    //->추상메소드가 1개라도 있는 클래스
    //->일반메소드와 추상메소드가 같이 선언가능하다
    //->객체를 생성할 수 없다
    //->new연산자를 직접 사용할 수 없다    
    
    //추상메소드
    //->형식) 리턴형 함수명();
    //->메소드의 body{} 가 없음
    //->메소드의 머리말만 존재
    
    //인터페이스 : 추상메소드만 선언 가능하다
//----------------------------------------------------
    //에러
    //추상클래스는 new연산자로 직접 객체생성할수 없다
    //Animal ani=new Animal();
    
    
    Elephant jumbo=new Elephant();
    jumbo.disp();
    
    Tuna nemo=new Tuna();
    nemo.disp();
//-------------------------------------------
    //추상클래스의 다형성
    Animal ani=new Elephant();
    ani.disp();
    
    ani=new Tuna();
    ani.disp();
    
    
    
    
    
    
    
    
    
    
        
    
    
    
    
    
  }//main() end
}//class end
