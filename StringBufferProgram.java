package anudip_assignment;
/*
 * Write a program which creates a StringBuffer “This is StringBuffer” and performs the following.
1. Adds the string”- This is a sample program” to existing string and display it.
2. Inserts the string “Object” into the existing string at 21st postion and display it.
3. Reverses the entire string and displays it.
4. Replaces the word “Buffer” with “Builder” and display it.
 */
public class StringBufferProgram {
	 public static void main(String[] args)
	 {
	
		 StringBuffer stringBuffer = new StringBuffer("This is StringBuffer");

	        // 1. Adds the string.
	        stringBuffer.append("- This is a sample program");
	        System.out.println("After appending: " + stringBuffer);

	        // 2. Inserts the string "Object" into the existing string at 21st position and display it.
	        stringBuffer.insert(21, "Object");
	        System.out.println("After inserting 'Object': " + stringBuffer);

	        // 3. Reverses the entire string and displays it.
	        stringBuffer.reverse();
	        System.out.println("After reversing: " + stringBuffer);

	        // 4. Replaces the word "Buffer" with "Builder" and display it.
	        int indexOfBuffer = stringBuffer.indexOf("Buffer");

	        stringBuffer.replace(indexOfBuffer, indexOfBuffer + "Buffer".length(), "Builder");

	        System.out.println("After replacing 'Buffer' with 'Builder': " + stringBuffer);
	        
	 }
}
