package oop1217;

class Score{
  //멤버변수 field
  private String name="손흥민";
  private int kor, eng, mat;
  private int aver;
  
  //생성자함수 constructor
  public Score() {} //default constructor
  public Score(String name, int kor, int eng, int mat) {
    this.name=name; //this.멤버변수=지역변수
    this.kor=kor;
    this.eng=eng;
    this.mat=mat;
    this.aver=(kor+eng+mat)/3;
  }
  
  //멤버함수 method
  public void disp() {
    //지역변수의 우선순위가 가장 높다
    String name="박지성";         //지역변수
    System.out.println(name);//박지성
    System.out.println(this.name);//멤버변수
    System.out.println(this.kor);
    System.out.println(this.eng);
    System.out.println(this.mat);
    System.out.println(this.aver);
  }//disp() end  
  
}//class end

public class Test05_this {
  public static void main(String[] args) {
    //this   : 자신의 클래스 멤버를 가리킴.
    //         일반지역변수와 멤버변수를 구분하기 위함
    
    //this() : 생성자 함수간의 호출

    /*
    Score one=new Score();
    one.disp();
    
    Score two=new Score("김연아", 90, 85, 100);
    two.disp();
    */
//----------------------------------------------
    /*
    Score one  =new Score("개나리", 10, 30, 50);
    Score two  =new Score("진달래", 20, 35, 55);
    Score three=new Score("라일락", 30, 60, 70);
    
    one.disp();
    two.disp();
    three.disp();
    */
    
    //객체 배열 
    Score[] sco= {
        new Score("개나리", 10, 30, 50),
        new Score("진달래", 20, 35, 55),
        new Score("라일락", 30, 60, 70)
    };
  
    int size=sco.length;
    
    sco[0].disp();
    sco[1].disp();
    sco[2].disp();
    
    for(int i=0; i<size; i++) {
      sco[i].disp();
    }//for end
    
    
    
    
    
  }//main() end
}//class end
