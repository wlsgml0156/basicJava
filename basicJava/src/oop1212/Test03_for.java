package oop1212;

public class Test03_for {
  public static void main(String[] args) {
    //이중 반복문
    /*
    for(int a=1; a<=2; a++) {
        System.out.println("KOREA");
        for(int b=1; b<=3; b++) {
            System.out.println("SEOUL");        
        }
    }//for end
    */
    
    
    //2단~9단 출력하기
    /*
    for(int a=2; a<=9; a++) {
        System.out.println(a+"단");
        for(int b=1; b<=9; b++) {
            System.out.println(a+"*"+b+"="+(a*b));
        }
    }//for end
    */
    
    //□ 사각형 만들기
    //->등수 구할때 회전수 참조!!
    for(int a=1; a<=4; a++) {
        for(int b=1; b<=4; b++) {
            System.out.print("#");
        }
        System.out.println();
    }//for end
    
    //회전수 증가
    for(int a=1; a<=4; a++) {
      for(int b=1; b<=a; b++) {
          System.out.print("@");
      }
      System.out.println();
    }//for end
     
    
    //회전수 감소
    for(int a=4; a>=1; a--) {
      for(int b=1; b<=a; b++) {
          System.out.print("$");
      }
      System.out.println();
    }//for end        
    

  }//main() end
}//class end
