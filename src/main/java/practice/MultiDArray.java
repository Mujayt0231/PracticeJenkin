package practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MultiDArray {

	public static void main(String[] args) {
		
		
		
		
		String[] names = {"John", "John", "David", "Mujayit", "David"};
		
		//We can convert out names[] to a List and put it in a HashSet
		//Since we can't store duplicate values in Set, it will contain the distinct values 
		Set<String> uniqueNames = new HashSet<String>(Arrays.asList(names));
		
		
		//in order to store them into a 2D array, we need to create a 2D array and provide the size
		String[][] name2DArray = new String[uniqueNames.size()][];
		
		
		//here we are creating the int index so that later on we can increment it everytime when loop iterate through our uniqueNames set
		//by doing this we can store the array we will be creating later on in the 2D array by providing the 
		int index= 0;
		
		//here we are looping through our uniqueNames set and creating and an array to store the uniqueNames value one by one
		for(String uniName: uniqueNames) {
			String[] arr = {uniName};
			
		//here we are storing the String[] that we got to our 2D array starting from 0 index
			name2DArray[index] = arr;
			
		//here we are increasing the index 
			index++;
			
		//in another loop index will become 1, and 'arr' will be stored in 'name2DArray[1]';
		}
		
		
		//we need to use Arrays.deepToString method to print out multidimensional array
		System.out.println(Arrays.deepToString(name2DArray));
		
		
		
//we can use HashMap <key,value> way to find out how many times the value is presented
Map<String, Integer> counter = new HashMap<String,Integer>();
		
		for(String name: names) {
			if(counter.get(name)==null) {
				counter.put(name, 1);
			}
			else {
				counter.put(name, counter.get(name) + 1);
			}
		}
		
		System.out.println(counter);
		
	}

	
}
