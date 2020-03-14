
import java.io.*;

public class Typing {
  public static void main(String[] args) {  
    
    String fileName=args[0];
    try {
      
      FileReader fr=new FileReader(fileName);
      int data=0;
      while(true) {
        data=fr.read();
        if(data==-1) {
          break;
        }//if end
        System.out.print((char)data);
      }//while end
      
      fr.close();
      
    }catch (Exception e) {
      System.out.println("File Not Found :"+e);
    }//try end
    

  }//main() end
}//class end
