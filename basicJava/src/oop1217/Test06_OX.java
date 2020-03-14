package oop1217;

class Jumsu{
  private int no;                 //번호
  private String name;            //이름
  private int[] answer=new int[5];//답안제출
  private char[] ox=new char[5];  //OX표시
  public int score;               //점수
  public int rank;                //등수
  
  public Jumsu() {}
  public Jumsu(int no, String name, int a0, int a1, int a2, int a3, int a4) {
    this.no=no;
    this.name=name;
    this.answer[0]=a0;
    this.answer[1]=a1;
    this.answer[2]=a2;
    this.answer[3]=a3;
    this.answer[4]=a4;
    this.rank=1;
  } 
  
  public void compute() {
    //정답과 제출한 answer답안을 비교해서
    //OX구하고, 맞은 갯수에 따라 점수구하기
    
    int[] dap= {1,1,1,1,1}; //정답
    
    for(int i=0; i<5; i++) {
        if(dap[i]==answer[i]) {
            ox[i]='O';
            score=score+20; //한문제당 20점씩
        }else {
            ox[i]='X';
        }//if end
    }//for end
    
  }//compute() end
  
  public void disp() { //출력하기
    System.out.print(no+" ");
    System.out.print(name+" ");
    System.out.print(ox[0]+" ");
    System.out.print(ox[1]+" ");
    System.out.print(ox[2]+" ");
    System.out.print(ox[3]+" ");
    System.out.print(ox[4]+" ");
    System.out.print(score+" ");
    System.out.print(rank+" ");
    System.out.println();    
  }//disp() end
  
  
}//class end

public class Test06_OX {
  public static void main(String[] args) {
    //[예제] 성적프로그램 OX 표시하기
    
    /*
    //한사람만 대상으로 성적구하기
    Jumsu student=new Jumsu(1, "홍길동", 1, 2, 1, 1, 1);
    student.compute();
    student.disp();
    */
//-----------------------------------------------
    //5명의 성적을 출력하시오
    Jumsu[] student={
        new Jumsu(1, "홍길동", 1,2,1,1,1),
        new Jumsu(2, "무궁화", 1,1,1,1,1),
        new Jumsu(3, "라일락", 3,2,4,2,1),
        new Jumsu(4, "진달래", 2,1,4,1,1),
        new Jumsu(5, "봉선화", 1,1,4,3,2)
    };
    
    int size=student.length;
    
    //1)OX, 점수계산하기
    for(int i=0; i<size; i++) {
        student[i].compute();
    }//for end
    
    
    //2)등수구하기(score를 기준으로)
    for(int i=0; i<size; i++) {
      for(int j=0; j<size; j++){
          if(student[i].score < student[j].score) {
              student[i].rank=student[i].rank+1;
          }//if end
      }
    }//for end
    
    
    //3)출력하기
    for(int i=0; i<size; i++) {
       student[i].disp();
    }//for end

  }//main() end
}//class end
