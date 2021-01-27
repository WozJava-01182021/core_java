import java.util.*;
import java.lang.StringBuilder;
import java.io.*;

class StudentCode {
  public static StringBuilder build(String[] words){
	  StringBuilder sb = new StringBuilder();
    try {
      if(words.length == 0){
        throw new Exception("EMPTY");
      } else {
    	    
    	    for(int i = words.length - 1; i >=0; i--){
    	      sb.append(words[i]);
    	    }
    	    
      }
    }
    catch(Exception e){
      System.out.println(e.getMessage());
    }

    return sb;
  }



}