package jdbc1231;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test04_delete {
  public static void main(String[] args) {
    //행삭제
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

      //sno=21 행 삭제하기
      StringBuilder sql=new StringBuilder();
      sql.append(" DELETE FROM sungjuk ");
      sql.append(" WHERE sno=? ");
      
      pstmt=con.prepareStatement(sql.toString());
      pstmt.setInt(1, 21);
      
      int cnt=pstmt.executeUpdate();
      if(cnt==0) {
        System.out.println("행삭제실패!!");
      }else {
        System.out.println("행삭제성공~~");
      }//if end
      
      
    }catch (Exception e) {
      System.out.println("실패:"+e);
    }finally {
        try {
          if(rs!=null) {rs.close();rs=null; }
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
