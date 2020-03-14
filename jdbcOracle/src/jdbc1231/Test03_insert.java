package jdbc1231;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Test03_insert {
  public static void main(String[] args) {
    //행추가 연습
    Connection con=null;
    PreparedStatement pstmt=null;
    
    try {
      String url     ="jdbc:oracle:thin:@localhost:1521:xe";
      String user    ="system";
      String password="1234";
      String driver  ="oracle.jdbc.driver.OracleDriver";//ojdbc.jar  
      Class.forName(driver);
      con=DriverManager.getConnection(url, user, password);
      System.out.println("오라클 DB 서버 연결 성공");

      
      //값을 변수로 담아서 전달하기
      StringBuilder sql=new StringBuilder();
      sql.append(" INSERT INTO sungjuk(sno,uname,kor,eng,mat,addr) ");
      sql.append(" VALUES(sungjuk_seq.nextval, ?, ?, ?, ?, ?) ");

      
      pstmt=con.prepareStatement(sql.toString());
      // ?의 의미
      //-> 특정값으로 대입할수 있는 표식
      //-> 물음표(?)의 갯수와 값 갯수가 같아야 한다
      pstmt.setString(1, "트럼프");//1 -> 첫번째   ?, uname칼럼 
      pstmt.setInt(2, 99);         //2 -> 두번째   ?, kor칼럼 
      pstmt.setInt(3, 88);         //3 -> 세번째   ?, eng칼럼 
      pstmt.setInt(4, 85);         //4 -> 네번째   ?, mat칼럼 
      pstmt.setString(5, "Seoul"); //5 -> 다섯번째 ?, addr칼럼 
      
      
      //insert, update, delete구문 실행
      int cnt=pstmt.executeUpdate();
      if(cnt==0) {
          System.out.println("행추가실패!!");
      }else {
          System.out.println("행추가성공~~");
      }//if end
      
      
      
    }catch (Exception e) {
      System.out.println("실패:"+e);
    }finally {
        //자원반납(순서주의)
        try {
          if(pstmt!=null) {pstmt.close(); pstmt=null; }
        }catch (Exception e) {}
        
        try {
          if(con!=null) {con.close(); con=null; }
        }catch (Exception e) {}
      
    }//try end

  }//main() end
}//class end
