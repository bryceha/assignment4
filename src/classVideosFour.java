
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class classVideosFour {

	public static void main(String[] args) {

		// StringBuilders for something you want to change!!
		String firstName = "Sally";
		String lastName = "Smith";
		System.out.println(firstName + " " + lastName);
		
		String tripleHi = multiplyString("Hi", 3);
		System.out.println(tripleHi);
		
		// Strings are immutable 
		firstName = firstName.concat(lastName);
		System.out.println(firstName);
		
		StringBuilder fullName = new StringBuilder("Sam");
		fullName.append(" Smith");
		// why does this print the same without .toString()?
		System.out.println(fullName.toString()); 
		
		System.out.println(fullName.charAt(5));
		// System.out.println(fullName.deleteCharAt(5));
		// this one works without it too:
		// System.out.println(fullName.toString());
		// first is inclusive (included), last is exclusive; doesn't delete!
		// System.out.println(fullName.delete(1, 3));
		System.out.println(fullName.indexOf("it"));
		// this is cool
		System.out.println(fullName.replace(4, 9, "Thompson"));
		System.out.println(fullName.reverse());
		
		// Have to set size of an array, and say where you want it from
		String[] cars = new String[3];
		cars[0] = "Camaro";
		cars[1] = "F150";
		cars[2] = "Mustang";
		// Can't just say "what's next;" must keep track of where you are
		// list is like an array, but overcomes limitations
		// list is an interface: can't create object from a list?
		// list of any generic type
		// use diamond operator
		// List<E> list of E where E is the generic that will be replaced with the type
		// List<Sting> reads as "list of String"
		// can't instantiate list
		// must import first (use util)
		List<String> sports = new ArrayList<String>();
		sports.add("Wrestling");
		sports.add("Soccer");
		sports.add("Football");
		sports.remove(1);
		// can't use primitive data types for list!! 
		// but luckily they have autoboxing ie int to Integer!
		// array.length list.size()
		for (int i = 0; i < sports.size(); i++) {
			System.out.println(sports.get(i));
		}
		
		for (String sport : sports) {
			System.out.println(sport);
		}
		
		List<Integer> numbers = new ArrayList<Integer>();
		// isEmpty returns boolean without having to check the size
		// almost always use list or some sort of collection over an array
		// list is an interface
		// ArrayList is a type of list; one (solid) implementation 
		// list is a type of collection, another interface, like dog is an animal
		// other types of collections
		
		// list, set, map
		/* list
		 * duplicates, multiple of the same value in the list
		 * keeps elements ordered by index
		 * allows null values
		 * common implementations are arraylist, LinkedList, and Vector
		 */ 
		List<String> students = new ArrayList<String>();
		students.add("Rob");
		students.add("Rob");
		students.add("Sam");
		students.add(null);
		// order is kept and can be accessed like an array
		System.out.println(students);
		
		
		for (String student : students) {
			System.out.println(student);
		}
		
		System.out.println(students.get(2));
		
		/*
		 * Set
		 * 
		 * No duplicates!
		 * unordered hmmm
		 * allows null, but only one?
		 * common implementations are HashSet LinkedHashSet, TreeSet
		 */
		
		Set<String> states = new HashSet<String>();
		states.add("Alabama");
		states.add("Alabama");
		states.add("Alaska");
		states.add("Arizona");
		states.add("Arkansas");
		states.add(null);
		
		
		System.out.println(states.size());
		System.out.println(states.contains("Arizona"));
		if (states.contains("Alabama")) {
			states.remove("Alabama");
		}
		for (String state : states) {
			System.out.println(state);
		}
		
		/* Map
		 * Map<K, V>
		 * K is key, V is value
		 * Key value pairs (like a dictionary)
		 * uses .put instead of .add
		 * Map is a dictionary in CS**
		 * even more valuable when it's not only based on int order
		 * values can be duplicate, but not keys! think phone numbers and people
		 * HashMap, LinkedHashMap, TreeMap, Hashtable (lowercase t)
		 * 
		 */
		
		Map<Integer, String> racerPlacements = new HashMap<Integer, String>();
		racerPlacements.put(1, "Tommy");
		racerPlacements.put(2, "Sally");
		racerPlacements.put(3, "John");
		
		System.out.println(racerPlacements.get(1));
		
		racerPlacements.remove(1);
		
		Set<Integer> racerKeys = racerPlacements.keySet();
		
		for (Integer key : racerKeys) {
			System.out.println(key + " : " + racerPlacements.get(key));
		}
		
		Collection<String> racers = racerPlacements.values();
		for (String racer : racers) {
			System.out.println(racer);
		}
		
		Map<String, String> dictionary = new HashMap<String, String>();
		dictionary.put("Augment", "Make something greater by adding to it; increase.");
		dictionary.put("Diminish", "Make or become less.");
		dictionary.put("Ostentatious", "Characterized by vulgar or pretentious display");
		
		
		
	}
	// StringBuilder is mutable 
	public static String multiplyString(String str, int num) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < num; i++) {
			result.append(str);
		}
		return result.toString();
	}

}
