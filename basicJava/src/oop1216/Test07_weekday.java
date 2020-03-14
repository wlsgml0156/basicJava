package oop1216;

public class Test07_weekday {
  public static void main(String[] args) {
    //요일 구하는 프로그램
    int cYear=2019, cMonth=12, cDate=16;
/*
    서기1년1월1일(월) ~ 2019년12월16일(월) => 총날수  
    총날수%7 => 0일 1월 2화 3수 4목 5금 6토
    
    1)단계 -> 1년 ~ 2018년
      윤년 += 366
      평년 += 365
      
    2)단계 -> 1월 ~ 11월      
      1 3 5 7 8 10 12  += 31
      4 6 9 11         += 30
      2                += 29 (윤년)
      2                += 28 (평년)
      
    3)단계
      += 16
*/    
    int hap=0; //총날수
    
    //1)단계
    for(int y=1; y<cYear; y++) {
        if(y%4==0 && y%100!=0 || y%400==0) {
            hap=hap+366;
        }else {
            hap=hap+365;
        }//if end
    }//for end
    
    
    //2)단계
    int[] mon= {0,31,28,31,30,31,30,31,31,30,31,30,31};
    if(cYear%4==0 && cYear%100!=0 || cYear%400==0) {
        mon[2]=29;
    }//if end
    
    for(int m=1; m<cMonth; m++) {
        hap=hap+mon[m];
    }//for end
    
    //3)단계
    hap=hap+cDate;
    
    System.out.println("총날수:"+hap);
    
    switch(hap%7) {
    case 0: System.out.println("일요일");break;
    case 1: System.out.println("월요일");break;
    case 2: System.out.println("화요일");break;
    case 3: System.out.println("수요일");break;
    case 4: System.out.println("목요일");break;
    case 5: System.out.println("금요일");break;
    case 6: System.out.println("토요일");break;
    }//switch end
    
    
    
  }//main() end
}//class end





