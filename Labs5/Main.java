import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		WordGroup sentance1 = new WordGroup("You can discover more about a person in an hour of play than in a year of conversation" );
		WordGroup sentance2 = new WordGroup("When you play play hard when you work dont play at all");
		
		String[] array1 = sentance1.getWordArray();
		String[] array2 = sentance2.getWordArray();
		
		//prints all the words in 1st sentance
		System.out.println("\nFirst sentance:");
		for (String element : array1) {
			System.out.println(element);
		}
		
		//prints all the words in second sentance
		System.out.println("\nSecond sentance:");
		for (String element : array2) {
			System.out.println(element);
		}
		
		//prints all the words from both sentances with no reapeats
		System.out.println("\nHashSet:");
		Iterator<String> hashIterator= sentance1.getWordSet(sentance2).iterator();
		while(hashIterator.hasNext()) {
			System.out.println(hashIterator.next());
		}
		
		//prints all the words from sentances but with a count next to them
		System.out.println("\nHashSet:");
		HashMap<String, Integer> repeatCounthashMap1 = sentance1.getWordCounts();
		HashMap<String, Integer> repeateCounthashMap2 = sentance2.getWordCounts();
		
		//prints keys in both hashmaps
		for (String key : repeatCounthashMap1.keySet()) {
			System.out.print(key + ": " + repeatCounthashMap1.get(key) + ", ");
		}
		
		System.out.println();
		for (String key : repeateCounthashMap2.keySet()) {
			System.out.print(key + ": " + repeateCounthashMap2.get(key) + ", ");
		}
		
		//cycles through both hashsets printing a count of how many times a word appears
		System.out.println();	
		System.out.println("\nHashSet combined:");	
		HashSet<String> hashSet = sentance1.getWordSet(sentance2);
		//cycles through a set of all combined words
		HashMap<String, Integer> totalCount = new HashMap<String, Integer>();
		for (String key : hashSet) {
			int count = 0;
			//keys can be in one list, the other or both, this checks which one and adds the total
			if (!repeatCounthashMap1.containsKey(key)) {
				count = repeateCounthashMap2.get(key);
			} else if (!repeateCounthashMap2.containsKey(key)){
				count = repeatCounthashMap1.get(key);
			} else {
				count = repeatCounthashMap1.get(key) + repeateCounthashMap2.get(key);
			}
			
			System.out.print(key + ": " + count + ", ");
			totalCount.put(key, count);
		}
	}
}