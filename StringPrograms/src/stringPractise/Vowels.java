package stringPractise;

public class Vowels {
	String s;
	int count;

	int countVowels(String s) {
		this.s = s;

		char[] str = s.toCharArray();

		for (int i = 0; i < s.length(); i++) {
			if (str[i] == 'a' || str[i] == 'e' || str[i] == 'i' || str[i] == 'o' || str[i] == 'u' || str[i] == 'A'
					|| str[i] == 'E' || str[i] == 'I' || str[i] == 'O' || str[i] == 'U') {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Vowels v = new Vowels();
		int result = v.countVowels("Hello India");
		System.out.println("No of vowels:" + result);
	}

}
