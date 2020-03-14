package oop1217;

public class Test01_Math {
  public static void main(String[] args) {
    //Math 수학 관련 클래스
    
    /*
    //절대값
    System.out.println(Math.abs(-3));   //3
    //소수점 올림
    System.out.println(Math.ceil(1.3)); //2.0
    //소수점 버림
    System.out.println(Math.floor(2.7));//2.0
    //소수점 반올림
    System.out.println(Math.round(3.8));//4
    
    //큰값
    System.out.println(Math.max(3, 5));//5
    System.out.println(Math.max(4, 4));//4
    System.out.println(Math.max(7, Math.max(8, 9)));
    */
//----------------------------------------------------    
    //random 무작위
    //난수 : random값 
    //->시스템이 발생시킨 값
    //->발생범위 : 0.0 <= r < 1.0
    
    //System.out.println(Math.random());   
    //System.out.println(Math.random()*2);
    //System.out.println(Math.random()*4);
    /*
    //정수값만 가져오기
    //0 1 2 3
    System.out.println((int)(Math.random()*4));
    //0 1 2 3 4
    System.out.println((int)(Math.random()*5));
    //0 1 2 3 4 5
    System.out.println((int)(Math.random()*6));
    //0 ~ 44
    System.out.println((int)(Math.random()*45));
    */
//----------------------------------------------    
    //문)주사위 수의 범위 : 1~6
    //System.out.println((int)(Math.random()*6)+1);
    
    
    //문)로또번호 범위 : 1~45
    System.out.println((int)(Math.random()*45)+1);
    
    
    
    
    
    

  }//main() end
}//class end
