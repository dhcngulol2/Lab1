package BaiTH;

public class MyCaesar {
	public static final char[] ALPHABET = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O',
			'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
	private int n; // shift steps (right shift)

	public MyCaesar(int shiftSteps) {
		this.n = shiftSteps;
	}

	
	public char encryptChar(char c) {
		if (Character.isLetter(c)) {
			char upperC = Character.toUpperCase(c);
			int index = ((upperC - 'A') + n) % 26; // A-Z value assigned form 65->90
			if (index < 0) {
				index += 26; 
			}
			return Character.isLowerCase(c) ? Character.toLowerCase(ALPHABET[index]) : ALPHABET[index];
		}
		return c; 
	}

	
	public String encrypt(String input) {
		StringBuilder result = new StringBuilder();
		for (char c : input.toCharArray()) {	// convert String to Array char 
			result.append(encryptChar(c));
		}
		return result.toString();
	}

	
	public char decryptChar(char c) {
		if (Character.isLetter(c)) {
			char upperC = Character.toUpperCase(c);
			int index = ((upperC - 'A') - n) % 26;
			if (index < 0) {
				index += 26; 
			}
			return Character.isLowerCase(c) ? Character.toLowerCase(ALPHABET[index]) : ALPHABET[index];
		}
		return c;
	}

	
	public String decrypt(String input) {
		StringBuilder result = new StringBuilder();
		for (char c : input.toCharArray()) {
			result.append(decryptChar(c));
		}
		return result.toString();
	}



	public static void main(String[] args) {

		MyCaesar caesar = new MyCaesar(3);

		String inputWord = "hung";
		

		String encryptedWord = caesar.encrypt(inputWord);
		String deCryptWord = caesar.decrypt(inputWord);
		
		System.out.println("input"+inputWord);
		System.out.println( "enCrypt"+ encryptedWord);
		System.out.println( "deCrypt"+deCryptWord);
		
	}
}