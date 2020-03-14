package jdbc1231;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Test02_insert {
  public static void main(String[] args) {
    //행추가 연습
    try {
      //1)DB연결
      String url     ="jdbc:oracle:thin:@localhost:1521:xe";
      String user    ="system";
      String password="1234";
      String driver  ="oracle.jdbc.driver.OracleDriver";//ojdbc.jar  
      Class.forName(driver);
      Connection con=DriverManager.getConnection(url, user, password);
      System.out.println("오라클 DB 서버 연결 성공");
    
      
      //2)SQL문 작성
      //->SQL문 작성시 문자열 연산 속도를 고려하여
      //->StringBuilder클래스 추천!!
      //->SQL문 안에 종결문자 ; 를 쓰면 오류!!
      StringBuilder sql=new StringBuilder();
      sql.append(" INSERT INTO sungjuk(sno,uname,kor,eng,mat,addr) ");
      sql.append(" VALUES(sungjuk_seq.nextval,'경자년',60,50,75,'Jeju') ");

      
      //3)작성한 sql값을 SQL형식으로 변환
      PreparedStatement pstmt=con.prepareStatement(sql.toString());
      
      
      //4) 3)의 값을 실행
      int cnt=pstmt.executeUpdate();
      System.out.println(cnt);
      
    }catch (Exception e) {
      System.out.println("실패:"+e);
    }//try end

  }//main() end
}//class end
