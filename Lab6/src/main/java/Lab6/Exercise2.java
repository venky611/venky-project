package Lab6;

import java.util.HashMap;
import java.util.Map;

public class Exercise2 {
	public static void countChar(char[] charArray) {
		 Map<Character, Integer> map = new HashMap<>();
		    for (Character character : charArray) {
		        Integer characterCount = map.get(character);
		        if(characterCount == null) {
		            characterCount = 0;
		        }
		        characterCount++;
		        map.put(character, characterCount);
		    }
		    System.out.println(map);
	}
	public static void main(String[] args) {
		char[] arr= new char[]{'a', 'b', 'c', 'a' , 'f'};
			countChar(arr);
	}
}
