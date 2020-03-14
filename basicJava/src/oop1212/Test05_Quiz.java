package oop1212;

public class Test05_Quiz {
  public static void main(String[] args) {
    // 연습문제

    /*
       문1) 운행거리에 따라 택시 요금을 계산하는 프로그램  
             2000m까지는 기본요금 900원이고
             2000m초과 운행시 200m단위마다
             기본요금에 100원씩 가산하여 요금을 계산한다
    */

    
    

    //문2) 1~100중에서  2의 배수이면서 3의 배수의 갯수를 구하시오
    /*
    int count=0;
    for(int a=1; a<=100; a=a+1) {
        if(a%2==0 && a%3==0) {
            count=count+1;
        }
    }//for end
    System.out.println(count);
    */
    
    


    //문3) 소문자 중에서 모음의 갯수를 구하시오
    //     -> 모음 'a','e','i','o','u'
    int mo=0;
    for(char ch='a'; ch<='z'; ch++) {
        switch(ch) {
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u': mo++;
        }//switch 
    }//for end
    System.out.println(mo);
    


    //문4) 알파벳을 한줄에 5개씩 출력하시오
    /*
        ABCDE
        FGHIJ
        KLMNO
        PQRST
        UVWXY
        Z
    */
    int cnt=0;
    for(char ch='A'; ch<='Z'; ch++) {
        cnt++;
        System.out.print(ch);
        //System.out.print(cnt);
        if(cnt%5==0) {
          System.out.println();//줄바꿈
        }//if end
    }//for end

    System.out.println();

    
    //문5) 1~100중에서  짝수의 합, 홀수의 합을 각각 구하시오
    //switch이론
    int even=0; //짝수의 합
    int odd=0;  //홀수의 합
    boolean flag=false;
    for(int a=1; a<=100; a=a+1) {
        if(flag) {
            even=even+a;
            flag=false;
        }else {
            odd=odd+a;
            flag=true;
        }//if end
    }//for end
    System.out.println(even);
    System.out.println(odd);



    //문6) 다음식의 결과를 구하시오
    //      1-2+3-4 ... +99-100 = ?



    //문7) 두수사이의 합을 구하시오
    //       2+3+4+5=14
    //       5+4+3+2=14
    int start=5, end=2;
    int hap=0;
    
    //start값이 더 크면 변수값을 서로 교환(swap)
    if(start>end) {
        int tmp=start;
        start=end;
        end=tmp;
    }
    
    for(int a=start; a<=end; a++) {
        hap=hap+a;
    }//for end
    
    System.out.println(hap);
    
    
    



    //문8)다음식의 결과를 구하시오
    /*
            1    2     3     4    5      99
           ─ - ─ + ─ - ─ + ─ ... ── = ?
            2    3     4     5    6      100
      
           -> (1/2) - (2/3) + (3/4) ...
    */


    

    /*
       문9)
             어느 달팽이는 낮에는 3cm올라가고
             밤에는 2.5cm 내려온다고 할때
             달팽이가 13cm의 나무 꼭대기에 올라가려면
             며칠이 걸리는지 구하시오
    */
    int day=0;
    double snail=0.0; //달팽이
    
    for(;;) { //무한loop      
        day++;
        snail = snail + 3.0;
        if(snail>=13.0){//13cm에 도달하면 끝
            break;
        }else{
            snail = snail-2.5;
        }      
    }//for end
    
    System.out.println(day+"일");  

    
    //문10)3의 배수의 누적 합이 100이 넘어가려면
    //       3부터 어디까지 더해야 하는지 구하시오
    //       출력결과) 3+6+9+12+...=




    //문11)누적의 합
    /*    
             1+....+10 =55
             1+....+20 =210
             1+....+30 =
  
             1+....+90 =
             1+....+100=5050   
    */   
    int sum=0;
    for(int a=10; a<=100; a=a+10)  {
        for(int b=1; b<=a; b=b+1){
            sum=sum+b;
        }
        System.out.println("1+..."+a+"="+sum);
        sum=0;//sum값을 초기화
    }//for end
    
    


    /*    
             1+....+10=55
            11+....+20=
            21+....+30=
  
            81+....+90=
            91+....+100=    
    */



    /*
       문12)
              @★★★
              ★@★★
              ★★@★
              ★★★@
    */



    /*
       문13) 2g, 3g, 5g짜리 추가 각각 5개씩 있을때
             세가지의 추의 조합으로 무게가 40~45사이일 때
             각 추의 갯수와 무게를 출력하는 프로그램
                       
              출력결과
              2g  3g  5g   total
              1    5   5     42
              2    4   5     41
              2    5   5     44
    */    
    int total=0;
    for(int a=1; a<=5; a++){      
      for(int b=1; b<=5; b++){        
        for(int c=1; c<=5; c++) {          
            total = (a*2)+(b*3)+(c*5);//추의 합계
            if(total>=40 && total<=45){
              System.out.println(a+" "+b+" "+c+"="+total);
            }//if end          
        }//for end
      }//for end
    }//for end
    

  }//main() end
}//class end
