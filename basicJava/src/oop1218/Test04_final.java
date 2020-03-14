package oop1218;

/*
//1)final 클래스
final class Animal{ //종단클래스  
}//class end

//에러
//final 클래스를 상속받을 수 없다
class Elephant extends Animal{ //Animal클래스 상속
  
}//class end
*/

//2)final 메소드
class Fruit{
  void view() {}
  final void disp() {}
}//class end


class Apple extends Fruit{ //Fruit클래스 상속
  @Override      //<-annotation
                 //<-재정의(리폼)
  void view() {}

  /* 에러. final메소드는 더이상 override할수 없다    
  @Override
  void disp() {}
  */
}//class end



public class Test04_final {
  public static void main(String[] args) {
    //final 마지막의
    //변수  : 변수의 상수화 
    //함수  : 더이상 리폼(override 재정의)할 수 없다
    //클래스: 종단클래스. 부모클래스가 될 수 없다
    
    int a=3;
    a=5;//다른값으로 대입 가능
    
    final int b=4; //변수의 상수화
    //b=6; 에러
    //final변수값은 다른 값을 대입 불가능
    

  }//main() end
}//class end
