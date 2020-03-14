package oop1223;

import java.io.*;

public class Test08_input {
  public static void main(String[] args) {
    //파일 내용 읽기
    FileReader fr=null;
    BufferedReader br=null;
    
    try {
      
      String fileName="D:/java1209/workspace/basicJava/src/oop1210/Welcome.java";
      
      //1)파일 가져오기
      fr=new FileReader(fileName);
      
      //2)파일 내용 읽기
      br=new BufferedReader(fr); 
      
      int num=0; //행번호
      while(true) {
        //엔터(\n)를 기준으로 가져오기
        String line=br.readLine();
        if(line==null) {
          break;//반복문 탈출
        }
        
        //System.out.println(line);
        System.out.printf("%3d %s\n", ++num, line);
        
        //20행마다 밑줄긋기
        if(num%20==0) {
          System.out.println("---------------------");
        }
        
      }//while end
      
      
      
      
    }catch (Exception e) {
        System.out.println("파일읽기실패:"+e);
    }finally {//자원 반납시 순서 주의
      try {
        if(br!=null) {br.close();}
      }catch (Exception e) {}
      
      try {
          if(fr!=null) {fr.close();}
      }catch (Exception e) {} 
    }//try end
    
    
    
    
    

  }//main() end
}//class end
