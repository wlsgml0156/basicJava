package oop1224;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Test04_sungjuk {
  public static void main(String[] args) {
    //성적 프로그램
    //성적 입력 자료를 가져와서(sungjuk.txt)
    //성적 결과 파일 완성하기  (result.txt)
    try {
      String inName ="d:/java1209/workspace/sungjuk.txt";
      String outName="d:/java1209/workspace/result.txt";
      
      //1)단계 : 데이터 저장 변수 선언
      String[] name=new String[5];
      int[] kor =new int[5];
      int[] eng =new int[5];
      int[] mat =new int[5];
      int[] aver=new int[5];
      int[] rank={1,1,1,1,1};
      int size=5;
      int idx=0;
      
      
      
      
      //2)단계
      //-> sungjuk.txt에서 한줄씩 가져와서
      //-> ,를 기준으로 문자열 분리한 후 
      //-> 1)단계에 선언된 변수에 저장하기
      //-> sprit() 또는 StringTokenizer활용      
      FileReader in=new FileReader(inName); //sungjuk.txt가져오기
      BufferedReader br=new BufferedReader(in);
      String line=null;
      while(true){ //각각의 배열에 입력값 대입
        line=br.readLine();  //무궁화,90,95,60
        if(line==null) break;
        
        StringTokenizer st = new StringTokenizer(line,",");
        while (st.hasMoreTokens()) {
          name[idx]=st.nextToken(); //name[0]="무궁화"
          kor[idx]=Integer.parseInt(st.nextToken()); //kor[0]=90
          eng[idx]=Integer.parseInt(st.nextToken()); //eng[0]=95
          mat[idx]=Integer.parseInt(st.nextToken()); //mat[0]=60
        } //배열의 입력 자료 완료
        
        idx++;

      }//while end
      
      
      

      //3)단계
      //-> 2)단계에서 완성한 변수를 이용해서
      //-> 평균, 등수구하기
      
      for(idx=0; idx<size; idx++){
        aver[idx]=(kor[idx]+eng[idx]+mat[idx])/3;
      }//for end
      
      //등수구하기(평균을 기준으로)
      for(int a=0; a<size; a++){
        for(int b=0; b<size; b++){
          if(aver[a]<aver[b]) rank[a]=rank[a]+1; //rank[a]++
        }
      }//for end 
      
      
      
      
      //4)단계
      //-> result.txt 출력하기
      FileWriter  fw =new FileWriter(outName);
      PrintWriter out=new PrintWriter(fw, false);  
      
      //제목출력하기
      out.println("성/적/결/과");
      out.println("---------------------------------");
      out.println("이름 국어 영어 수학 평균 등수 결과");
      out.println("---------------------------------");
      
      for(idx=0; idx<size; idx++){
        out.printf("%-6s %5d %5d %5d %5d %3d ",name[idx],kor[idx],eng[idx],mat[idx],aver[idx],rank[idx]);
        
        if(aver[idx]>=70){
          if(kor[idx]<40||eng[idx]<40||mat[idx]<40)
            out.printf("%-5s","재시험"); // 5칸내에서 왼쪽정렬
          else
            out.printf("%-5s","합격");
        }
        else {
          out.printf("%-5s","불합격");
        }
        
        for(int star=0; star<aver[idx]/10; star++){
          out.print("*");
        }
        
        if(aver[idx]>=95) out.printf("%-12s","장학생"); // 10칸내에서 오른쪽정렬
        
        out.println(); // 줄바꿈
        
      }//for end
      
      
      
      
      // 자원반납
      br.close();  in.close();
      out.close(); fw.close();
      System.out.println("성적프로그램완성OK!!");    
           
      
    }catch (Exception e) {
      System.out.println("실패:"+e);
    }//try end

  }//main() end
}//class end
