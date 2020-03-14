package jdbc0102;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test03_selectCount {
  public static void main(String[] args) {
    //전체 행 갯수

    Connection con=null;
    PreparedStatement pstmt=null;
    ResultSet rs=null;    
    
    try {
      String url     ="jdbc:oracle:thin:@localhost:1521:xe";
      String user    ="system";
      String password="1234";
      String driver  ="oracle.jdbc.driver.OracleDriver";//ojdbc.jar  
      Class.forName(driver);
      con=DriverManager.getConnection(url, user, password);
      System.out.println("오라클 DB 서버 연결 성공");

      StringBuilder sql=new StringBuilder();
      sql.append(" SELECT COUNT(*) as cnt ");
      sql.append(" FROM sungjuk ");

      pstmt=con.prepareStatement(sql.toString());
      rs=pstmt.executeQuery();
      if(rs.next()) {
        System.out.print(rs.getInt(1) + " ");   //cnt칼럼        
        System.out.println();        
        System.out.print(rs.getInt("cnt") + " ");        
      }else {
        System.out.println("자료없음!!");
      }//if end
      
      
    }catch (Exception e) {
      System.out.println("실패:"+e);
    }finally {
      try {
        if(rs!=null) {rs.close(); rs=null; }
      }catch (Exception e) {}

      try {
        if(pstmt!=null) {pstmt.close(); pstmt=null; }
      }catch (Exception e) {}
      
      try {
        if(con!=null) {con.close(); con=null; }
      }catch (Exception e) {} 
    }//try end
    
    
    

  }//main() end
}//class end
