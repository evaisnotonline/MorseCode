package MorseCode;

import java.util.HashMap;

public class MorseTranslator {

	HashMap<String, Character> MORSE = new HashMap<>();

	public MorseTranslator() {

		this.MORSE = new HashMap<>();

		MORSE.put(".-", 'a');
		MORSE.put("-...", 'b');
		MORSE.put("-.-.", 'c');
		MORSE.put("-..", 'd');
		MORSE.put(".", 'e');
		MORSE.put("..-.", 'f');
		MORSE.put("--.", 'g');
		MORSE.put("....", 'h');
		MORSE.put("..", 'i');
		MORSE.put(".---", 'j');
		MORSE.put("-.-", 'k');
		MORSE.put(".-..", 'l');
		MORSE.put("--", 'm');
		MORSE.put("-.", 'n');
		MORSE.put("---", 'o');
		MORSE.put(".--.", 'p');
		MORSE.put("--.-", 'q');
		MORSE.put(".-.", 'r');
		MORSE.put("...", 's');
		MORSE.put("-", 't');
		MORSE.put("..-", 'u');
		MORSE.put("...-", 'v');
		MORSE.put(".--", 'w');
		MORSE.put("-..-", 'x');
		MORSE.put("-.--", 'y');
		MORSE.put("--..", 'z');
		MORSE.put("/", ' ');

	}

	public String decode(String input) {

		String[] code = input.split(" ");
		String result = "";

		for (int i = 0; i < code.length; i++) {
			if (MORSE.containsKey(code[i])) {
				result += MORSE.get(code[i]);
			}
		}
		return result;

	}
}
