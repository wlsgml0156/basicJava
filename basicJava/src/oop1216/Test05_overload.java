package oop1216;

public class Test05_overload {

  public static void hap(int a) {
    System.out.println(a);
  }//end
  
  public static void hap(int a, int b) {
    System.out.println(a+b);
  }//end
  
  public static void hap(double a) {
    System.out.println(a);
  }//end
  
  public static void hap(double a, double b) {
    System.out.println(a+b);
  }//end
  
  /* 에러
     public static int hap(int a) {}
     함수의 리턴형은 오버로딩의 대상이 아니다
  */
  
  public static void main(String[] args) {
    //Method Overloading 함수 중복 정의
    //->함수명을 중복해서 사용할 수 있다
    //메소드 오버로딩의 전제조건
    //->매개변수의 자료형이 달라야 한다
    //->매개변수의 갯수가 달라야 한다
    
    hap(2);
    hap(3, 5);
    hap(5.6);
    hap(7.8, 9.4);
    
    
    //절대값 구하기
    System.out.println(Math.abs(-3));  //int형
    System.out.println(Math.abs(4L));  //long형
    System.out.println(Math.abs(5.6f));//float형
    System.out.println(Math.abs(7.8)); //double형  
    
    
    

  }//main() end
}//class end
