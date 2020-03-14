package oop1219;

public class Test07_jumin {
  public static void main(String[] args) {
    //문제)주민번호 유효성 검사후
    //     생년월일, 성별, 나이, 띠 출력하기
    
    Jumin id= new Jumin("8912301234567");
    
    if(id.validate()) {
      System.out.println("주민번호 맞아요");
      id.disp();
    }else {
      System.out.println("잘못된 주민번호 입니다"); 
    }//if end
    
    
    
    
    
  }//main() end
}//class end
