package oop1219;

class Parent{
  int one;
  int two;
  public Parent() {}
  public Parent(int one, int two) {
    this.one = one;
    this.two = two;
  }  
}//class end

class Child extends Parent{
  int three;
  public Child() {
    //super(); 생략되어 있음
  }
  public Child(int a, int b, int c) {
    //one, two멤버변수가 private속성이면
    //아래 내용은 에러 발생
    //super.one=a; 
    //super.two=b;
    
    //상속받은 멤버변수(field)에 초기값 전달
    super(a, b);    
    
    this.three=c;
  }
  
}//class end

public class Test05_super {
  public static void main(String[] args) {
    //부모 super

    Child child=new Child(10, 20, 30);
    System.out.println(child.one);
    System.out.println(child.two);
    System.out.println(child.three);
    
    
    
    
    
    
  }//main() end
}//class end
