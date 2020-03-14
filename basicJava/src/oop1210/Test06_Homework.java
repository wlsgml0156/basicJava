package oop1210;

public class Test06_Homework {
  public static void main(String[] args) {
    //과제)
    //1년 365.2422일
    //-> 365일 ?시간 ?분 ?초
    /*
      1분    : 60초
      1시간 : 60분*60초            -> 3600초
      1일    : 24시간*3600초      -> 86400초
      1년    : 365.2422*86400초 -> 31556926.08
    */
    double year=365.2422;
    int total=(int)(year*86400);
    
    int d,h,m,s;
    
    d=total/86400; //365
    total=total%86400;
    
    h=total/3600; //5
    total=total%3600;
    
    m=total/60;
    s=total%60;
    
    System.out.println("1년: "+year);
    System.out.println(d+"일");
    System.out.println(h+"시");
    System.out.println(m+"분");
    System.out.println(s+"초");   
    
    
    
  }//main() end
}//class end
