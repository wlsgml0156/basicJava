package oop1216;

public class Test04_method {
   
  public static void test1(int a, int b) {
    System.out.println(a);
    System.out.println(b);
  }//test1() end
  
  public static void test2(int[] a) {
    for(int i=0; i<a.length; i++) {
      System.out.println(a[i]);
    }
  }//test2() end
  
  public static void test3(String a, String b) {
    System.out.println(a);
    System.out.println(b);
  }//test3() end
  
  public static void test4(String[] a) {
    for(int i=0; i<a.length; i++) {
      System.out.println(a[i]);
    }
  }//test4() end
  
  public static void test5(int a, int b) {
    System.out.println(a);
    System.out.println(b);
  }//test5() end
  
  public static void test6(int[][] num) {
    for(int i=0; i<num.length; i++) {
      int col=num[i].length;      
      for(int j=0; j<col; j++) {
        System.out.println(num[i][j]);
      }
    }//for end
  }//test6() end
  
  public static void main(String[] args) {
    //전달값이 배열인 경우
    int[] su= {10, 20, 30};
    test1(su[0], su[2]);//10, 30
    test2(su);          //배열요소 전체
    
    String[] name= {"무궁화","진달래","개나리"}; 
    test3(name[0], name[2]);//"무궁화","개나리"
    test4(name);            //배열요소 전체
    
    int[][] num={
                  {1, 3, 5},
                  {2, 4, 6}
                };//[2행][3열]
    test5(num[0][0], num[1][2]); //1, 6
    test6(num);                  //배열요소 전체
    

  }//main() end
}//class end
