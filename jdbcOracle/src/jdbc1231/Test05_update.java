package jdbc1231;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test05_update {
  public static void main(String[] args) {
    //행수정
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

      //sno=22행의 이름,국,영,수 수정하기
      StringBuilder sql=new StringBuilder();
      sql.append(" UPDATE sungjuk ");
      sql.append(" SET uname=? ");
      sql.append(" , kor=? ");
      sql.append(" , eng=? ");
      sql.append(" , mat=? ");
      sql.append(" WHERE sno=? ");
      
      pstmt=con.prepareStatement(sql.toString());
      pstmt.setString(1, "오바마");
      pstmt.setInt(2, 77);
      pstmt.setInt(3, 65);
      pstmt.setInt(4, 80);
      pstmt.setInt(5, 22);
      
      int cnt=pstmt.executeUpdate();
      if(cnt==0) {
        System.out.println("행수정실패!!");
      }else {
        System.out.println("행수정성공~~");
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
