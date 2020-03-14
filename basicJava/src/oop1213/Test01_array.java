package oop1213;

public class Test01_array {
  public static void main(String[] args) {
    //Array 배열
    //->하나의 변수에 2개이상의
    //->동일한 자료형의 값을 저장할 수 있는 공간
    //->요소 element
    //->순서, 색인, index
    //->1차원 배열 : 열로 구성
    //->2차원 배열 : 행과 열로 구성
    //->3차원 배열 : 자바에는 없는 개념
    //->열 : column, 칸
    //->행 : row, 줄
    //->new연산자로 메모리 할당(확보)후 사용한다
    
    /*
    //배열 선언
    //4byte * 3개 = 12byte 메모리 할당
    int[] kor=new int[3];
    kor[0]=50; //배열의 순서(index)는 0부터 시작한다
    kor[1]=40; //배열의 순서는 1씩 증가한다 
    kor[2]=65;
    System.out.println(kor[0]);
    System.out.println(kor[1]);
    System.out.println(kor[2]);
    
    //int a=5;
    //a. 에러
    
    //kor배열요소의 갯수
    System.out.println(kor.length);//3
    */
//-----------------------------------------
    /*
    //메모리할당과 초기값대입
    int[] kor= {50, 45, 60};
    int size=kor.length; //3
    for(int i=0; i<size; i++) {
        System.out.println(kor[i]);
    }//for end
    
    //ArrayIndexOutOfBoundsException발생
    //kor의 3번째 요소는 없음
    //System.out.println(kor[3]);
    */
//-----------------------------------------    
    double[] aver= {1.2, 3.4, 5.6};
    for(int i=0; i<aver.length; i++){
      System.out.println(aver[i]);
    }//for end
//-----------------------------------------    
    char[] ch = {'H','E','L','L','O'};
    for(int i=0; i<ch.length; i++){
        System.out.println(ch[i]);
    }//for end    
//-----------------------------------------    
    String[] name={"진달래","개나리","무궁화"};
    for(int i=0; i<name.length; i++){
        System.out.println(name[i]);
    }//for end
    

  }//main() end
}//class end
