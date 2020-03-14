package oop1218;

//User Interface(디자인 관련된 클래스)
import java.awt.*;  
import javax.swing.*;

//자바 기본 팩키지
import java.lang.*;//<-생략할수 있다


public class Test01_wrapper {
  public static void main(String[] args) {
    //Wrapper Class (포장)
    //->기본자료형을 참조형화 해 놓은 클래스들
    //->대부분 java.lang에 선언되어 있음
    
    //기본형:boolean byte short int long float double char
    //참조형:Boolean Byte Short Integer Long Float Double Character
    /*
    boolean flag=true;
    Boolean b1=new Boolean(true);//Deprecated 절판
    //flag="true" 에러
    Boolean b2=new Boolean("true");
    
    System.out.println(flag);         //true
    System.out.println(b1.toString());//"true"
    System.out.println(b1);           //true
    */
//--------------------------------------------
    //Integer 클래스
    /*
    int i1=3;
    Integer i2=new Integer(5);
    Integer i3=new Integer("7");
    
    System.out.println(i1);              //3
    System.out.println(i2.doubleValue());//5.0
    System.out.println(i2.toString());   //"5"
    System.out.println(i3);              //7
    
    //빨간색 s -> static의 약자
    //파란색 F -> final의 약자
    
    //static이 있는 변수와 함수는
    //클래스명.변수
    //클래스명.함수() 로 접근해서 사용한다
    
    System.out.println(Integer.max(7, 9));
    System.out.println(Integer.min(2, 4));
    System.out.println(Integer.sum(5, 6));//11
    
    System.out.println(Integer.toBinaryString(10));//"1010" 2진수
    System.out.println(Integer.toOctalString(10)); //"12"   8진수
    System.out.println(Integer.toHexString(10));   //"a"    16진수
    
    //2진수 : 0 1
    //8진수 : 0 1 2 3 4 5 6
    //10진수: 0 1 2 3 4 5 6 7 8 9 
    //16진수: 0 1 2 3 4 5 6 7 8 9 a b c d e f
    // -> 색상표현시 많이 사용
    
    //문자열안에 있는 숫자기호를 정수형으로 변환
    //"3"->3
    System.out.println(Integer.parseInt("3"));//3
    
    //NumberFormatException 발생
    //System.out.println(Integer.parseInt("KOREA"));
    //System.out.println(Integer.parseInt("  5  "));
    
    String s1="";
    String s2=null; //null값->비어있는 값
    System.out.println(Integer.parseInt(s2));
    */
//---------------------------------------------------    
    /*
    long l1=3L;
    Long l2=new Long(5);
    Long l3=new Long("7");
    System.out.println(l1);
    System.out.println(l2.byteValue());
    System.out.println(l3);
    */
//-----------------------------------------    
    /*
    double d1=1.2;
    Double d2=new Double(3.4);
    Double d3=new Double("5.6");
    
    //문)위의 세개의 수를 더하시오
    int hap=(int)d1+d2.intValue()+d3.intValue();
    System.out.println(hap);
    */
//-----------------------------------------------
    /*
    char c1='K';                    //기본형
    Character c2=new Character('B');//참조형
    System.out.println(c1);
    System.out.println(c2);
    
    //메소드의 접두사의 의미
    //-> is~~~()  대부분 boolean으로 반환
    //-> get~~~() 대부분 리턴값이 존재
    //-> set~~~() 값을 세팅하려고 할때
    //-> to~~~()  to뒤의 자료형으로 반환    
    
    System.out.println(Character.isAlphabetic(65));
    System.out.println(Character.isWhitespace(' '));
    */
//--------------------------------------------------    
    //문1)대소문자를 서로 바꿔서 출력하시오
    String str="Gone With The Wind";

    
    
    //문2)주민번호 각 숫자의 누적의 합을 구하시오
    String jumin="8912304123654";
    
    
    
  }//main() end
}//class end
