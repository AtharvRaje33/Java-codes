// when double quotes are used(string literal), string is saved on string pool
// string pool is saved in heap memory
// it cannot have duplicates


// string object - string s1=new String("value")
// equals method comes from object class

// string buffer is thread unsafe
// slower than string builder

// string builder is thread safe
// faster than string buffer


import java.util.Scanner;

public class StringOperationsDemo {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

// 1. String Creation and Initialization
String str1 = "Hello, ";
String str2 = "Java Strings!";

// 2. String Concatenation
String combinedString = str1 + str2;
System.out.println("Combined String: " + combinedString);

// 3. String Length
int length = combinedString.length();
System.out.println("Length of the String: " + length);

// 4. String Comparison
System.out.print("Enter another string for comparison: ");
String userInput = scanner.nextLine();

// Use equals method for content comparison

if (combinedString.equals(userInput)) {
System.out.println("Strings are equal.");
} else {
System.out.println("Strings are not equal.");
}

// 5. Substring
int startIndex = 7;
int endIndex = 12;
String substring = combinedString.substring(startIndex, endIndex);
System.out.println("Substring from index " + startIndex + " to " + endIndex + ": " + substring);

// 6. String toUpperCase and toLowerCase
String upperCaseString = combinedString.toUpperCase();
String lowerCaseString = combinedString.toLowerCase();
System.out.println("Uppercase: " + upperCaseString);
System.out.println("Lowercase: " + lowerCaseString);

// 7. String Replace
String replacedString = combinedString.replace('e', 'X');
System.out.println("String after replacing 'e' with 'X': " + replacedString);

// 8. String Split
String[] words = combinedString.split(" ");
System.out.println("Words in the String:");
for (String word : words) {
System.out.println(word);
}

// 9. String Trim
String stringWithSpaces = " Leading and Trailing Spaces ";
String trimmedString = stringWithSpaces.trim();
System.out.println("Original String: '" + stringWithSpaces + "'");
System.out.println("Trimmed String: '" + trimmedString + "'");

// 10. String Conversion to charArray
char[] charArray = combinedString.toCharArray();
System.out.println("Characters in the String:");
for (char ch : charArray) {
System.out.print(ch + " ");
}

// Close the scanner to prevent resource leak
scanner.close();
}
}
