package jdbc1231;

import java.sql.DriverManager;

public class Test01_DBOpen {
  public static void main(String[] args) {
    //JDBC(Java Database Connection)
    //자바와 Oracle DB 연동
    try {
      //1)오라클DB 연결 관련 정보
      String url     ="jdbc:oracle:thin:@localhost:1521:xe";
      String user    ="system";
      String password="1234";
      String driver  ="oracle.jdbc.driver.OracleDriver";//ojdbc.jar  
      
      //2)드라이버 로딩
      Class.forName(driver);
      
      //3)오라클DB서버 연결
      DriverManager.getConnection(url, user, password);
      System.out.println("오라클 DB 서버 연결 성공");
      
      
    }catch (Exception e) {
      System.out.println("오라클DB연결 실패:" + e);
    }//try end

  }//main() end
}//class end
