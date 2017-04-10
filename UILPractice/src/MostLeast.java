import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;


public class MostLeast {

	public static void main(String[] args) throws FileNotFoundException{
		Scanner scan = new Scanner(new File("mostleast.dat"));
		int count = scan.nextInt();
		String blah = scan.nextLine();
		for(int i =0;i<count;i++){
			HashMap<String,Integer> numWords = new HashMap<String,Integer>();
			String next =scan.nextLine();
			next=next.replaceAll("[\\t?.,]","");
			String[] words = next.split(" ");
			for(String word:words){
				if(numWords.containsKey(word)){
					numWords.put(word, numWords.get(word)+1);
				}
				else{
					numWords.put(word, 1);
				}
			}
			int maxCount=-1;
			int minCount=words.length+1;
			for(String key:numWords.keySet()){
				if(numWords.get(key)>maxCount){
					maxCount=numWords.get(key);
				}
				if(numWords.get(key)<minCount){
					minCount=numWords.get(key);
				}
			}
			ArrayList<String> mostCommon = new ArrayList<String>();
			ArrayList<String> leastCommon = new ArrayList<String>();
			for(String key:numWords.keySet()){
				if(numWords.get(key)==maxCount){
					mostCommon.add(key);
				}
				if(numWords.get(key)==minCount){
					leastCommon.add(key);
				}
			}
			Collections.sort(mostCommon);
			Collections.sort(leastCommon);
			System.out.print(maxCount);
			for(String word:mostCommon){
				System.out.print(" " + word);
			}
			System.out.println();
			System.out.print(minCount);
			for(String word:leastCommon){
				System.out.print(" " + word);
			}
			System.out.println();
		}

	}

}
