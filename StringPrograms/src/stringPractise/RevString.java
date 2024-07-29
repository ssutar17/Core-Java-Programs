package stringPractise;
import java.util.Scanner;

public class RevString {
	
	
	public static void main(String[] args) {
	 String s, s1="";
      Scanner sc=new Scanner(System.in);
      s=sc.nextLine();
      sc.close();
      
      char ch;
      
      for(int i=0; i<s.length(); i++) {
    	  ch=s.charAt(i);
    	  s1=ch+s1;
      }
      
      System.out.println(s1);
	}
}
