package jdbc0102;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test01_selectOne {
  public static void main(String[] args) {
    //조회 및 검색(1행 가져오기)
    
    //DB연결
    Connection con=null;
    //SQL문 변환
    PreparedStatement pstmt=null;
    //select문 실행시 반환
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
      sql.append(" SELECT sno,uname,kor,eng,mat,tot,aver,addr,wdate ");
      sql.append(" FROM sungjuk ");
      sql.append(" WHERE sno=? ");
      
      //sno=22행 조회하기
      pstmt=con.prepareStatement(sql.toString());
      pstmt.setInt(1, 22);
          
      //DML(insert, update, delete문) 
      //int cnt=pstmt.executeUpdate();
      
      //select문 실행
      rs=pstmt.executeQuery();
      //cursor : 현재 가리키는 값. 이동할수 있다
      if(rs.next()) { //cursor가 존재하는지?
        System.out.println("자료있음~~");
        //1) 칼럼순서 
        //-> select 칼럼1번, 칼럼2번, ~~~
        System.out.print(rs.getInt(1) + " ");   //sno칼럼
        System.out.print(rs.getString(2) + " ");//uname칼럼
        System.out.print(rs.getInt(3) + " ");   //kor칼럼
        System.out.print(rs.getInt(4) + " ");   //eng칼럼
        System.out.print(rs.getInt(5) + " ");   //mat칼럼
        System.out.print(rs.getInt(6) + " ");   //tot칼럼
        System.out.print(rs.getInt(7) + " ");   //aver칼럼
        System.out.print(rs.getString(8) + " ");//addr칼럼
        System.out.print(rs.getString(9) + " ");//wdate칼럼        
        
        System.out.println();
        
        //2)칼럼명
        //->select sno, uname, ~~
        System.out.print(rs.getInt("sno") + " ");     //sno칼럼
        System.out.print(rs.getString("uname") + " ");//uname칼럼
        System.out.print(rs.getInt("kor") + " ");     //kor칼럼
        System.out.print(rs.getInt("eng") + " ");     //eng칼럼
        System.out.print(rs.getInt("mat") + " ");     //mat칼럼
        System.out.print(rs.getInt("tot") + " ");     //tot칼럼
        System.out.print(rs.getInt("aver") + " ");    //aver칼럼
        System.out.print(rs.getString("addr") + " "); //addr칼럼
        System.out.print(rs.getString("wdate") + " ");//wdate칼럼        
        
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
