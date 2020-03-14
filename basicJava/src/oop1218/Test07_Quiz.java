package oop1218;

public class Test07_Quiz {
  public static void main(String[] args) {
    // 문자열 관련함수 연습문제
    /*
    문)이메일 주소에 @문자 있으면
       @글자 기준으로 문자열을 분리해서 출력하고
       @문자 없다면 "이메일주소 틀림" 메세지를 출력하시오
       출력결과 : webmaster
                  soldesk.com
    */
    
    String email="webmaster@soldesk.com";
    //@문자의 순서확인하기
    int pos=email.indexOf("@");//9
    if(pos==-1) {
      System.out.println("이메일주소틀림!!");
    }else {
      System.out.println("이메일주소맞음!!");
      //@앞의 문자열
      String id=email.substring(0, pos);
      //@뒤의 문자열
      String server=email.substring(pos+1);
      
      System.out.println(id);
      System.out.println(server);
    }//if end
    
    
    

//------------------------------------------------------
    /*
    문)주민번호를 이용해서 아래와 같이 출력하시오
       생년월일 : 2015년 12월 30일
       성별     : 여자
       나이     : 4
       주민번호 각 숫자의 전체 합 : 37
       ->1+5+1+2+3+0+4+1+2+3+4+5+6 = ?
    */
    
    String jumin="1512304123456";
    
    //성별코드를 가져와서 정수형 변환
    //"4" -> 4
    int code=Integer.parseInt(jumin.substring(6,7));
    
    //주민번호에서 생년월일 가져오기
    int myYear =Integer.parseInt(jumin.substring(0,2));//15
    int myMonth=Integer.parseInt(jumin.substring(2,4));//12
    int myDate =Integer.parseInt(jumin.substring(4,6));//30
    
    //태어난 년도 완성하기
    switch(code){
    case 1:
    case 2: myYear=myYear+1900; break;
    case 3:
    case 4: myYear=myYear+2000; break;
    }
    
    //나이
    int myAge=2019-myYear;
    
    //성별
    String gender="";
    switch(code%2){
    case 0 : gender="여자"; break;
    case 1 : gender="남자"; break;
    }//switch end
    
    //출력하기
    System.out.print("생년월일:");
    System.out.print(myYear+"년");
    System.out.print(myMonth+"월");
    System.out.print(myDate+"일");
    System.out.println();
    System.out.println("성별:" + gender);
    System.out.println("나이:" + myAge);
    
    //주민번호 숫자를 전부 더하기
    /*
    //'1' -> 1
    int hap=0;
    for(int i=0; i<jumin.length(); i++) {
      hap=hap+Character.getNumericValue(jumin.charAt(i));
    }//for end
    */
    
    //문)subString()을 이용해서 주민번호 숫자더하기
    int hap=0;
    
    System.out.println(hap);
    
    
    
    
    
    
  }//main() end
}//class end
