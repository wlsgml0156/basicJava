package oop1220;

interface IMessage{
  public void msgPrint();
}//interface end

class Message implements IMessage { //구현
  @Override
  public void msgPrint() {
    System.out.println("Message 클래스");
  }
}//class end


public class Test06_anonymous {
  public static void main(String[] args) {
    //익명 내부 클래스 Anonymous class

    //인터페이스는 직접 객체 생성할수 없다
    //에러
    //IMessage msg=new IMessage();
    
    
    //1)구현한 클래스
    Message msg=new Message();
    msg.msgPrint();
    
    
    //2)다형성
    IMessage imess=new Message();
    imess.msgPrint();
    
    
    //3)익명클래스
    //->필요한 곳에서 일시적으로 생성
    //->이벤트가 발생할 때만 실행
    //->안드로이드 자바, JavaScript, jQuery 에서 많이 활용
    IMessage mess=new IMessage() {
      @Override
      public void msgPrint() {
        System.out.println("Anonymous 익명 내부 클래스"); 
      }
    };
    
    mess.msgPrint();
    
    
    
    
    
    
  }//main() end
}//class end
