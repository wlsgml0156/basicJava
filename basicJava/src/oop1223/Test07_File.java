package oop1223;

import java.io.File;

public class Test07_File {
  public static void main(String[] args) {
    //File클래스
    //파일 관련 정보를 알수 있다
    
    try {
      //예외 발생이 예상되는 코드 작성
      
      //경로명+파일명
      //경로구분 기호는 \\로 한다
      //String pathname="D:\\java1209\\setup\\epp420_64bit.exe";
      
      //경로구분시 / 기호도 사용가능하다
      String pathname="D:/java1209/setup/epp420_64bit.exe";
      
      //파일 가져오기
      File file=new File(pathname);
      
      if(file.exists()) {//파일이 있나요?
        System.out.println("파일 가져오기 성공~~");
        
        long filesize=file.length();
        System.out.println("파일크기:"+filesize);
        System.out.println("파일크기:"+filesize/1024+"KB");
        
        //파일명.확장명 (epp420_64bit.exe)
        String filename=file.getName();
        System.out.println(filename);
        
        //문)파일명과 확장명를 분리해서 출력하시오
        //   epp420_64bit
        //   exe
        int lastdot=filename.lastIndexOf(".");
        String name=filename.substring(0, lastdot);
        String ext =filename.substring(lastdot+1);
        System.out.println("파일명:"+name);
        System.out.println("확장명:"+ext);
        
        //파일삭제
        //file.delete();        
        
        
      }else {
        System.out.println("파일 없어요!!");
      }//if end
      
      
    }catch (Exception e) {      
      //예외가 발생되면 실행할 코드 작성
      System.out.println("File클래스 실패:"+e);
    }//try end
    
    System.out.println("END");
    
    
    
    
    
    

  }//main() end
}//class end
