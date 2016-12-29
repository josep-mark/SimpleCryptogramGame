import java.util.ArrayList;

/**
 * Tester for thhe cryptography classes
 * @author Joseph
 *
 */
public class CryptographyTester {
	
	public static void main(String [] args){
		
		
		String quote = "There are no men like me, only me.";
		
		ShiftCypher shifted = new ShiftCypher(quote, 8);
		String encryptedMessage = shifted.encrypt();
		
		System.out.println(encryptedMessage);
		
		ReverseCypher reverse = new ReverseCypher(quote);
		String encoded = reverse.getCypher();
		System.out.println(encoded);
		
		String keyWord = "zebra";
		KeyWordCypher key = new KeyWordCypher(quote, keyWord);
		ArrayList<Character> cypher = key.getCypher();
		String keyEncoded = key.encode();
		System.out.println(cypher);
		System.out.println(keyEncoded);
		
		RandomCypher rand = new RandomCypher(quote);
		ArrayList<Character> randCypher = rand.getCypher();
		System.out.println(randCypher);
	}

}
