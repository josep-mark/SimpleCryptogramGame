import java.util.ArrayList;
import java.util.Random;

/**
 * Class to create a random cypher and encode a message using it
 * @author Joseph
 *
 */
public class RandomCypher {
	
	private String message;
	private ArrayList<Character> characters;
	
	public RandomCypher(String s){
		message = s;
		characters = new ArrayList<Character>();
		createCypher();
	}
	
	private void createCypher(){
		Random rand = new Random();
		ArrayList<Character> letters = new ArrayList<Character>();
		int count = 0;
		char c = 'a';
		
		for (int i = 0; i < 26; i++){
			letters.add(c);
			c++;
		}
		
		System.out.println(letters);
		
		while (count < 26){
			int index = rand.nextInt(letters.size());
			characters.add(letters.get(index));
			letters.remove(index);
			count++;
		}
		
	}
	
	public ArrayList<Character> getCypher(){
		return characters;
	}

}
