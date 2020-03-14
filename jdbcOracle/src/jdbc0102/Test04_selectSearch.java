package jdbc0102;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test04_selectSearch {
  public static void main(String[] args) {
    //조회 및 검색(LIKE연산자)
    
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

      //문) 이름에 '나' 포함된 행 조회      
      String col ="uname";
      String word="나";
      
      //WHERE uname LIKE '%나%'
      String where="";
      where = where + " WHERE " + col + " LIKE '%" + word + "%'";
      //System.out.println(where);
      
      StringBuilder sql=new StringBuilder();
      sql.append(" SELECT sno, uname, aver, addr, wdate ");
      sql.append(" FROM sungjuk ");
      
      if(word.length()>0) {//검색어가 존재하는지?
        sql.append(where);
      }//if end
      
      sql.append(" ORDER BY sno DESC ");
      
      pstmt=con.prepareStatement(sql.toString());
      rs=pstmt.executeQuery();
      if(rs.next()) {
        System.out.println("자료있음~~");
        do {
          System.out.print(rs.getInt("sno") + " ");     
          System.out.print(rs.getString("uname") + " ");
          System.out.print(rs.getInt("aver") + " ");    
          System.out.print(rs.getString("addr") + " "); 
          System.out.print(rs.getString("wdate").substring(0,10) + " ");        
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
