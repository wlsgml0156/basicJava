package oop1212;

public class Test02_continue {
  public static void main(String[] args) {
    //break    반복문을 빠져나옴
    //continue 반복문을 계속 실행

    for(int a=1; a<10; a++){
      if(a==5){
          break;
      }
      System.out.print(a);
    }//for end
    
    System.out.println(); //줄바꿈
    
    for(int a=1; a<10; a++){
      if(a==5){
          continue;
      }
      System.out.print(a);
    }//for end
    
    
  }//main() end
}//class end
