package oop1211;

public class Test01_operator {
  public static void main(String[] args) {
    //대입연산자 =
    //int    : 정수값의 기본형
    //double : 실수값의 기본형
    /*
    int a=3;
    a=a+1;
    a+=1;
    System.out.println(a);//5
    
    int b=5;
    b=b-1;
    b-=1;
    System.out.println(b);//3
    
    int c=7;
    c=c*2;
    c*=2;
    System.out.println(c);
    
    int d=9;
    d=d/4;   //d=9/4
    d/=4;    //d=2/4
    System.out.println(d);
    
    int e=5;
    e=e%2; //나머지 연산자
    e%=2;
    System.out.println(e);
    */
//---------------------------------    
    // 정수형 / 정수형 -> 정수형
    // 정수형 / 실수형 -> 실수형
    // 실수형 / 정수형 -> 실수형
    // 실수형 / 실수형 -> 실수형
    /*
    System.out.println(3/5);    //0
    System.out.println(3/5.0);  //0.6
    System.out.println(3.0/5);  //0.6
    System.out.println(3.0/5.0);//0.6
    */
//-----------------------------------    
    /*
    //1증가연산자    
    int a=3;
    a=a+1;
    a+=1;
    a++; //1증가 연산자
    ++a; //1증가 연산자
    System.out.println(a);
    
    //1감소연산자
    int b=5;
    b=b-1;
    b-=1;
    b--; //1감소 연산자
    --b;
    System.out.println(b);
    */
    
    //1증감연산자는
    //계산식, 대입연산자와 함께 사용되는 경우 주의!!
    int a=10, b=20;
    int c=a++;      //나중에 a변수값 1증가
                    //int c=a
                    //a=a+1
    int d=--b;      //먼저 b변수값 1감소
                    //b=b-1
                    //int d=b;
    System.out.println(a);//11
    System.out.println(b);//19
    System.out.println(c);//10
    System.out.println(d);//19
    
    
    
    

  }//main() end
}//class end
