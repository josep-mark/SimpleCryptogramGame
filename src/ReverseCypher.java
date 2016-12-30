
public class ReverseCypher {

	private String message;
	
	public ReverseCypher(String s){
		message = s;
	}
	
	public String getCypher(){
		char[] cypher = new char[26];
		char c = 'z';
		String encoded = "";
		
		for (int i = 0; i < 26; i++){
			cypher[i] = c;
			c --;
		}
		
//		System.out.println(cypher);
		
		for(int i = 0; i < message.length(); i++){
			char x = message.charAt(i);
//			System.out.println(x);
			
			if(x > 64 && x < 91){
				x += 32;
			}
			
			if(x > 96 && x < 123){
				int index = x - 'a';
				char replacement = cypher[index];
//				System.out.println(replacement);
				encoded += replacement;
			}
			else{
				encoded += x;
			}
		}
		return encoded;		
	}
}
