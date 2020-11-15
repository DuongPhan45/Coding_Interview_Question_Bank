package implementation;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

public class Migratory_Birds {
//	You have been asked to help study the population of birds migrating across the continent. Each type of bird you are interested in will be identified by an integer value. Each time a particular kind of bird is spotted, its id number will be added to your array of sightings. You would like to be able to find out which type of bird is most common given a list of sightings. Your task is to print the type number of that bird and if two or more types of birds are equally common, choose the type with the smallest ID number.
//	static int migratoryBirds(List<Integer> arr) {
//		Hashtable<Integer, Integer> birds = new Hashtable<Integer, Integer>();
//		// put all birds into a hashtable
//		for (int i : arr) {
//			Integer key = (Integer) i;
//			if (birds.containsKey(key))
//				birds.put(key, birds.get(key) + 1);
//			else {
//				birds.put(key, 1);
//			}
//		}
//		// Find max frequency value
//		Integer max = Collections.max(birds.values());
//		// Get the list of birds who have max frequency
//		ArrayList<Integer> maxbird = new ArrayList<Integer>();
//		for (Map.Entry<Integer, Integer> bird : birds.entrySet()) {
//			if (bird.getValue() == max)
//				maxbird.add(bird.getKey());
//		}
//		// Find the bird with highest frequency and lowest number
//		return Collections.min(maxbird);
//	}

	// Count-sort algorithm
//	static int migratoryBirds(int n, int[] ar) {
//        // Complete this function
//        int ary[] = new int[n];
//        for(int i = 0; i < n ; i++ )
//        ary[ar[i]]++; 
//        int max = 0,maxpos=0;
//        for(int i = 0 ; i < n ; i++)
//            {
//            if(ary[i] > max)
//                {
//                max = ary[i];
//                maxpos = i;
//            }
//        }
//        return maxpos;
//        
//    }
//	
//	static int migratoryBirds(List<Integer> arr) {
//		Map<Integer, Integer> birds = new HashMap<Integer, Integer>();
//		int key = 0;
//
//		for (int i = 0; i < arr.size(); i++) {
//			if (birds.containsKey(arr.get(i))) {
//				birds.put(arr.get(i), birds.get(arr.get(i)) + 1);
//			} else {
//				birds.put(arr.get(i), 1);
//			}
//		}
//for(Entry<Integer, Integer> i : birds.entrySet())System.out.println(i.getKey()+" "+i.getValue());
//		key = Collections.max(birds.entrySet(), Map.Entry.comparingByValue()).getKey();
//		return key;
//	}

	static int migratoryBirds(List<Integer> arr) {
		int[] birds = new int[arr.size()];
		for (int i = 0; i < arr.size(); i++) {
			birds[arr.get(i)]++;
		}
		int max = 0;
		int index = 0;
		for (int i = 0; i < birds.length; i++) {
			if (birds[i] > max) {
				max = birds[i];
				index = i;
			}
		}
		return index;
	}

	public static void main(String[] args) {
		List<Integer> birds = new ArrayList<Integer>();
		Integer[] arr = { 1,1,2,2};
		birds = Arrays.asList(arr);
		System.out.println(migratoryBirds(birds));
//		Map<Integer, Integer> birds = new HashMap<Integer, Integer>();
//		birds.put(1, 2);
//		birds.put(2, 2);
////		birds.put(2, 2);
////		birds.put(3, 1);
////		birds.put(4, 3);
//		for (Entry<Integer, Integer> i : birds.entrySet())
//			System.out.println(i.getKey() + " " + i.getValue());
//		Integer key = Collections.max(birds.entrySet(), Map.Entry.comparingByValue()).getKey();
//		System.out.println(key);

	}

}
