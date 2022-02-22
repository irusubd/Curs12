package curs13;

public class StringBuilderExample {

	public static void main(String[] args) {

		reverseString("123456789");
		deleteFromString("123456789");
		replaceFromString("Salut Bogdan", "Dragos");
		insertIntoString("123456789", 9, "0");
		addSpaces("camelCaseTestText");
		appendString();
		
	}
	
	public static void reverseString(String text) {
		StringBuilder sb = new StringBuilder(text);
		sb.reverse();
		System.out.println(sb);
	}
	
	public static void deleteFromString(String text) {
		StringBuilder sb = new StringBuilder(text);
		sb.delete(2, 7);
		System.out.println(sb);
	}
	
	public static void replaceFromString(String text, String nume) {
		StringBuilder sb = new StringBuilder(text);
		sb.replace(6, 12, nume);
		System.out.println(sb);
	}
	
	public static void insertIntoString(String text, int index, String insert) {
		StringBuilder sb = new StringBuilder(text);
		sb.insert(index, insert);
		System.out.println(sb);
	}
	
	public static void addSpaces(String camelCase) {
		StringBuilder sb = new StringBuilder(camelCase);
		for(int i =0; i<sb.length(); i++) {
			if(i!=0 && Character.isUpperCase(sb.charAt(i))) {
				sb.insert(i, " ");
				i++;
				
			}
		}
		System.out.println(sb);
	}
	
	public static void appendString() {
		StringBuilder sb = new StringBuilder("Salut ");
		sb.append("Alex!");
		System.out.println(sb);
	}

}
