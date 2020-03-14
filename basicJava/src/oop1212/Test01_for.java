package oop1212; //<-현재 클래스의 저장 위치
                 //<-1번만 선언한다

public class Test01_for {
  public static void main(String[] args) {
    //반복문
    //for, while, do~while
    //break, continue
    //무한LOOP : 끝이 없이 반복
    
    //1)for
    /*
        for(시작값;종료값;증감)  {
                 반복 하고자하는 내용
        }
    
        for(;;){} -> 무한LOOP
    */
    /*
    for(int a=1; a<=3; a=a+1) {//a+=1
                               //a++
                               //++a
      System.out.println("JAVA");
    }//for end
    */
    
    //유효범위(SCOPE)
    //->변수(variable), 객체(object)가 사용되는 범위
    //->변수 : 지역변수(local variable)
    //        전역변수(global variable)
    
    //System.out.println(a);에러
    //->for문안에 선언된 변수는 for문안에서만 유효하다
    
    /*
    int b;
    for(b=1; b<=5; b=b+2) {//b+=2
      System.out.println("JEJU");
    }//for end
    
    System.out.println(b);
    */
    
    //감소에 따른 반복
    /*
    for(int c=3; c>=1; c=c-1) {//c-=1
                               //c--
                               //--c
      System.out.println("KOREA");
    }//for end
    */
//------------------------------------------
    //구구단 출력
    /*
       4*1=4
       4*2=8
         ...
       4*9=36
    */
    /*
    int dan=4;
    for(int a=1; a<=9; a=a+1) {
      System.out.println(dan+"*"+a+"="+(dan*a));
    }//for end
    */
//---------------------------------------------
    //알파벳(대문자) 출력
    /*
    for(char ch='A'; ch<='Z'; ch++) {
      System.out.print(ch);
    }//for end
    */
//-------------------------------------------
    /*
    //문1) 1~10중에서 3의 배수만 출력하기
    for(int a=1; a<=10; a=a+1) {
        if(a%3==0) {
          System.out.println(a);
        }
    }//for end  
    
    //문2) 서기1년~서기2019년중에서 윤년만 출력하기   
    for(int y=1; y<=2019; y=y+1) {
        if(y%4==0 && y%100!=0 || y%400==0) {
          System.out.println(y);
        }
    }//for end
    */
//-----------------------------------------------
    //갯수
    //누적
    /*
    //문3) 1~5중에서 홀수의 갯수를 구하시오
    int count=0;
    for(int a=1; a<=5; a=a+1) {
      if(a%2==1) {
        count=count+1;
      }
    }//for end
    
    System.out.println(count);       
    
    //문4) 1~3까지 누적의 합을 구하시오
    int hap=0;
    for(int a=1; a<=3; a=a+1) {
        hap=hap+a; //hap+=a
    }//for end
    
    System.out.println(hap);
    */
//----------------------------------------------    
    //문5) 서기1년~서기2019년중에서 윤년의 갯수를 구하시오
    int leap=0;
    for(int y=1; y<=2019; y=y+1) {
        if(y%4==0 && y%100!=0 || y%400==0) {
           leap=leap+1;
        }
    }//for end
    System.out.println(leap);//489
    
    //문6) 4팩토리얼값 구하시오
    //    -> 4*3*2*1
    int gop=1;
    for(int f=4; f>=1; f=f-1) {
        gop=gop*f;
    }//for end
    
    System.out.println(gop);
    
    
    
    
    
    
    
  }//main() end
}//class end
