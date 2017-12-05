import java.util.HashMap;
import java.util.HashSet;

public class WordGroup {

	private String words;
	
	//makes words lower case
	public WordGroup(String words) {
		this.words = words.toLowerCase();
	}
	
	//splits sentance into word array
	public String[] getWordArray() {
		String[] array = words.split(" ");
		return array;
	}
	
	//gets hashset of the two word groups
	public HashSet<String> getWordSet(WordGroup wordGroup){
		HashSet<String> hashset = new HashSet<String>();
		this.getWordArray();
		
		//adds all elements to hashset
		for (String element : this.getWordArray()) {
			hashset.add(element);
		}
		for (String element : wordGroup.getWordArray()) {
			hashset.add(element);
		}
		return hashset;	
	}
	
	//gets a hashmap of all the words with a count next to them
	public HashMap<String, Integer> getWordCounts(){
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		
		for (String element : this.getWordArray()) {
			//if hashmap doesn't contain a matching key add it to the hashmap with a count of 1
			if (!hashMap.containsKey(element)){
				hashMap.put(element, 1);
			//else increase the count by 1
			} else {
				hashMap.put(element, hashMap.get(element)+1);
			}			
		}	
		return hashMap;
	}
	
}
