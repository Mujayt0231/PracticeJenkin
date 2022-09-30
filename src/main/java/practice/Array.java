package practice;

import java.util.ArrayList;

public class Array {
	
	
	public static void main(String[] args) {
		
		
		String[] name = {"Jay","Jose","Bob","Bob","Jay"};
		
		ArrayList<String> arrayList = new ArrayList<String>();
		
		String[][] twoDimentional;
		int size = 0;
		
		for (int i = 0; i < name.length; i++) {
			for(int j = i+1; j<name.length; j++) {
				if(name[i].equals(name[j])) {
					size++;
					arrayList.add(name[i]);
				}
			}
			
		}
System.out.println(arrayList);


	}
}
