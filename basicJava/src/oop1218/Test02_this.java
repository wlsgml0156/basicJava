package oop1218;

class Sungjuk{
  //멤버변수 field
  private String name;
  private int kor, eng, mat;
  private int aver;
  
  //생성자함수 constructor
  public Sungjuk() { //default constructor
    //생성자함수가 생성자함수를 호출할 수 있다
    //Sungjuk("손흥민"); 에러
    this("손흥민");
  }
  
  public Sungjuk(String name) {
    this.name=name;//멤버변수와 지역변수의 구분
  }
  
  public Sungjuk(int kor,int eng,int mat) {
    this("박지성");
    this.kor=kor;
    this.eng=eng;
    this.mat=mat;
    //this("박지성"); 에러.
    //->생성자함수를 호출하는 경우 첫줄에서 호출한다
  }
  
  public Sungjuk(int aver) {
    disp();//생성자함수에서 일반 메소드 호출가능
  }
  
  public void disp() {
    //this(85); 에러
    //->일반메소드는 생성자함수를 호출 불가능
  }
  
}//class end


public class Test02_this {
  public static void main(String[] args) {
    //this()
    //->생성자함수가 생성자함수 호출할때   
    

  }//main() end
}//class end
