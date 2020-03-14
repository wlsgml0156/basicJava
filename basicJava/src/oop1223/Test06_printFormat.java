package oop1223;

public class Test06_printFormat {
  public static void main(String[] args) {
    //출력서식
    
    /*
    //큰따옴표(") 출력
    System.out.println("\"");
    //역슬래쉬(\) 출력
    System.out.println("\\");
    
    //\(경로구분기호) 사용시 2번씩
    System.out.println("d:\\java1209\\workspace");
    System.out.println("d:/java1209/workspace");
    */
    
    /*
       \n 줄바꿈
       \t 탭
       \r
       \b
    */
    /*
    System.out.print("사과\n\n");
    System.out.print("사\n\\n\n과");
    System.out.print("사\t과");
    System.out.print("사\n\t과");
    */
//--------------------------------------------
    /*
       %d 10진 정수형
       %f 실수형
       %c 문자형
       %s 문자열형
    */
    
    //("출력서식", 값)
    System.out.printf("a=%d, b=%d, c=%d\n", 3, 5, 7);
    System.out.printf("#%5d#\n", 2);  //#    2#
    System.out.printf("#%-5d#\n", 2); //#2    #
    System.out.printf("#%05d#\n", 2); //#00002#
//-----------------------------------------------------------    

    System.out.printf("x=%f, y=%f, z=%f\n", 1.2, 4.5, 6.7);
    System.out.printf("#%6.2f# \n", 7.8);  //#  7.80#
    System.out.printf("#%-6.2f# \n", 7.8); //#7.80  #
    System.out.printf("#%.2f# \n", 7.8);   //#7.80#
//-----------------------------------------------------------    
    
    System.out.printf("%c %c %c \n", 'S', 'K', 'Y');
    System.out.printf("#%5c# \n", 'R'); //#    R#
    System.out.printf("#%-5c# \n", 'r');//#r    #
//--------------------------------------------------------------

    System.out.printf("%s %s %s \n", "Year", "Month", "Date");
    System.out.printf("#%8s# \n", "HAPPY"); //#   HAPPY#
    System.out.printf("#%-8s# \n", "HAPPY");//#HAPPY   #     
//--------------------------------------------------------------    
    
    System.out.printf("이름:%s\n나이:%d\n키:%.2f\n", "손흥민", 25, 180.5);
    
  }//maint() end
}//class end
