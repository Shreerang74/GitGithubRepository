
import java.util.ArrayList;

public class ArrayPrac {

	public static void main(String[] args) {
		//ArrayList<Character> str = new ArrayList<Character>();
	    String 	str ="Hey All^^^ My Name is+ mangesh@@@)):";
		System.out.println(str.length());
		
		
		ArrayList<Character> specialChars = new ArrayList<Character>();
        ArrayList<Character> numbers = new ArrayList<Character>();
        ArrayList<Character> lowerCase = new ArrayList<Character>();
        ArrayList<Character> upperCase = new ArrayList<Character>();
        for(int i=0; i< str.length(); i++) {
            char ch =  str.charAt(i);
            if(Character.isLetter(ch)) {
                if(Character.isUpperCase(ch)) {
                    upperCase.add(ch);
                } else {
                    lowerCase.add(ch);
                }
            } else if(Character.isDigit(ch)) {
                numbers.add(ch);
            } else {
                specialChars.add(ch);
            }
        }
        
        System.out.println("Special Characters: " + specialChars);
        System.out.println("Numbers: " + numbers);
        System.out.println("Lowercase Alphabets: " + lowerCase);
        System.out.println("Uppercase Alphabets: " + upperCase);
    }

	

}
