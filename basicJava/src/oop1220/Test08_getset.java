package oop1220;

class Member{
  private String id;
  private String password;
  
  //멤버변수를 private속성으로 부여하고
  //메소드를 이용해서 private속성의 멤버에 접근한다
  
  public void setId(String id) {
    this.id=id;
  }
  
  public String getId() {
    return this.id;
  }
  
  public void setPassword(String password) {
    this.password=password;
  }
  
  public String getPassword() {
    return this.password;
  }
  
}//class end


public class Test08_getset {
  public static void main(String[] args) {
    //getter, setter 함수
    //->private속성의 멤버변수를 접근할때 주로 사용한다
    
    //->getter함수 작성 규칙:
    //  get멤버변수의첫글자대문자로바꾼후함수명()
    
    //->setter함수 작성 규칙:
    //  set멤버변수의첫글자대문자로바꾼후함수명()   
    
    
    //is함수명()  :리턴값이 boolean형이 많다 
    //get함수명() :리턴값이 많다
    //set함수명() :어떤 값을 세팅하는 경우
    //to함수명()  
    
    
    Member mem=new Member();
    
    mem.setId("soldesk");
    mem.setPassword("1234");

    System.out.println(mem.getId());
    System.out.println(mem.getPassword());
    
  }//main() end
}//class end
