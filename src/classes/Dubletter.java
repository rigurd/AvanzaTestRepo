package classes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Dubletter {

	public static Collection<Integer> multiples(List<Integer> numbers){
		
		ArrayList<Integer> storedDuplicates = new ArrayList<Integer>();
		Set<Integer> repeatCheck = new LinkedHashSet<>();
		Set<Integer> hashSetToClearDuplicates = new LinkedHashSet<>();
		Collections.sort(numbers);
		
		for (int i : numbers){
			if(!repeatCheck.add(i)){
				storedDuplicates.add(i);
			}
		}
		hashSetToClearDuplicates.addAll(storedDuplicates);
		storedDuplicates.clear();
		storedDuplicates.addAll(hashSetToClearDuplicates);
		
		return storedDuplicates;
	}
	
	public static Collection<Integer> multiples1(List<Integer> numbers){
		
		
		
		return numbers;
	}
	
}
