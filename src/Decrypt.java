
public class Decrypt {

	private int[] frequency;
	private String message;
	
	public Decrypt(String s){
		message = s;
		message = message.toLowerCase();
		frequency = new int[26];
	}
	
	public int[] frequencyAnalysis(){
		for(int i = 0; i < message.length(); i++){
			char c = message.charAt(i);
			int letterVal = c - 'a';
			if(letterVal >= 0 && letterVal < 26){
				frequency[letterVal] = frequency[letterVal] + 1;
			}
		}
		
		return frequency;
	}
}
