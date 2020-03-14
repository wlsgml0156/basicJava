package oop1220;

interface Parent{
  //void disp() {}      //일반메소드 사용 불가. 에러
  abstract void kind(); //추상메소드
  void breathe();       //abstract생략가능
}//interface end

//클래스입장에서 부모가 클래스    :extends   확장
//클래스입장에서 부모가 인터페이스:implements구현
class Child1 implements Parent {
  @Override
  public void kind() {
    System.out.println("포유류");
  }
  
  @Override
  public void breathe() {
    System.out.println("허파 숨쉬기");
  }
}//class end


class Child2 implements Parent {

  @Override
  public void kind() {
    System.out.println("어류");
  }

  @Override
  public void breathe() {
    System.out.println("아가미 숨쉬기");
  }
  
}//class end


public class Test04_interface {
  public static void main(String[] args) {
    //인터페이스 interface
    //->추상메소드로만 구성되어 있다
    //->추상클래스보다 더 추상화 되어 있다
    
    //에러
    //인터페이스 자신으로 직접 객체 생성 불가능
    //Parent parent=new Parent();
    
    
    Child1 one=new Child1();
    one.kind();
    one.breathe();
    
    Child2 two=new Child2();
    two.kind();
    two.breathe();
    
    
    //인터페이스에서의 다형성
    Parent parent=new Child1();
    parent.kind();
    parent.breathe();
    
    parent=new Child2();
    parent.kind();
    parent.breathe();
    
    
    
    
    
    
    
    
    
    
    
    
    
  }//main() end
}//class end
