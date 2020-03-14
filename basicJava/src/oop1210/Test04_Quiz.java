package oop1210;

public class Test04_Quiz {
  public static void main(String[] args) {
    // 연산자 연습
    //문1) 지폐의 갯수를 구하시오
    int money=54630;
    /* 출력결과
           만원 5 장
           천원 4 장
           백원 6 장
           십원 3 장
    */
    /*
    int m=money/10000; //5
    System.out.println("만원" + m + "장");
    
    money=money%10000;//4630
    int c=money/1000; //4
    System.out.println("천원" + c + "장");
    
    money=money%1000; //630
    int b=money/100;  //6
    System.out.println("백원" + b + "장");
    
    money=money%100;
    int s=money/10;
    System.out.println("십원" + s + "장"); 
    */
//--------------------------------------------    
    
    //문2) 임의의 정수값이 짝수(2의배수)인지 확인하시오
    /*
    int a=4;
    System.out.println(a%2==0);
                    // 4%2
                    // 0  ==0
                    // true
    
    //문3) 임의의 정수값이 3의 배수인지 확인하시오
    System.out.println(a%3==0);
                    // 4%3
                    // 1  ==0
    
    //문4) 임의의 정수값이 4의 배수인지 확인하시오
    System.out.println(a%4==0);
                    // 4%4
                    // 0  ==0
    */
//--------------------------------------------
    /*
    //문5)임의의 정수값이 2의 배수이면서 5의 배수인지 확인하시오
    int b=5;
    System.out.println((b%2==0)&&(b%5==0));
                    //  5%2       5%5
                    //  1  ==0    0  ==0
                    //  false     true
                    //  false
    
    //문6)임의의 문자가 'M' 또는 'm'인지 확인하시오
    char ch='M';
    System.out.println((ch=='M') || (ch=='m'));
                    // 'M'=='M'     'M'=='m'
                    // true         false
                    // true
    */
//-----------------------------------------------  
    /*
    //문7)국어점수가 80~89사이인지 확인하시오
    int kor=85;
    System.out.println(kor>=80 && kor<=89);
                    // 85 >=80    85<=89
                    // true       true
                    // true
    
    //문8)임의의 문자가 대문자('A'~'Z')인지 확인하시오
    char ch='R';
    System.out.println(ch>='A' && ch<='Z');
                    //'R'>='A'    'R'<='Z'
                    //true        true
                    //true
    */
//-------------------------------------------------    
    //문9)해당년도가 윤년인지 확인하시오
    int y=2020;
    System.out.println(y%4==0);
    
    
  }//main() end
}//class end
