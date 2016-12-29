import java.util.ArrayList;

/**
 * This class creates a cypher using a key word
 * @author Joseph
 *
 */
public class KeyWordCypher {
	private String message;
	private String key;
	ArrayList<Character> cypher;
	
	public KeyWordCypher(String mess, String k){
		message = mess;
		key = k;
		cypher = new ArrayList<Character>();
		createCypher();
	}
	
	public void createCypher(){
		int index = 0;
		char[] keyChar = key.toCharArray();
		
		for (char c : keyChar){
			cypher.add(c);
			index++;
		}
		
		char nextChar = 'a';
			
		while(index < 26){
			boolean contains = false;
			if (cypher.contains(nextChar)){
				contains = true;
			}
			
			while(contains == true){
				nextChar++;
				if (cypher.contains(nextChar)){
					contains = true;
				}
				else{
					contains = false;
				}
			}
			
			cypher.add(nextChar);
			nextChar++;
			index++;
			
		}
	}
	
	public ArrayList<Character> getCypher(){
		return cypher;
	}
	
	public String encode(){
		String str = "";
		message = message.toLowerCase();
			
		for (int i = 0; i < message.length(); i++){
			char c = message.charAt(i);
			if(c > 96 && c < 123){
				int x = c - 'a';
				char y = cypher.get(x);
				str += y;
			}
			else{
				str += c;
			}
			
		}
		return str;
	}

}
