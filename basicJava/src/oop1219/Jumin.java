package oop1219;

import java.util.Calendar;
import java.util.GregorianCalendar;


public class Jumin {
  private String jumin; //주민번호
  public Jumin() {}
  public Jumin(String jumin) {
    this.jumin=jumin;
  }
  
  public boolean validate() {
    //주민번호가 유효한지 검증하고
    //유효하면 true리턴
    boolean flag=false;
    Integer[] CHECKNUM = new Integer[]{2,3,4,5,6,7,8,9,2,3,4,5};
    Integer[] save = new Integer[12];
    int hap = 0;
    int size = save.length; //12
    
    for(int idx=0; idx<size; idx++) {
      int num = Integer.parseInt(jumin.substring(idx, idx+1));
      save[idx] = num * CHECKNUM[idx];
      hap = hap + save[idx];
    }//for end
    
    int M = (11-(hap%11))%10;        
    if(M==Integer.parseInt(jumin.substring(12))) {//주민번호검증
        flag = true;
    }
    
    return flag;

  }//validate() end
  
  public void disp() {
    //생년월일, 성별, 나이, 띠 출력하기
    //띠 : 태어난 년도%12
    //->0원숭이 1닭 2개 ~~ 11양
    int myYear  = Integer.parseInt(this.jumin.substring(0, 2));
    int myMonth = Integer.parseInt(this.jumin.substring(2, 4));
    int myDate  = Integer.parseInt(this.jumin.substring(4, 6));
    
    //성별코드
    int code = Integer.parseInt(this.jumin.substring(6, 7));
    
    switch(code) {
    case 1 :
    case 2 : myYear = myYear + 1900; break;
    case 3 :
    case 4 : myYear = myYear + 2000; break;
    }
    
    //오늘날짜
    GregorianCalendar now=new GregorianCalendar();
    int cYear = now.get(Calendar.YEAR);   //2019
    
    //1)성별
    String gender = "";
    switch(code%2) {
    case 0 : gender = "여자"; break;
    case 1 : gender = "남자"; break;
    }
    
    //2)나이: 2019-1989 -> Calendar 클래스 활용해서
    int myAge = cYear - myYear;
          
    //3)띠: (%12) -> 0원숭이 1닭 2개 ~~~ 11양
    String[] animal = {"원숭이","닭","개","돼지","쥐","소","호랑이","토끼","용","뱀","말","양"};
    
    //출력
    System.out.println("주민번호 : " + this.jumin);
    System.out.println("태어난 년도 : " + myYear);
    System.out.println("태어난 월 : " + myMonth);
    System.out.println("태어난 일 : " + myDate);
    System.out.println("성별 : " + gender);
    System.out.println("나이 : " + myAge);
    System.out.println("띠 : " + animal[myYear%12]);   
    
  }//disp() end
  
  
}//class end
