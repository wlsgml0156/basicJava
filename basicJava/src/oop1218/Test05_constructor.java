package oop1218;

class School{
  private String name;
  private int kor, eng, mat;
  private int aver;
  
  //생성자함수를 오버로딩하면
  //기본생성자함수는 자동으로 생성되지 않는다
  public School(String name) {
    this.name=name;
  }
  
  //기본 생성자 함수는 하는 일이 없어도
  //->상속시 에러 발생하는 경우가 있으니
  //->수동적으로 무조건 선언을 적극 권장!!
  public School() {}
  
}//class end

public class Test05_constructor {
  public static void main(String[] args) {
    //생성자함수 생성시 주의사항
        
    

  }//main() end
}//class end
