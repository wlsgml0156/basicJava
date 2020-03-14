package oop1223;

public class Test01_exception {
  public static void main(String[] args) {
    //Exception 예외처리
    //->자바 클래스 실행(run)시 발생하는 에러
    //->try~catch
    //->finally
    //->throws
    
    //1)Exception 처리하지 않은 경우 
    /*
    System.out.println(1);
    //ArithmeticException 발생
    System.out.println(2/0);
    System.out.println("END");
    */
//--------------------------------------
    //2)Exception 처리한 경우
    /*
    try {
      //exception발생하더라도 정상적으로
      //프로그램은 종료시킬수 있다
      //예외가 발생할 예상이 되는 코드를 작성
      System.out.println(1);
      //ArithmeticException 발생
      System.out.println(2/0);
      System.out.println(3);
    } catch(ArithmeticException e) {
        //예외가 발생되면 처리할 코드를 작성
        System.out.println(e);
    }//try end
    
    System.out.println("END");
    */
//--------------------------------------------    
    //3)
    /*
    try {
      System.out.println(1);
      int[] num=new int[3];
      num[5]=7;
      System.out.println(2);
    }catch (ArrayIndexOutOfBoundsException e) {
      System.out.println(e);
    }//try end
    
    System.out.println("END");
    */
//-------------------------------------------    
    //4)
    /*
    try {
      System.out.println(1);
      int num=Integer.parseInt("soldesk");
      System.out.println(2);      
    }catch (NumberFormatException e) {
      System.out.println(e);
    }//try end
    
    System.out.println("END");
    */
//--------------------------------------------
    //5)
    /*
    try {
      System.out.println(1);
      Integer inte=null;
      System.out.println(3/inte);      
      System.out.println(2);
    }catch (NullPointerException e) {
      System.out.println(e);
    }//try end
    
    System.out.println("END");
    */
//-----------------------------------------    
    //6) 다중 catch문
    /*
    try {
      int a=3/0;
      int b=Integer.parseInt("soldesk");
      int[] num=new int[3];
      num[4]=2;
    }catch(ArithmeticException e) {
      System.out.println(e);
    }catch(NumberFormatException e) {
      System.out.println(e);
    }catch(ArrayIndexOutOfBoundsException e) {
      System.out.println(e);
    }catch(NullPointerException e) {
      System.out.println(e);
    }//try end
    
    System.out.println("END");
    */
//--------------------------------------------    
    //7)
    /*
    try {
      int a=3/0;
      int b=Integer.parseInt("soldesk");
      int[] num=new int[3];
      num[4]=2;
    }catch (Exception e) {
      //Exception : 모든 Exception클래스의 조상
      //다형성
      System.out.println(e);
    }//try end
    
    System.out.println("END");
    */
//------------------------------------------------
    //8) finally문
    //->예외가 발생하거나, 발생하지 않거나
    //->무조건 실행
    try{
      System.out.println("OPEN");
      System.out.println(1);
      //System.out.println(2/0);
      System.out.println(3);
    }catch(Exception e){
        System.out.println(e);
    }finally{
        System.out.println("CLOSE");
    }//try end
    
    System.out.println("END");
    
    
    
    
    
    
  }//main() end
}//class end
