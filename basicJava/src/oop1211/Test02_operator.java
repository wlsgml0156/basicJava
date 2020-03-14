package oop1211; //<-현재 클래스 있는 곳 위치
                 //한번만 선언 가능하다

public class Test02_operator {
  public static void main(String[] args) {
    /*
    int a=3;
    a=a*-1;                //이항연산자
    System.out.println(a);
    System.out.println(-a);//단항연산자
    */
    
    //삼항연산자
    //->형식)  (조건) ? 참 : 거짓
    //->조건값은 boolean형으로 반환한다
    
    //문)임의의 값이 양수, 음수인지 확인하시오
    /*
    int a=3;
    String result=(a>0) ? "양수" : "음수";
               //  3>0  ? "양수"
    System.out.println(result);
    
    result=(a<0) ? "음수" : "양수";
          //3<0             "양수"
    System.out.println(result);
    
    //문)짝수, 홀수인지 확인하시오
    result=(a%2==0) ? "짝수" : "홀수";
          //3%2
          //1  ==0  ?          "홀수"
    System.out.println(result);
    */
//----------------------------------------
    //문)세개의 수중에서 가장 큰값을 구하시오
    /*
    int x=3, y=7, z=5;
    int max=(x<y) ? y : x;
            //3<7 ? 7
    max=(max<z) ? z : max;
          //7<5 ?     7
    System.out.println(max);
    */
    
    //문)대소문자를 서로 바꿔서 출력하시오
    char ch='R';
    char alpha=(ch>='A' && ch<='Z') ? (char)(ch+32) : (char)(ch-32);
             //'R'>='A'   'R'<='Z'
             //true        true
             //true                   (char)(ch+32)
    System.out.println(alpha);
    
    //문)윤년, 평년을 출력하시오
    int y=2020;
    String leap=(y%4==0 && y%100!=0 || y%400==0) ? "윤년" : "평년";
    System.out.println(leap);   
    
  }//main() end
}//class end
