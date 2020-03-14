package oop1213;

public class Test04_Quiz {
  public static void main(String[] args) {
    //문자 배열 연습문제
    
    char[] ch={'S','o','l','d','e','s','k'};
    int size=ch.length; //7
    
    //문1) 대문자, 소문자의 갯수를 각각 구하시오
    //문2) 대문자와 소문자를 서로 바꿔서 출력하시오
    //     ->sOLDESK
    int upper=0; //대문자 갯수
    int lower=0; //소문자 갯수
    for(int i=0; i<size; i++) {
        if(ch[i]>='A' && ch[i]<='Z') {//대문자?
            upper++;
            System.out.print((char)(ch[i]+32));
        }//if end
        
        if(ch[i]>='a' && ch[i]<='z') {//소문자?
            lower++;
            System.out.print((char)(ch[i]-32));
        }//if end
        
    }//for end
    System.out.println("대문자 갯수:"+upper);
    System.out.println("소문자 갯수:"+lower);
//--------------------------------------------
    //문3) 모음의 갯수를 구하시오
    int mo=0;
    for(int i=0; i<size; i++) {
        char c=ch[i];
        if(c>='A' && c<='Z') {
            c=(char)(c+32); //소문자로 바꾸기
        }//if end
        
        switch(c) {
        case 'a':
        case 'e':          
        case 'i':          
        case 'o':          
        case 'u': mo++;          
        }//switch end
    }//for end
    System.out.println(mo);
    
    
    
    
    

  }//main() end
}//class end
