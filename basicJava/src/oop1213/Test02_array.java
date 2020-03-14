package oop1213;

public class Test02_array {
  public static void main(String[] args) {
    //2차원배열
    //->행과 열로 구성
    
    /*
    //2차원 배열 선언
    //2행 3열
    //4byte*6개->24byte 메모리 할당
    int[][] kor=new int[2][3];
    
    kor[0][0]=10;
    kor[0][1]=20;
    kor[0][2]=30;
    
    kor[1][0]=40;
    kor[1][1]=50;
    kor[1][2]=60;
    
    System.out.println(kor[0][0]);
    System.out.println(kor[0][1]);
    System.out.println(kor[0][2]);
    
    System.out.println(kor[1][0]);
    System.out.println(kor[1][1]);
    System.out.println(kor[1][2]);
    
    //kor배열의 행의 갯수
    System.out.println(kor.length);    //2
    //kor[0]행의 열의 갯수
    System.out.println(kor[0].length); //3
    //kor[1]행의 열의 갯수
    System.out.println(kor[1].length); //3
    */
//----------------------------------------
    /*
    int[][] kor= { 
                   {10,20,30},
                   {40,50,60}
                 };
    
    for(int i=0; i<=1; i++) {
        for(int j=0; j<=2; j++) {
            System.out.println(kor[i][j]);
        }
    }//for end
    
    for(int i=0; i<kor.length; i++) {
        for(int j=0; j<kor[i].length; j++) {
            System.out.println(kor[i][j]);
        }
    }//for end
    */
//-------------------------------------------
    //2차원 배열에서 각행의 열의 갯수는 달라도 된다
    int[][] kor= {
                   {10, 20},
                   {30, 40, 50, 60},
                   {70, 80, 90}
                 };
    
    int row=kor.length; //3
    
    for(int i=0; i<row; i++) {
        int col=kor[i].length;
        for(int j=0; j<col; j++) {
          System.out.println(kor[i][j]);
        }
    }//for end
    
    
    
    
    
    
  }//main() end
}//class end
