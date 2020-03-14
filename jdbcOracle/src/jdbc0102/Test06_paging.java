package jdbc0102;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test06_paging {
  public static void main(String[] args) {
    //페이징
    
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
      
      int start=4;
      int end=6;
      
      StringBuilder sql=new StringBuilder();
      sql.append(" select rnum, hakno, uname, email ");
      sql.append(" from( ");
      sql.append("      select rownum as rnum, hakno, uname, email ");
      sql.append("      from( select hakno, uname, email ");
      sql.append("            from tb_student ");
      sql.append("            order by hakno desc ");
      sql.append("          ) AA ");
      sql.append("     )BB ");
      sql.append(" where BB.rnum>= " + start);
      sql.append(" and BB.rnum<= " + end);     
      
      
      pstmt=con.prepareStatement(sql.toString());
      rs=pstmt.executeQuery();
      if(rs.next()) {
        System.out.println("자료있음~~");
        do {
          System.out.print(rs.getInt("rnum") + " ");     
          System.out.print(rs.getString("hakno") + " ");
          System.out.print(rs.getString("uname") + " ");
          System.out.print(rs.getString("email") + " ");
          System.out.println();
        }while(rs.next());
        
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
