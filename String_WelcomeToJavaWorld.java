package anudip_assignment;

public class String_WelcomeToJavaWorld {

	public static void main(String[] args) {
		String name="Welcome to Java World.";
		System.out.println("character at 5th position: "+name.charAt(5));
		System.out.println();
		System.out.println("String with (Welcome) lexicographically ignoring case differences: "+name.equalsIgnoreCase("Welcome"));
		System.out.println();
		System.out.println("Concatination: "+name.concat(" Let us learn."));
		System.out.println();
		System.out.println("Position of the first occurrence of character 'a': "+name.indexOf("a"));
		System.out.println();
		System.out.println("Replaces all the occurrences of 'a' character with the new 'e': "+name.replace("a", "e"));
		System.out.println();
		System.out.println("Returns string between 4th position and 10th position: "+name.substring(4,10));
		System.out.println();
		System.out.println("Lowercase of the string: "+name.toLowerCase());
	}

}
