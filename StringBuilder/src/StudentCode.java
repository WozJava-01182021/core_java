import java.lang.StringBuilder;

class StudentCode {

  public static StringBuilder build(String[] words) throws Exception{
    // Create a StringBuilder object
	  StringBuilder sb = new StringBuilder();

    	if (words.length == 0) {
    	throw new Exception("EMPTY");
    	}
	    	for (int i = words.length - 1; i >= 0; i--){
	    	  sb.append(words[i]);
	    	}
	    	
	    
    return sb;
  } 



}