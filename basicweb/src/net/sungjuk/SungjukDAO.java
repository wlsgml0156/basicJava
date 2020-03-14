package net.sungjuk;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import net.utility.DBClose;
import net.utility.DBOpen;

public class SungjukDAO {
  //데이터베이스 관련 작업
  //Data Access Object
  //Database Bean
  private DBOpen dbopen=null;  
  private Connection con=null;
  private PreparedStatement pstmt=null;
  private ResultSet rs=null;
  private StringBuilder sql=null;  
  
  public SungjukDAO() {
    dbopen=new DBOpen();
  }
  
  public int insert(String uname, int kor, int eng, int mat, int aver, String addr) {
    int cnt=0;
    try {
      //DB연결
      con=dbopen.getConnection();
      
      sql=new StringBuilder();
      sql.append(" INSERT INTO sungjuk(sno, uname, kor, eng, mat, aver, addr, wdate) ");
      sql.append(" VALUES ( (SELECT NVL(MAX(sno),0)+1 FROM sungjuk) ");
      sql.append("          ,?,?,?,?,?,?, sysdate) ");

      PreparedStatement pstmt=con.prepareStatement(sql.toString());
      pstmt.setString(1, uname);
      pstmt.setInt(2, kor);        
      pstmt.setInt(3, eng);         
      pstmt.setInt(4, mat);         
      pstmt.setInt(5, aver);         
      pstmt.setString(6, addr);

      cnt=pstmt.executeUpdate();
      
    }catch (Exception e) {
      System.out.println("추가실패:"+e);
    }finally {
      DBClose.close(con, pstmt);
    }//try end
    return cnt;//행추가 성공 여부 리
  }//insert() end
  

  public int insert(SungjukDTO dto) {
    int cnt=0;
    try {
      //DB연결
      con=dbopen.getConnection();
      
      sql=new StringBuilder();
      sql.append(" INSERT INTO sungjuk(sno, uname, kor, eng, mat, aver, addr, wdate) ");
      sql.append(" VALUES ( (SELECT NVL(MAX(sno),0)+1 FROM sungjuk) ");
      sql.append("          ,?,?,?,?,?,?, sysdate) ");

      PreparedStatement pstmt=con.prepareStatement(sql.toString());
      pstmt.setString(1, dto.getUname());
      pstmt.setInt(2, dto.getKor());        
      pstmt.setInt(3, dto.getEng());         
      pstmt.setInt(4, dto.getMat());         
      pstmt.setInt(5, dto.getAver());         
      pstmt.setString(6, dto.getAddr());

      cnt=pstmt.executeUpdate();
      
    }catch (Exception e) {
      System.out.println("추가실패:"+e);
    }finally {
      DBClose.close(con, pstmt);
    }//try end
    return cnt;//행추가 성공 여부 리턴
  }//insert() end
  
  
  public ArrayList<SungjukDTO> list() {
    //DB에서 가져온 데이터를 list에 모아서
    //sungjukList.jsp에 전달한다
    ArrayList<SungjukDTO> list=null;
    
    try {
      con=dbopen.getConnection();
      sql=new StringBuilder();
      sql.append(" SELECT sno, uname, kor, eng, mat, wdate");
      sql.append(" FROM sungjuk ");
      sql.append(" ORDER BY wdate DESC ");
      
      pstmt=con.prepareStatement(sql.toString());
      rs=pstmt.executeQuery();
      if(rs.next()){
        //전체행 저장
        list=new ArrayList<SungjukDTO>();
        do {
          //한줄저장
          SungjukDTO dto=new SungjukDTO();
          dto.setSno(rs.getInt("sno"));
          dto.setUname(rs.getString("uname"));
          dto.setKor(rs.getInt("kor"));
          dto.setEng(rs.getInt("eng"));
          dto.setMat(rs.getInt("mat"));
          dto.setWdate(rs.getString("wdate"));    
          list.add(dto);
        }while(rs.next());
        
      }else {
        list=null;
      }//if end
      
    }catch (Exception e) {
      System.out.println("목록실패:"+e);
    }finally {
      DBClose.close(con, pstmt, rs);
    }//try end
    
    return list;
    
  }//list() end
  
  
  public SungjukDTO read(int sno) {
    SungjukDTO dto=null;
    try {
      con=dbopen.getConnection();
      sql=new StringBuilder();
      sql.append(" SELECT sno, uname, kor, eng, mat, aver, addr, wdate ");
      sql.append(" FROM sungjuk ");
      sql.append(" WHERE sno=? ");
      
      pstmt=con.prepareStatement(sql.toString());
      pstmt.setInt(1, sno);
      
      rs=pstmt.executeQuery();
      if(rs.next()){
        dto=new SungjukDTO();
        dto.setSno(rs.getInt("sno"));
        dto.setUname(rs.getString("uname"));
        dto.setKor(rs.getInt("kor"));
        dto.setEng(rs.getInt("eng"));
        dto.setMat(rs.getInt("mat"));
        dto.setAver(rs.getInt("aver"));
        dto.setAddr(rs.getString("addr"));
        dto.setWdate(rs.getString("wdate"));
      }else {
        dto=null;
      }//if end
    }catch (Exception e) {
      System.out.println("상세보기실패:"+e);
    }finally {
      DBClose.close(con, pstmt, rs);
    }//try end
    return dto;
  }//read() end
  
  
  public int delete(int sno) {
    int cnt=0;
    try {
      con=dbopen.getConnection();
      sql=new StringBuilder();
      sql.append(" DELETE FROM sungjuk ");
      sql.append(" WHERE sno=? ");
      pstmt=con.prepareStatement(sql.toString());
      pstmt.setInt(1, sno);
      cnt=pstmt.executeUpdate();
      
    }catch (Exception e) {
      System.out.println("삭제실패:"+e);
    }finally {
      DBClose.close(con, pstmt, rs);
    }//try end
    return cnt;
  }//delete() end
  

  public int update(SungjukDTO dto){
    int cnt=0;
    try{
        con=dbopen.getConnection();
        
        sql=new StringBuilder();
        sql.append(" UPDATE sungjuk ");
        sql.append(" SET uname=? ");
        sql.append(" ,kor=?, eng=?, mat=?, aver=? ");
        sql.append(" ,addr=? ");
        sql.append(" ,wdate=sysdate ");
        sql.append(" WHERE sno=?");

        pstmt=con.prepareStatement(sql.toString());
        pstmt.setString(1, dto.getUname());
        pstmt.setInt(2, dto.getKor());
        pstmt.setInt(3, dto.getEng());
        pstmt.setInt(4, dto.getMat());
        pstmt.setInt(5, dto.getAver());
        pstmt.setString(6, dto.getAddr());
        pstmt.setInt(7, dto.getSno());

        cnt=pstmt.executeUpdate();
        
    }catch(Exception e){
        System.out.println("수정실패:"+e);
    }//try end
    return cnt;
  }//update() end  
  
  
  
}//class end
