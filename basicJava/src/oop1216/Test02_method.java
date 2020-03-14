package oop1216;

public class Test02_method {
  
  public static int test1(int a, int b) {
    int sum=a+b;
    //return;리턴값이 없다(void형)
    return sum; //리턴값은 1개값만 리턴한다
                //리턴값의 자료형을 void자리에 쓴다
  }//test1() end
  
  public static String test2(int a) {
    if(a%2==0) {
      return "짝수";
    }else {
      return "홀수";
    }
  }//test2() end
  
  public static boolean leap(int y) {
    if(y%4==0 && y%100!=0 || y%400==0) {
      return true;
    }else {
      return false;
    }      
  }//leap() end
  
  public static long fact(int f) {
    long res=1;
    for(int a=f; a>=1; a--) {
      res=res*a;
    }//for end
    
    return res;      
  }//fact() end
  
  public static void main(String[] args) {
    //3) 리턴값이 있는 경우
    int result=test1(3, 5);
    System.out.println(result);
    System.out.println(test1(2,4));
    
    
    String str=test2(7);
    System.out.println(str);
    System.out.println(test2(8));
    
    if(leap(2020)) {
      System.out.println("윤년");
    }else {
      System.out.println("평년");
    }//if end
    
    
    //팩토리얼값 구하는 함수
    long gop=fact(4);//4*3*2*1
    System.out.println(gop);
    

  }//main() end
}//class end
