package week4Lab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Application {
	public static String shortestWord(List<String> list) {
		String first = list.get(0);
		for(int i  = 1; i < list.size(); i ++) {
			if(list.get(i).length() - first.length() < 0) { //if the next element in the list minus the current first item
													//is less than zeo, that means its smaller and will become 
													//the new first item until another element proves to be 
													//smaller
				first = list.get(i);
			}
		}
		return first;
	}
	public static List<String> firstLastSwap(List<String> list){
		Collections.swap(list, 0, list.size() -1);
		return list;
	}
	public static String listToString (List<String> list) {
		StringBuilder combined = new StringBuilder();
		for(int i = 0; i < list.size(); i++) {
			if(i != list.size() - 1) {
				combined.append(list.get(i) +", ");
			}else {
				combined.append(list.get(i));	
			}
		}
		return combined.toString();
	}
	public static List<String> searchFor(List<String> list, String str){
		List<String> newList = new ArrayList<String>();
		for(int i = 0; i < list.size(); i++) {
			if(str.contains(list.get(i))){
				newList.add(list.get(i));
			}
		}
		return newList;
	}
	public static List<List<Integer>> organizeNumbers(List<Integer> list){
		List<List<Integer>> masterList = new ArrayList<>();
		List<Integer> innerList1 = new ArrayList<>();
		List<Integer> innerList2 = new ArrayList<>();
		List<Integer> innerList3 = new ArrayList<>();
		List<Integer> innerList4 = new ArrayList<>();
		for(int number : list) {
			if(number % 2 == 0) { //if the number is divisible by 2
				innerList1.add(number);
			}if(number % 3 == 0) { //if it's divisible by 3
				innerList2.add(number);
			}if(number % 5 ==0) {  //if it's divisible by 5
 				innerList3.add(number);
			}if(number % 2 != 0 && number % 3 != 0 && number % 5 != 0) {
				innerList4.add(number);
			}
		}
		masterList.add(innerList1);
		masterList.add(innerList2);
		masterList.add(innerList3);
		masterList.add(innerList4);
		return masterList;
		}
	public static List<Integer> wordLength(List<String> list){
		List<Integer> newList = new ArrayList<Integer>();
		for(String word : list) {
			newList.add(word.length());
		}
		return newList;
	}
	public static Set<String> letterSearch(Set<String> set, char letter){
		Set<String> newSet = new HashSet<String>();
		for(String word : set) {
			if(word.charAt(0) == letter){
				newSet.add(word);
			}
		}
		return newSet;
	}
	public static List<String> setToList(Set<String> set){
		List<String> newList = new ArrayList<String>();
		for(String word : set) {
			newList.add(word);
		}
		return newList;
	}
	public static Set<Integer> onlyEvenNumbers(Set<Integer> set){
		Set<Integer> newSet = new HashSet<Integer>();
		for(int number : set) {
			if(number % 2 == 0) {
				newSet.add(number);
			}
		}
		return newSet;
	}
	public static String defineWord(Map<String, String> map, String key) {
		StringBuilder definition = new StringBuilder();
		if(map.containsKey(key)) {
			definition.append(map.get(key));
		}else {
			definition.append("Error: that word is not in this dictionary");
		}
		return definition.toString();
	}
	public static Map<Character, Integer> letterCount(List<String> list){
		Map<Character, Integer> newMap = new HashMap<Character, Integer>();
		for(String word : list) {
			char x = word.charAt(0);
			if(newMap.get(x) == null) {
				newMap.put(x, 1);
			}else{
				newMap.put(x, newMap.get(x) + 1);
			}
		}
		return newMap;
	}
	
	
	
	
	public static void main(String[] args) {
		//why would we use a StringBuilder instead of a String?
			/*
			 * Once a string is defined, it cannot be changed or added to, whereas a 
			 * StringBuilder is more flexible. You can concatinate to a String, but it creates a
			 * new object
			 */
		//instantiate a new StringBuilder and append the characters 0 through 9 to be separated by 
		//dashes. make sure no dash appears at the end of the StringBuilder
		StringBuilder numbers = new StringBuilder();
		for(int i = 1; i <= 9; i++) {
			if(i == 9) {
				numbers.append(9);
			}else {
				numbers.append(i + "-");
			}
		}
		System.out.println(numbers.toString());//finalize the string
		//create a list of Strings and add 5 Strings to it, each with a different length
		List<String> differentLengths = new ArrayList<String>();
		differentLengths.add("seven");
		differentLengths.add("loan");
		differentLengths.add("bee");
		differentLengths.add("carfax");
		differentLengths.add("supercalifragilisticexpialidocious");
		//write and test a method that takes a list of strings and returns the shortest string
		System.out.println(shortestWord(differentLengths));
		//write and test a method that takes a list of strings and returns the list with the first and last 
		//element switched
		System.out.println("List before swap: " + differentLengths);
		System.out.println("List after swap: " + firstLastSwap(differentLengths));
		//write and test a method that takes a list of strings and returns a string with all the elements 
		//concatenated to each other, separated by a comma
		System.out.println(listToString(differentLengths));
		//write and test a method that takes a list of strings and a string and returns a new list with all 
		//strings from the original list containing the second string parameter (i.e. like search method)
		List<String> animals = new ArrayList<String>();
		animals.add("dog");
		animals.add("cat");
		animals.add("snake");
		animals.add("horse");
		animals.add("rat");
		animals.add("whale");
		animals.add("bird");
		animals.add("fish");
		animals.add("lizard");
		System.out.println(searchFor(animals, "horse"));
		/*write and test a method that takes a list of integers and returns a List<List<Integer>> where the first
		 *list in the returned value contains any number from the input list that is divisible by 2, the second
		 *list contains values from the input list that are divisible by 3, and the third divisible by 5, and the 
		 *fourth all numbers from the the input not divisible by 2,3, or 5
		 */
		List<Integer> twentyNumbers = new ArrayList<Integer>();
		for(int i = 1; i <= 20; i ++) {
			twentyNumbers.add(i);
		}//making my list of numbers to test method on
		System.out.println(organizeNumbers(twentyNumbers));//tada! 
		/*
		 * write and test a method that takes a list of strings and returns a list of integers that contains
		 * the length of each string 
		 */
		System.out.println(wordLength(animals));
		//create a set of strings and add 5 values
		Set<String> cars = new HashSet<String>();
		cars.add("celica");
		cars.add("rav-4");
		cars.add("miata");
		cars.add("camry");
		cars.add("corvette");
		/*
		 * write and test a method that takes a set of strings and a character and returns a set of Strings
		 * consisting of all the strings in the input set that start with the character parameter
		 */
		System.out.println(letterSearch(cars, 'c'));
		/*
		 * write and test a method that takes a set of strings and returns a list of the same strings
		 */
		System.out.println(setToList(cars));
		/*
		 * write and test a method that takes a set of Integers and returns a new set of integers 
		 * containing only even numbers from the original set
		 */
		Set<Integer> twentyNumbers2 = new HashSet<Integer>();//to test onlyEvenNumbers method
		for(int i = 1; i <= 20; i++) {
			twentyNumbers2.add(i);
		}
		System.out.println(onlyEvenNumbers(twentyNumbers2));
		/*
		 * create a map of strings and strings and add 3 items to it where the key of each is a word 
		 * and the value is the definition of the word 
		 */
		Map<String, String> dictionary = new HashMap<String, String>();
		dictionary.put("embox","verb : to enclose in or as if in a box");
		dictionary.put("callipygian", "adjective : having shapely buttocks");
		dictionary.put("nidification", "noun : the act, process, or technique of building a nest");
		/*
		 * write and test a method that takes a Map<String, String> and a string and returns
		 * the value for a key in the map that matches the string parameter 
		 * (i.e. like a language dictionary lookup
		 */
		System.out.println("Definition of 'embox' : " + defineWord(dictionary, "embox"));
		System.out.println("Definition of 'computer' : " + defineWord(dictionary, "computer"));
		/*
		 * write and test a method that takes a List<String> and returns a Map<Character, Integer>
		 * containing a count of all the strings that start with a given character
		 */
		System.out.println(letterCount(differentLengths));
	}

}
