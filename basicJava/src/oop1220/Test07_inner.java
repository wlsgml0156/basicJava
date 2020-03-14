package oop1220;

import oop1220.WebProgarm.Language;
import oop1220.WebProgarm.Smart;

class WebProgarm{ //.jsp .asp .php
  String title="Java Program";
  
  class Language { //inner class
    String basic="JAVA, HTML, CSS, JavaScript";
    void display(){
        System.out.println("기초수업:" + basic);
    }
  }//class end
  
  class Smart{     //inner class
    String basic="Objective-C, Java OOP, C#";
    void display(){
        System.out.println("기초수업:" + basic);
    }
  }//class end
  
  
  public void print() {
    Language lang=new Language();
    lang.display();
    
    Smart sm=new Smart();
    sm.display();
    
  }//print() end  
  
}//class end


//안드로이드OS 기반 자바
class R {
    static class id {
      static String btn="버튼";
    }
}//class end



public class Test07_inner {
  public static void main(String[] args) {
    //내부 클래스 inner class
    //->클래스내부에서 선언된 클래스
    
    WebProgarm web=new WebProgarm();
    web.print();    
    
    
    /* 에러
       내부클래스는 직접 접근할수 없다
    Language lang=new Language();
    Smart sm=new Smart();
    */
    
    
    //내부클래스는 외부에서 단계적으로 접근할 수는 있다
    Language lang=new WebProgarm().new Language();
    Smart sm=new WebProgarm().new Smart();
    
    lang.display();
    sm.display();
//-----------------------------------------------------    
    
    System.out.println(R.id.btn);
    
    

  }//main() end
}//class end
