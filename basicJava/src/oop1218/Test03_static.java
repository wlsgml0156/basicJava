package oop1218;

class Sawon{
  String sabun; //사원번호
  String name;  //이름
  int pay;      //급여
  
  //이클립스에서 기본생성자함수 자동코딩
  //->Source ->Generate Constructors from Superclass...
  public Sawon() {}
 
  //매개변수가 있는 생성자함수 자동코딩
  //->Source ->Generate Constructor using Fields...
  public Sawon(String sabun, String name, int pay) {
    this.sabun = sabun;
    this.name = name;
    this.pay = pay;
  }  
  
  //static 변수
  static String COMPANY="(주)솔데스크";
  static int SUDANG=10;
  static double TAX=0.03;
  
  //static 함수
  static void line() {
    System.out.println("--------------");
  }//line() end  
  
}//class end

public class Test03_static {
  public static void main(String[] args) {
    //static
    //->변수, 함수
    //->정적변수, 정적함수
    //->메모리 생성도1번, 소멸도1번 된다
    //->new연산자를 이용해서 별도의 객체생성 없이 사용가능하다
    
    /*
    //static은 클래스명으로 직접 접근가능하다
    //->클래스명.변수
    //->클래스명.함수()
    System.out.println(Sawon.COMPANY);
    System.out.println(Sawon.SUDANG);
    System.out.println(Sawon.TAX);
    Sawon.line();
    
    System.out.println(Math.E);
    System.out.println(Math.PI);
    System.out.println(Math.abs(-3));
    */
//------------------------------------------
    //1)static의 특징을 적용하지 않은 경우
    /*
    Sawon one=new Sawon("1001", "손흥민", 100);
    
    //나의 세금계산
    double myTax=one.pay*one.TAX;
    
    //나의 총지급액 : 급여-세금+수당
    int total=(int)(one.pay-myTax+one.SUDANG);
    
    System.out.println("회사:"+one.COMPANY);
    System.out.println("사번:"+one.sabun);
    System.out.println("이름:"+one.name);
    System.out.println("총지급액:"+total);
    one.line();
    */
//------------------------------------------    
    //2)static특징을 적용한 경우(강추)
    //->static변수와 함수는 이미 static 메모리에
    //->값이 상주해 있기 때문에 별도의 객체생성을
    //->하지 않고도 직접 접근할수 있다 
    /*
    Sawon one=new Sawon("1002", "박지성", 200);
    double myTax=one.pay*Sawon.TAX;
    int total=(int)(one.pay-myTax+Sawon.SUDANG);
    
    System.out.println("회사:"+Sawon.COMPANY);
    System.out.println("사번:"+one.sabun);
    System.out.println("이름:"+one.name);
    System.out.println("총지급액:"+total);
    Sawon.line();
    */
//------------------------------------------------    
    //static 변수의 연산 (continue)
    //static변수는 생성도1번, 소멸도 1번
    Sawon kim=new Sawon("1003", "개나리", 300);
    Sawon lee=new Sawon("1004", "진달래", 400);
    
    System.out.println(kim.SUDANG);//10
    System.out.println(lee.SUDANG);//10
    
    kim.SUDANG=kim.SUDANG+1;       //10+1
    System.out.println(kim.SUDANG);//11
    
    lee.SUDANG=lee.SUDANG+1;       //11+1
    System.out.println(lee.SUDANG);//12
    
    Sawon.SUDANG=Sawon.SUDANG+1;   //12+1
    
    System.out.println(Sawon.SUDANG);//추천
    System.out.println(kim.SUDANG);
    System.out.println(lee.SUDANG);
    
    
    

  }//main() end
}//class end
