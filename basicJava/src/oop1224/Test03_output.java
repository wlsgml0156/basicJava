package oop1224;

import java.io.FileWriter;
import java.io.PrintWriter;

public class Test03_output {
  public static void main(String[] args) {
    //파일출력
    String fileName="d:/java1209/workspace/sungjuk.txt"; 
    //출력파일(sungjuk.txt)이
    //->없으면 파일은 생성된다(create)
    //->있으면 덮어쓰기(overwrite) 또는 추가(append)   
    
    FileWriter fw=null;
    PrintWriter out=null;
    
    try {
      //true  : append 된다
      //false : overwrite 된다
      fw=new FileWriter(fileName, false);
      
      //autoFlush : true
      //->버퍼클리어
      out=new PrintWriter(fw,true);
      out.println("무궁화,95,90,100");
      out.println("홍길동,100,100,100");
      out.println("라일락,90,95,35");
      out.println("개나리,85,70,75");
      out.println("진달래,35,40,60");
      
      System.out.println("sungjuk.txt데이터 파일 완성!!"); 
      
    }catch (Exception e) {
      System.out.println("실패:"+e);
    }finally {//자원반납(순서주의)
      try {
          if(out!=null) {out.close();}
      }catch (Exception e) {}
          
      try {
        if(fw!=null) {fw.close();}
      }catch (Exception e) {}
    }//try end

  }//main() end
}//class end
