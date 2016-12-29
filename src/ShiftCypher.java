/**
 * Class to create a simple shifted cypher given a parameter
 * @author Joseph
 *
 */


public class ShiftCypher {
	
	private String contents;
	private int shift;
	
	public ShiftCypher(String s, int x){
		contents = s;
		shift = x;
	}
	
	public String encrypt(){
		char[] str = contents.toCharArray();
		String str2 = "";
		
		for (int i = 0; i < str.length; i ++){
			char c = str[i];
			
			if (c > 64 && c < 91){
				int y = (c + shift - (int)'A') % 26 + (int)'A';
				str2 += (char) y;
			}
			else if (c > 96 && c < 123){
				int y = (c + shift - (int)'a') % 26 + (int)'a';
				str2 += (char) y;
			}
			else {
				str2 += c;
			}
			
		}
		
		return str2;
	}
}
