package net.utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBOpen {
  //데이터베이스 연결 메소드
  public Connection getConnection() {
    /* Oracle 데이터베이스
    String url     ="jdbc:oracle:thin:@localhost:1521:xe";
    String user    ="system";
    String password="1234";
    String driver  ="oracle.jdbc.driver.OracleDriver";
    */
    String url      = "jdbc:mysql://localhost/내아이디";
    String user     = "내아이디";
    String password = "비밀번호";
    String driver   = "org.gjt.mm.mysql.Driver";  
    
    
    Connection con=null;
    
    try {
      Class.forName(driver);
      con=DriverManager.getConnection(url, user, password);

    }catch (Exception e) {
      System.out.println("DB연결실패:"+e);
    }//try end 
    
    return con;
  }//getConnection() end  
  
}//class end
