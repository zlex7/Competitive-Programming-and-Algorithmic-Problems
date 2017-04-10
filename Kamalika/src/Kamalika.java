import java.util.Scanner;
import java.util.Set;
import java.lang.Math;
import java.util.Map;
import java.util.HashMap;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.LinkedHashMap;
public class Kamalika {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner s= new Scanner(new File("Kamalika.dat"));
		while(s.hasNextFloat()){
			Map<String,Float> myMap = new HashMap<String,Float>();
			float A=s.nextFloat();
			float B=s.nextFloat();
			myMap.put("Sum",A+B);
			myMap.put("Dif",A-B);
			myMap.put("Prod",A*B);
			myMap.put("Mod",A%B);
			myMap.put("Div",A/B);
			myMap.put("ApowB",(float)(Math.pow(A,B)));
			myMap.put("BpowA",(float)(Math.pow(B,A)));
			String[] keys=myMap.keySet().toArray(new String[0]);
			float[] values= new float[keys.length];
			
			for(int i=0; i<keys.length; i++){
				values[i]=myMap.get(keys[i]);
			}
			Arrays.sort(values);
			Map<String,Float> myMap2 = new LinkedHashMap<String,Float>();
			float[] sortedvalues= new float[keys.length];
			for(int j=0; j<keys.length; j++){
				for(int k=0; k<keys.length; k++){
		
					if(values[j]==myMap.get(keys[k])){
						myMap2.put(keys[k],values[j]);
					}
				}
				
			}
			System.out.print("|");
			for (Map.Entry<String,Float> me: myMap2.entrySet()){
				System.out.print(me.getKey() + " ");
				System.out.printf("%.2f", me.getValue());
				System.out.print("|");
			}
			
			System.out.println();

		}
		
	}
}
	
