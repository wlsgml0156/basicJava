package oop1223;

import java.util.*;

/* UI(User Interface)
   화면구현과 관련된 클래스들이 주로 정의
import java.awt.*;
import javax.swing.*;
*/


public class Test03_List {
  public static void main(String[] args) {
    //Java Collections Framework
    //->자료를 모아서 저장할수 있는 클래스들
    /*
      List : List, Vector, ArrayList, ~~
             순서(index)가 있다. 0부터 시작
             
      Set  : Set, HashSet, Iterator, ~~
             순서가 없다
             
      Map  : Map, HashMap, HashTable, ~~
             순서가 없다. Key와 Value가 있다
    
    */
//------------------------------------------    
    //List계열
    /*
    interface List{}
    class Vector implements List{}
    class ArrayList implements List{}
    
    
    List list=new Vector();    //다형성
    List list=new ArrayList(); //다형성
    */
    
    //E Element요소
    /*
    Vector vec=new Vector();
    vec.add(3);
    vec.add(2.4);
    vec.add('R');
    vec.add(new Integer(5));
    vec.add("HAPPY");
    vec.add(new String("APPLE"));
    
    System.out.println(vec.size());//요소의 갯수
    
    for(int i=0; i<vec.size(); i++) {
      System.out.println(vec.get(i));
    }//for end
    
    //0번째 요소를 제거
    vec.remove(0);
    System.out.println(vec.size());
    
    //vec 요소 전부 제거
    vec.removeAllElements();
    
    if(vec.isEmpty()) {//요소의 갯수가 0개인지?
      System.out.println("요소없다");
    }else {
      System.out.println("요소있다");
    }//if end
    */
//---------------------------------------------
    List list=new ArrayList();
    list.add(3);
    list.add(2.4);
    list.add("HAPPY");
    list.add(new Character('R'));

    //문)remove()를 이용해서 요소를 전부 삭제하시오
    for(int i=list.size()-1; i>=0; i--) {
      list.remove(i);
    }//for end
    
    System.out.println(list.size());
    
    
    
    
    
    
    
    
    
    
  }//main() end
}//class end
