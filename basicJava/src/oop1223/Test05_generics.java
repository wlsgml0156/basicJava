package oop1223;

import java.util.ArrayList;
import java.util.Vector;

public class Test05_generics {
  public static void main(String[] args) {
    //Generics 제네릭
    //->데이터를 수집하는 경우 자료형을 제한할수 있다
    //<E>        Element     참조자료형만 가능
    //<K>, <V>   Key, Value
    //<T>
    //<?>

    //배열은 동일한 자료형의 요소만 가능하다
    //int[] num=new int[3];
    
    //Vector<int> 에러
    //Element는 참조형(클래스)만 가능하다
    
    /*
    //String 만 가능하다
    Vector<String> vec=new Vector<String>();
    vec.add("SEOUL");
    //vec.add(3); 에러
    vec.add(new String("JEJU"));
    //vec.add(new Integer(5));에러
    */
//----------------------------------------------------    
    ArrayList<Integer> list=new ArrayList<Integer>();
    list.add(new Integer(3));
    //list.add(""); 에러
    //list.add(new String("")); 에러
    list.add(5);//autoboxing 오토박싱
                //기본형값이 자동으로 참조형화 된다
//----------------------------------------------------    
    
    
    
    
    
    
    
    

  }//main() end
}//class end
