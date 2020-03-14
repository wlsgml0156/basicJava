package oop1211;

public class Test04_switch {
  public static void main(String[] args) {
    //switch~case
    //->목록중에서 동일한 값을 찾아서 수행
    //break -> switch문 빠져나옴
    
    /*
    switch(10) {
    case 10 : System.out.println("SEOUL"); break;
    case 20 : System.out.println("JEJU");  break;
    case 30 : System.out.println("BUSAN"); break;
    }//switch end
    */
    
    /*
    //default : 목록에 없으면 무조건 수행
    //case값은 반드시 순차적이지 않아도 된다
    switch(50) {
    case 10 : System.out.println("SEOUL"); break;
    case 20 : System.out.println("JEJU");  break;
    case 30 : System.out.println("BUSAN"); break;
    default : System.out.println("etc..."); break;
    }//switch end
    */

    /*
    //break문이 없으면 계속해서 switch안에 수행된다
    switch(20) {
    case 10 : System.out.println("SEOUL"); break;
    case 20 : System.out.println("JEJU");  
    case 30 : System.out.println("BUSAN"); break;
    }//switch end
    */
//-------------------------------------------------
    //문)평균점수에 따라서 A, B, C, D, F학점을 출력하시오
    int kor=100, eng=100, mat=100;
    int aver=(kor+eng+mat)/3;
    
    switch(aver/10) {
    case 10: 
    case  9: System.out.println("A"); break;
    case  8: System.out.println("B"); break;
    case  7: System.out.println("C"); break;
    case  6: System.out.println("D"); break;
    default: System.out.println("F"); break;
    }//switch end
    
    
    
    
    
    
  }//main() end
}//class end
