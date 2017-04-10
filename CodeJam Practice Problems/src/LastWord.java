import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class LastWord {

	public static void main(String[] args) throws FileNotFoundException{
		PrintWriter file = new PrintWriter(new File("output.txt"));
		Scanner scan = new Scanner(new File("A-large-practice.in"));
		int count = scan.nextInt();
		for(int i=0;i<count;i++){
			String word = scan.next();
			ArrayList<Character> arrWord = new ArrayList<Character>(word.length());
			file.print("case #" + (i+1) + ": ");
			System.out.print("case #"+ (i+1) + ": ");
			arrWord.add(word.charAt(0));
			for(int j=1;j<word.length();j++){
				if(word.charAt(j)>=arrWord.get(0)){
					arrWord.add(0,word.charAt(j));
				}
				else{
					arrWord.add(word.charAt(j));
				}
			}
			String finalWord = "";
			for(char c:arrWord){
				finalWord+=c;
			}
			file.println(finalWord);
			System.out.println(finalWord);
		}
		file.close();
	}

}
