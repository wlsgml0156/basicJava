package oop1210;

public class Test05_conversion {
  public static void main(String[] args) {
    // 자료형 변환(Datatype Conversion)
    //1) 자동형 변환
    // byte < short < int < long
    // float < double
    // 정수형이 실수형을 따라 간다
    /*
    byte a=3;
    int b=a;
    System.out.println(a);
    System.out.println(b);
    
    long c=5;
    //int d=c; 에러. 큰자료형이 작은자료형 대입할수 없다
    
    float e=1.2f;
    double f=e; //자동형 변환
    */   
//----------------------------------------
    
    //2) 강제형 변환(cast 연산자)
    //->필요한 곳에 일시적으로 변환
    //->(자료형)값
    /*
    System.out.println((int)3.5); //3
    System.out.println((double)4);//4.0
    System.out.println(4.0);      //4.0
    System.out.println(4.);       //4.0
    System.out.println((int)2.6+(int)5.7);//7
    System.out.println((int)(2.6+5.7));   //8
    */
//---------------------------------------------
    //int형과 char형도 서로 형변환이 가능하다
    //ASCII문자, ASCII코드값
    System.out.println(65);
    System.out.println((char)65);//'A'
    System.out.println((char)66);//'B'
    System.out.println((char)67);//'C'
    
    System.out.println('a');
    System.out.println((int)'a');//97
    System.out.println((int)'b');//98
    System.out.println((int)'c');//99
    
    System.out.println((int)'+');
    System.out.println((int)' '); //공백 32
    System.out.println((int)'\r');//엔터 13
    
    System.out.println("#"+(char)('a'-'A')+"#");
                    //            (97-65)
                    //     (char) (32)
    
    
    

  }//main() end
}//class end
