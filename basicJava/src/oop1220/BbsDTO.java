package oop1220;

public class BbsDTO { //게시판 관련 클래스
                      //Data Tranfer Object
  
  private String uid;    //글쓴 아이디
  private String passwd; //글 비번
  private String subject;//글 제목
  private String content;//글 내용
  private int readcnt;   //조회수
  
  public BbsDTO() {}

  
  //getter와 setter함수 자동코딩
  //Source->Generate Getters and Setters...  
  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }

  public String getPasswd() {
    return passwd;
  }

  public void setPasswd(String passwd) {
    this.passwd = passwd;
  }

  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public int getReadcnt() {
    return readcnt;
  }

  public void setReadcnt(int readcnt) {
    this.readcnt = readcnt;
  }
  
  
  
  
  
  
  
  
  
  
}//class end
