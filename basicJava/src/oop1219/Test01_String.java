package oop1219;

import java.util.StringTokenizer;

public class Test01_String {
  public static void main(String[] args) {
    //String 관련 메소드
    //StringTokenizer 문자열 분리관련 클래스
    
    /*
    String str="Gone With The Wind";
    
    //특정문자를 기준으로 문자열 분리하기
    String[] word=str.split(" ");
    for(int i=0; i<word.length; i++) {
      System.out.println(word[i]);
    }//for end
    
    
    //문자열 좌우 끝에 있는 공백 제거
    System.out.println("#"+"  S k   y ".trim()+"#"); 
    */
//--------------------------------------------------
    //문)첨부파일이 이미지 파일(.gif .jpg .png)인지 확인하시오
    //   출력결과)
    //     파일명 : sky.png  
    //     맞으면 "파일이 전송되었습니다"
    //     아니면 "파일을 다시 선택해주세요"
    
    //경로구분시 \\ 두번 사용해야 한다
    //String filename="d:\\java1209\\workspace\\sky.jpg";

    //경로구분시 / 기호를 사용해도 된다
    String filename="d:/java1209/workspace/sky.jpg";
    
    //1)단계 : sky.png (파일명.확장자명)
    //->마지막 "/"문자의 인덱스
    int pos=filename.lastIndexOf("/");
    System.out.println(pos);//21
    //->파일명.확장명 추출하기
    filename=filename.substring(pos+1);
    System.out.println(filename);//"sky.jpg"
    
    //2)단계 : 확장명 추출하기 (jpg)
    int dot=filename.indexOf(".");
    String ext=filename.substring(dot+1);
    System.out.println(ext);//"jpg"
    
    //3)단계 : png || gif || jpg 인지 확인
    //전부 소문자로 바꿈
    ext=ext.toLowerCase();
    if(ext.equals("png")||ext.equals("gif")||ext.equals("jpg")) {
      System.out.println("파일이 전송되었습니다");
    }else {
      System.out.println("이미지 파일이 아닙니다");
    }//if end
//---------------------------------------------------------------
    //과제) 파일명, 확장명을 분리해서 출력하시오
    //출력결과) 파일명 : 2019.12.19.sky
    //          확장명 : png
    String photo="d:/java1209/workspace/2019.12.19.sky.png";
    
    
    
    
    
    
    
    
    
    
  }//main() end
}//class end
