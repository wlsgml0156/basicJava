package oop1219;

//종단클래스는 상속시킬수 없다
//final class AA{}

class AA{
  private void zero() {}
  public void one() {
    System.out.println("AA.one()...");
  }
  public void two() {
    System.out.println("AA.two()...");
  }
}//class end

class BB extends AA{ //부모클래스 AA
                     //자식클래스 BB
  public void three() {
    System.out.println("BB.three()...");
  }
}//class end

class CC extends BB {
  public void four() {
    System.out.println("CC.four()...");
  }
}//class end

class DD{}//class end
/* 에러
   클래스는 단일상속만 가능하다
class EE extends AA, DD{}
*/



public class Test02_sangsok {
  public static void main(String[] args) {
    //상속 inheritance
    //->재활용
    //->부모, 조상, super class
    //->자식, 후손, sub class
    //->클래스 상속, 인터페이스 상속
    //형식) class 자식 extends 부모{}
    
    /*
    AA aa=new AA();
    //aa.zero(); private속성은 클래스 내부에서만 접근가능
    aa.one();
    aa.two();
    */
//-----------------------------------------------------
    /*
    BB bb=new BB();
    bb.three();
    bb.one();
    bb.two();
    //bb.zero();private속성은 상속되지 않는다
    */
//--------------------------------------------------
    CC cc=new CC();
    cc.four();
    cc.three();
    cc.one();
    cc.two();
    
    
    
    
    
    
    
    
    

  }//main() end
}//class end
