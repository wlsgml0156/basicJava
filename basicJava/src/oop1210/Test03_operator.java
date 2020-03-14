package oop1210;

public class Test03_operator {
  public static void main(String[] args) {
    // 연산자 Operator
    //->이식성이 풍부하다
    //->산술, 비교(관계), 논리연산자
    //->최우선연산자 ()
    //->후순위연산자 =
    
    //1)산술연산자
    /*
    System.out.println(5+3);
    System.out.println(5-3);
    System.out.println(5*3);
    System.out.println(5/3);//1몫연산자
    System.out.println(5%3);//2나머지연산자
    
    System.out.println(3/5);//0
    System.out.println(3%5);//3
    */
//-------------------------------------    
    //2)비교(관계)연산자
    //->결과값이 boolean형으로 반환된다
    /*
    System.out.println(5<3);
    System.out.println(5>3);
    System.out.println(3<=3);
    System.out.println(5>=3);
    System.out.println(5==3);//같다
    System.out.println(5!=3);//같지않다
    */
//------------------------------------    
    //3)논리연산자
    //->조건이 1개이상인경우 전체적으로 판단한다
    //->결과값이 boolean형으로 반환된다
    //->논리곱    AND 그리고  ~이면서 : &&
    //->논리합    OR  또는     ~이거나 : ||
    //->논리부정 NOT 부정                 : !
    
    System.out.println((2<4) && (3<5));
                    // true      true 
                    // true
    
    System.out.println((3<1) || (6<8));
                    // false     true
                    // true
    
    boolean flag=true;
    System.out.println(!flag);
    
    
    
    
  }//main() end
}//class end
