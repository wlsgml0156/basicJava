package oop1213;

public class Test03_Quiz {
  public static void main(String[] args) {
    //1차원 배열 연습문제
    
    int[] su= {-3, -7, -8, -1, -9};
    int size=su.length; //5
    
    //문1)su배열 요소의 전체 합을 구하시오
    //    su[0]+su[1]+su[2]+su[3]+su[4]
    int hap=0;
    for(int i=0; i<size; i++) {
        hap=hap+su[i];
    }//for end
    System.out.println(hap);
//-----------------------------------------   
    //문2)음수의 갯수를 구하시오
    int count=0;
    for(int i=0; i<size; i++) {
        if(su[i]<0) {
            count++;
        }//if end
    }//for end
    System.out.println(count);
//-----------------------------------------        
    //문3)su[0]요소의 등수를 구하시오  
    int r=1;
    for(int i=0; i<size; i++) {
        if(su[0]<su[i]) {
            r=r+1;
        }//if end
    }//for end
    System.out.println(r);
//-----------------------------------------    
    //문4)최대값, 최소값을 각각 구하시오 
    //su배열 요소값이 전부 음수인경우 주의!!
    int max=su[0];
    int min=su[0];
    for(int i=0; i<size; i++) {
        if(max<su[i]) { max=su[i]; }
        if(min>su[i]) { min=su[i]; }
    }//for end
    
    System.out.println("최대값:"+max);
    System.out.println("최소값:"+min);
//-------------------------------------------
    //문5)su배열의 각 요소의 등수를 구하시오
    int[] rank= {1,1,1,1,1};
    
    for(int i=0; i<size; i++) {
        for(int j=0; j<size; j++) {
            if(su[i] < su[j]) {
                rank[i]=rank[i]+1; //rank[i]++;
            }//if end
        }
    }//for end
    
    
    for(int i=0; i<size; i++) {
        System.out.println(su[i] + ":" + rank[i] +"등");
    }//for end
    
    
  }//main() end
}//class end
