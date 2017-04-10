import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;


public class prob10 {

	public static void main(String[] args)  throws FileNotFoundException {
		Scanner scan = new Scanner(new File("prob10.txt"));
		int count = scan.nextInt();
		String blah = scan.nextLine();
		for(int i =0;i<count;i++){
			String palindrome = "NO PALINDROME";
			int answerLength =0;
			String line = scan.nextLine();
			String temp = line;
			//System.out.println(temp);
			for(int k=0;k<temp.length();k++){
				for(int j=k;j<temp.length();j++){
					String normal = temp.substring(k,j+1);
					String sub = normal.replaceAll("\\W","").toLowerCase();
					char[] word = sub.toCharArray();
					String subReverse="";
					for(int l=word.length-1;l>=0;l--){
						subReverse+=word[l];
					}
					if(sub.equals(subReverse)){
						if(sub.length()>1){
						if(sub.length()>answerLength){
							if(!Character.isAlphabetic(normal.charAt(normal.length()-1)) && !Character.isDigit(normal.charAt(normal.length()-1))){
							normal=normal.substring(0,normal.length()-1);
							}
							if(!Character.isAlphabetic(normal.charAt(0)) && !Character.isDigit(normal.charAt(0))){
								normal=normal.substring(1,normal.length());
							}
							palindrome = normal;
							
							answerLength=normal.length();
						}
						}
					}
				}
			}
			System.out.println(palindrome);
			//System.out.println(answerLength);
			//System.out.println(temp);
		}

	}

}
