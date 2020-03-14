package oop1224;

import java.io.FileInputStream;
import java.io.FileReader;

public class Test01_input {
  public static void main(String[] args) {
    //InputStream기반과 Reader기반 비교
    
    String fileName="D:/java1209/workspace/basicJava/src/oop1210/Welcome.java";
    
    try {
      //byte형 1byte 메모리 할당
      //char형 2byte 메모리 할당
      
      //1) FileInputStream : 1바이트 기반
      //-> 한글 깨짐
      /*
      FileInputStream fis=new FileInputStream(fileName);
      int data=0;
      while(true) {
        data=fis.read();//1바이트 읽기
        if(data==-1) {//파일의끝(End Of File)인지?
          break;
        }//if end
        System.out.print((char)data);
      }//while end
      
      fis.close();
      */
//-------------------------------------------------------
      //2)FileReader : char(2바이트) 기반
      //-> 한글 안깨짐
      FileReader fr=new FileReader(fileName);
      int data=0;
      while(true) {
        data=fr.read(); //character 읽어옴
        if(data==-1) {
          break;
        }//if end
        System.out.print((char)data);
      }//while end
      
      fr.close();
      
      
    }catch (Exception e) {
      System.out.println("실패:"+e);
    }//try end

  }//main() end
}//class end
