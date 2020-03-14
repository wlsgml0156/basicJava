package oop1218;

public class Test06_String {
  public static void main(String[] args) {
    //문자열 관련 클래스
    //String
    //StringBuffer
    //StringBuilder
    
    //문자열 연산 속도
    //->String < StringBuffer < StringBuilder
    
    /*
    String str="";//빈문자열값
    str=str+"one";
    System.out.println(str);
    
    str=str+"three";
    System.out.println(str);
    
    str+="five";
    System.out.println(str);
    
    str="";//문자열지우기
    System.out.println(str.length());//글자갯수
    */
//---------------------------------------------
    /*
    StringBuilder sb=null; //참조변수 선언
                           //메모리할당하지 않음
    
    sb=new StringBuilder();
    
    sb.append("one");
    System.out.println(sb.toString());
    
    sb.append("three");
    System.out.println(sb.toString());
    
    sb.append("five");
    System.out.println(sb.toString());
    
    //모든 문자열 지우기
    sb.delete(0, sb.length());
    System.out.println(sb.length());
    */
//------------------------------------------
    String name=new String("soldesk");
    
    String str="Gone With The Wind";
    
    /*
    //글자갯수
    System.out.println(str.length());//18
    
    //맨앞글자
    System.out.println(str.charAt(0));//'G'
    
    //맨마지막 글자
    System.out.println(str.charAt(17));//'d'
    //문)length()이용해서 마지막 글자 출력
    System.out.println(str.length()-1);//'d'
    
    //문)대소문자를 서로 바꿔서 출력하시오
    for(int i=0; i<str.length(); i++) {
       char c=str.charAt(i);
       if(Character.isUpperCase(c)) {//대문자?
         System.out.print(Character.toLowerCase(c));
       }else if(Character.isLowerCase(c)) {//소문자?
         System.out.print(Character.toUpperCase(c));
       }else {
         System.out.print(c);
       }//if end
    }//for end
    
    
    //"G"문자열의 순서값(index)
    System.out.println(str.indexOf("G"));//0
    //중복되는 문자열이면 처음 문자열의 인덱스 반환
    System.out.println(str.indexOf("e"));//3
    //없는 문자열이면 -1 반환
    System.out.println(str.indexOf("k"));//-1
    
    //전부 소문자로 변환
    System.out.println(str.toLowerCase());
    //전부 대문자로 변환
    System.out.println(str.toUpperCase());
    
    //'n' -> 'N'으로 치환
    System.out.println(str.replace('n', 'N'));
    
    //문자열 갯수가 0인지?
    if(str.isEmpty()){
      System.out.println("빈문자열이다");
    }else{
      System.out.println("빈문자열이 아니다");
    }//if end
    */
//---------------------------------------------    
    //앞에서부터 문자열 비교
    System.out.println(str.startsWith("Gone"));
    //뒤에서부터 문자열 비교
    System.out.println(str.endsWith("Wind"));    
    //전체 문자열 내용비교
    System.out.println("sky".equals("hi"));
    
    //문자열 일부분만 추출 ★★★
    //6번째~마지막까지
    System.out.println(str.substring(6));
    //6번째~12-1까지
    System.out.println(str.substring(6,12));
    //"Go"만 추출하기
    //(시작인덱스,추출하고자 하는 글자인덱스+1)
    System.out.println(str.substring(0,2));
    
    //첫번째글자 -> "G"
    System.out.println(str.substring(0, 1));
    //마지막글자 -> "d"
    System.out.println(str.substring(17, 18));
    System.out.println(str.substring(str.length()-1, str.length()));
    System.out.println(str.substring(str.length()-1));
    
    
  }//main() end
}//class end
