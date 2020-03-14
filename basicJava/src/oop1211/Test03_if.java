package oop1211;

public class Test03_if {
  public static void main(String[] args) {
    //제어문
    //->프로그램의 흐름을 제어한다
    //->조건문 : if, switch~case
    //->반복문 : for, while, do~while
    //->break, continue
/*    
   if(조건) {조건이 true이면 수행}
   
   if(조건) {조건이 true이면 수행}
   else {조건이 false이면 수행}
   
   if(조건1) {조건1이 true이면 수행}
   else if(조건2) {조건2이 true이면 수행}
   else if(조건3) {조건3이 true이면 수행}
   else {조건이 false이면 수행}   
*/    
    String name="무궁화";
    int kor=35, eng=100, mat=100;
    
    //평균구하기
    int aver=(kor+eng+mat)/3;
    
    //출력
    System.out.println("이름:" + name);
    System.out.println("국어:" + kor);
    System.out.println("영어:" + eng);
    System.out.println("수학:" + mat);
    System.out.println("평균:" + aver);
    
    //문)평균이 95점이상 "장학생" 출력하시오
    if(aver>=95) { //97>=95
      System.out.println("장학생");
    }//if end   
    
    //문)국어점수가 70점이상 "합격"
    //   아니면 "불합격"
    if(kor>=70) {
      System.out.println("국어:합격");
    }else {
      System.out.println("국어:불합격");
    }//if end
    
    
    //문)수학점수가 90이상이면 "A"
    //             80이상이면 "B"
    //             70이상이면 "C"
    //             60이상이면 "D"
    //             나머지 "F"
    if(mat>=90) {
      System.out.println("수학:A");
    }else if(mat>=80) {
      System.out.println("수학:B");
    }else if(mat>=70) {
      System.out.println("수학:C");
    }else if(mat>=60) {
      System.out.println("수학:D");
    }else {
      System.out.println("수학:F");
    }//if end
    
    //문)과락
    //   평균이 70점이상이면 "합격"
    //   (단, 국영수 세과목중에서 한과목이라도
    //        40점미만이면 "재시험")
    //   평균이 70미만이면 무조건 "불합격"
    if(aver>=70) {
        //1)OR조건
        if(kor<40 || eng<40 || mat<40) {
            System.out.println("결과:재시험");
        }else {
            System.out.println("결과:합격");
        }      
        
        //2)AND조건
        if(kor>=40 && eng>=40 && mat>=40) {
            System.out.println("결과:합격");
        }else {
            System.out.println("결과:재시험");
        }
        
    }else {
        System.out.println("결과:불합격");
    }//if end
    
    
    
    
    
    
    
    
  }//main() end
}//class end
