package oop1220;

abstract class Travel {         //추상클래스
  void view() {}                //일반메소드
  abstract String travelWhere();//추상메소드
}//class end

class TypeA extends Travel {
  @Override
  String travelWhere() {
    return "제주도 올레길";
  }
}//class end

class TypeB extends Travel {
  @Override
  String travelWhere() {
    return "여의도 불꽃축제";
  }
}//class end

class TypeC extends Travel {
  @Override
  String travelWhere() {
    return "지리산 둘레길";
  }
}//class end


public class Test03_abstract {
  public static void main(String[] args) {
    //추상클래스와 다형성
    
    //추상클래스는 자신의 클래스 이름으로
    //직접 객체 생성할 수 없다
    //Travel tour=new Travel(); 에러
    
    //다형성
    Travel tour=new TypeA();
    System.out.println(tour.travelWhere());
    
    tour=new TypeB();
    System.out.println(tour.travelWhere());
    
    tour=new TypeC();
    System.out.println(tour.travelWhere());    
    
    
    
    
    
    

  }//main() end
}//class end
