package oop1212;

public class Test04_while {
  public static void main(String[] args) {
    //1)while 
    //while(조건){조건이 true이면 수행}
    //while(true){} -> 무한LOOP
    
    /*
    int a=1;
    while(a<=3) {
      System.out.println("JAVA");
      a=a+1;
    }//while end
    */
    /*
    int a=1;
    while(true) { //무한LOOP
      System.out.println("KOREA");
      if(a==5) {
        break;    //반복문을 빠져나옴
      }//if end
      a=a+1;
    }//while end
    */
//-----------------------------------------   
    
    //2)do~while
    //  do{
    //      조건이 true이면 수행
    //  }while(조건);
    
    /*
    int a=1;
    do {
        System.out.println("JAVA");
        a=a+1;
    }while(a<=3);
    */
    
    //조건이 거짓이어도 무조건 1번은 수행된다
    /*
    int a=5;
    do {
        System.out.println("KOREA");
        a=a+1;
    }while(a<=3);
    */   
    
//----------------------------------------
    //문)x값이 10으로부터 x를 여러 번 뺀후
    //   결과가 음수가 되면 x를 몇번 뺐는가를 구하시오
    int x=3;
    int num=10;
    int count=0;
    
    while(true) {
        count=count+1;
        num=num-x;
        if(num<0) {
            break;
        }
    }//while end
    
    System.out.println(count);
    
    
    
    

  }//main() end
}//class end
