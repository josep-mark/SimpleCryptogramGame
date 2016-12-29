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
	}

}
