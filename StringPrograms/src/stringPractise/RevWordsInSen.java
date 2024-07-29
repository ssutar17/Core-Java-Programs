package stringPractise;

public class RevWordsInSen {

	    public static String revString(String input) {
	
	        String[] words = input.split("\\s+");
	        StringBuilder str = new StringBuilder();

	        for (String word : words) {
	            StringBuilder reversedWord = new StringBuilder(word).reverse();
	            str.append(reversedWord).append(" ");
	        }

	        return str.toString().trim();
	    }

	    public static void main(String[] args) {
	        
	        String input= "Hello World";
	        String result = revString(input);
	        System.out.println( input);
	        System.out.println( result);
	    }

}
