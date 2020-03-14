package oop1223;

class Test{
  //1)try~catch를 이용한 예외처리
  /*
  public void view() {
      try{
          int a=3/0;
      }catch(Exception e){}
  }//view() end
  
  public void dsip() {
      try{
          int a=Integer.parseInt("soldesk");
      }catch(Exception e){}
  }//disp() end
  */
  
  //2)throws를 이용한 예외처리
  public void view() throws Exception {
    int a=3/0;
  }
  
  public void disp() throws NumberFormatException,   
                            NullPointerException{
    
    int a=Integer.parseInt("soldesk");
  }  
  
  /* synchronized 동기화
  여러쓰레드에서 공유데이터를 접근하여 사용하고 있을때
  한개의 쓰레드에서 공유데이터를 사용하는 중에
  쓰레드의 교체가 일어나서 공유데이터가 온전하게 
  관리되지 못하는 문제가 발생할 수 있다.
  이 경우 OS가 개입해서 문제가 발생하지 않도록
  조정하는 기법을 동기화 처리하고 한다
  */
  public synchronized void login() {}
  
  
}//class end

public class Test02_throws {
  public static void main(String[] args) {
    //throws문
    //메소드 호출시 예외처리를 한꺼번에 모아서 처리    

    try{
      Test test=new Test();
      test.view();
      test.disp();
    }catch(Exception e){
        System.out.println(e);
    }//try end
    
    
    
    
  }//main() end
}//class end
