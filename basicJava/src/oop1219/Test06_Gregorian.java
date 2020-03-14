package oop1219;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test06_Gregorian {
  public static void main(String[] args) {
    //날짜 관련 클래스
    //Date  클래스
    //Calendar 클래스
    
    GregorianCalendar now=new GregorianCalendar();
    
    //현재 년도
    System.out.println(now.get(1));  //2019
    //현재 월
    System.out.println(now.get(2));  //11
    System.out.println(now.get(2)+1);//12
    //현재 일
    System.out.println(now.get(5));  //19
//------------------------------------------------    
    System.out.println(now.get(Calendar.YEAR));
    System.out.println(now.get(Calendar.MONTH)+1); 
    System.out.println(now.get(Calendar.DATE));
    
    System.out.println(now.get(Calendar.HOUR));
    System.out.println(now.get(Calendar.MINUTE));
    System.out.println(now.get(Calendar.SECOND));

    //24시간 기준
    //오후4시 -> 16시
    System.out.println(now.get(Calendar.HOUR_OF_DAY));

    //요일
    System.out.println(now.get(Calendar.DAY_OF_WEEK));

    //2020년이 윤년인지 확인하시오
    System.out.println(now.isLeapYear(2020));
    

  }//main() end
}//class end
