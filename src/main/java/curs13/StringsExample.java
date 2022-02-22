package curs13;

public class StringsExample {

	public static void main(String[] args) {
		transformToString();
		countWords("eu invat chineza");

	}
	
	public static void countWords(String text) {
		String[] words = text.split(" ");
		int nrOfWOrds = words.length;
		System.out.println(nrOfWOrds);
		System.out.println(String.format("Textul meu contine %d cuvinte", nrOfWOrds));
	}

	public static void transformToString() {
		// char
		char ch = 'a';
		String str = Character.toString(ch);
		System.out.println("String: " + str);
		
		String str2 = String.valueOf(ch);
		System.out.println("String: " + str2);
		
		//boolean
		boolean bol = true;
		String str3 = Boolean.toString(bol);
		System.out.println("String: "+str3);
		
		String str4 = String.valueOf(bol);
		System.out.println("String: "+str4);
		
		String str5 = null;
		System.out.println(String.valueOf(str5));
//		System.out.println(str5.toString());
		
		char[] charArray = {'B', 'u', 'n', 'a'};
		String str6 = String.valueOf(charArray);
		System.out.println(str6);
	}
}
