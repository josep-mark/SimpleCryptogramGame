//import java.util.ArrayList;

/**
 * Tester for thhe cryptography classes
 * @author Joseph
 *
 */
public class CryptographyTester {
	
	public static void main(String [] args){
		
		
		String quote = "There are no men like me, only me.";
		System.out.println(quote);
		
		ShiftCypher shifted = new ShiftCypher(quote, 8);
		String encryptedMessage = shifted.encrypt();
		
		System.out.println(encryptedMessage);
		
		ReverseCypher reverse = new ReverseCypher(quote);
		String encoded = reverse.getCypher();
		System.out.println(encoded);
		
		String keyWord = "zebra";
		KeyWordCypher key = new KeyWordCypher(quote, keyWord);
//		ArrayList<Character> cypher = key.getCypher();
		String keyEncoded = key.encode();
//		System.out.println(cypher);
		System.out.println(keyEncoded);
		
		RandomCypher rand = new RandomCypher(quote);
//		ArrayList<Character> randCypher = rand.getCypher();
//		System.out.println(randCypher);
		String s = rand.encode();
		System.out.println(s);
		
		Decrypt decode = new Decrypt(encryptedMessage);
		int[] frequency = decode.frequencyAnalysis();
		for (int i = 0; i < 26; i++){
			char c = (char) ('a' + i);
			System.out.println(c + " = " + frequency[i]);
		}
	}

}
