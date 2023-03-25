package stringmethods;

public class StringClass {
	public static void main(String args[]) {
		String stringName = "Ganesh";
		String stringName2 = "Narvekar";
//		String stringName3 = "Ganesh";
		char charAt = stringName.charAt(4);
		System.out.println("Charactor at position of :" + charAt);
		stringName = stringName.concat(" Narvekar");
		System.out.println("String after concat: " + stringName);
//		System.out.println(stringName.compareTo(stringName2));
//		System.out.println(stringName.compareTo(stringName3));
		System.out.println(stringName2.endsWith("t"));
		System.out.println(stringName2.endsWith("r"));
		System.out.println(stringName.equals(stringName));
		String stringName4 = "Java";
		System.out.println("Length of string is: " + stringName.length());
		System.out.println("Length of string is: " + stringName4.length());
		String stringName5 = "Rajendra Narvekar";
		String stringReplace = stringName5.replace("Rajendra", "Rashmi");
		System.out.println("String after replce:" + stringReplace);
		System.out.println(stringName.startsWith("G"));
		String subString=stringName.substring(0,5);
		System.out.println(subString);
		String stringForLowerCase = "JAVA IS CASE SENSETIVE";
		String stringToLower = stringForLowerCase.toLowerCase();
		System.out.println("After Lowercase:" +stringToLower);
		String stringForUppercase = "java is case sensetive";
		String stringToUpper = stringForUppercase.toUpperCase();
		System.out.println("After Uppercase"+stringToUpper);
		String stringTrim = "Java";
		System.out.println(stringTrim.trim()+"script");
		
		
		
	}

}
