package MorseCode;

public class AppMorseCode {

	public static void main(String[] args) {
		MorseTranslator translator = new MorseTranslator();
		System.out.println(translator.decode(".--- .- ...- .- / .. ... / -.-. --- --- .-.. / --- -.-"));
	}
}