package classes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Dubletter {

	public static Collection<Integer> multiples(List<Integer> numbers){
		
		ArrayList<Integer> storedDuplicates = new ArrayList<Integer>();
		Set<Integer> repeatCheck = new HashSet<>();
		Set<Integer> hashSetToClearDuplicates = new HashSet<>();
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
	
}
