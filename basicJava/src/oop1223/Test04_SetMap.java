package oop1223;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test04_SetMap {
  public static void main(String[] args) {
    //Set 계열 : 순서가 없다
    /*
    Set set=new HashSet();
    set.add(3);
    set.add(2.4);
    set.add("HAPPY");
    set.add(new Character('R'));
    System.out.println(set.size());
    
    //Interface Iterator
    //->cursor를 이용해서 요소를 접근하는 경우
    Iterator iter=set.iterator();
    while(iter.hasNext()) {//cursor가 존재하는지?
      //현재 cursor가 가리키는 요소 가져오기
      Object obj=iter.next();
      System.out.println(obj);
    }//while end
    */
//-------------------------------------------    
    //Map 계열 : 순서가 없다
    //-> Key   : 이름표. 중복 불가능
    //-> Value : 값.     중복 가능
    /*
    Map map=new HashMap();
    map.put("one", 3);
    map.put("two", 2.4);
    map.put("three", "soldesk");
    map.put("four", new Character('R'));
    
    System.out.println(map.size());
    
    //key는 중복해서 주지 않는다
    //map.put("one", 5);
    
    //value는 중복이 가능하다
    map.put("five", "soldesk");
    
    System.out.println(map.get("one"));
    System.out.println(map.get("five"));
    */
//-------------------------------------------    
    /* 문) = 기호를 기준으로 문자열을 분리해서
           = 의 문자열은 key,
           =뒤의 문자열은 value로 map 저장하고
           key값으로 "read.do" 호출하면
           value값으로 "net.bbs.Read" 출력하시오
    */
    
    HashSet command=new HashSet();
    command.add("list.do=net.bbs.List");
    command.add("read.do=net.bbs.Read");
    command.add("write.do=net.bbs.Write");
    
    HashMap map=new HashMap();
    
    Iterator iter=command.iterator();
    while(iter.hasNext()) {
      Object obj=iter.next();
      String str=(String)obj;//다형성
      //System.out.println(str);
      int pos=str.indexOf("=");
      String key  =str.substring(0, pos);
      String value=str.substring(pos+1);
      map.put(key, value);      
    }//while end
    
    System.out.println(map.get("read.do"));
    
    
    

  }//main() end
}//class end
