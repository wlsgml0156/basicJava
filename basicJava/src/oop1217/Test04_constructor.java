package oop1217;

class School{
  //멤버변수 field
  private String name;
  private int kor, eng, mat;
  private int aver;
  
  //생성자 함수 Constructor
  //->클래스명과 동일한 함수
  //->생성자함수는 리턴형이 올수 없다
  //public void School() {}
  public School() { //기본생성자함수
                    //default constructor
                    //자동생성된다
    System.out.println("School()...");    
  }
  
  //생성자함수도 오버로딩(중복정의)이 가능하다
  public School(String n) {
    name=n;
  }
  
  public School(int k, int e, int m) {
    kor=k;
    eng=e;
    mat=m;
  }
  
  public School(String n, int k, int e, int m) { 
    name=n;
    kor=k;
    eng=e;
    mat=m;
  }
  
  //멤버함수 method
  public void calc() {
    aver=(kor+eng+mat)/3;
  }//calc() end
  
  public void disp() {
    System.out.println(name);
    System.out.println(kor);
    System.out.println(eng);
    System.out.println(mat);
    System.out.println(aver);
  }//disp() end
  
}//class end



public class Test04_constructor {

  public static void main(String[] args) {
    //생성자 함수 Constructor
    //->클래스명과 동일한 함수
    //->new연산자와 함께 메모리할당시 사용한다
    //->오버로딩이 가능하다
    
    //소멸자 함수 Destructor
    //->자바에는 없음!!
    
    //가비지 콜렉팅(Garbage Collecting)
    //->JVM이 자동으로 메모리 회수를 함.
    //->자바가상머신(JVM)은 가비지 콜렉터라는 
    //->인스턴스 자동 해제(메모리 반환) 시스템을
    //->가동시켜 필요한 메모리를 관리한다

    //new School(); //객체 Object
    //new School();
    
    //객체지향프로그램(Object Oriented Program) 특징
    //->은폐, 캡슐화 할 수 있다
    
    //one -> 참조변수(reference변수)
    School one=new School(); //#50번지
    one.calc();
    one.disp();
    
    //생성자함수는 메모리할당과 동시에
    //초기값을 전달할 수 있다
    School two=new School("김연아");//#60번지
    two.calc();
    two.disp();
    
    
    School three=new School(100, 85, 90);//#70번지
    three.calc();
    three.disp();
    
    
    School four=new School("무궁화", 20, 30, 45);
    four.calc();
    four.disp();
    
    
    
    
    
  }//main() end
}//class end
