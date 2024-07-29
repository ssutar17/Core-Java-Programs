package stringPractise;
import java.util.Arrays;

public class AnagramString {
	String s1, s2;
	int r;
	
	int checkAnagram(String s1, String s2){
		
		this.s1=s1;
		this.s2=s2;
		
		if(s1.length()!=s2.length()) {
			r=0;
		}
		else {
			char[] str1= s1.toLowerCase().toCharArray();
			char[] str2=s2.toLowerCase().toCharArray();
			
			Arrays.sort(str1);
			Arrays.sort(str2);
			
			if(Arrays.equals(str1, str2)) {
				r= 1;
			}
			else {
				r=0;
			}
		}
		return r;
	}
	public static void main(String[] args) {
         String s1="act", s2="cat";
         
         AnagramString s =new AnagramString();
         int result=s.checkAnagram(s1, s2);
         
         if(result==1) {
        	 System.out.println("String is Anagram");
         }
         else {
        	 System.out.println("String is not Anagram");

         }
	}

}
