import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Message {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("message.dat"));
		int count = scan.nextInt();
		for(int i=0;i<count;i++){
			int length = scan.nextInt();
			String blah = scan.nextLine();
			String message = "";
			while(scan.hasNextLine() && !scan.hasNextInt()){
				message+=scan.nextLine();
			}
			Pattern p = Pattern.compile("[\\W][A-Z]{"+length+"}[\\W]");
			Matcher m = p.matcher(message);
			ArrayList<String> words = new ArrayList<String>();
			while(m.find()){
			words.add(m.group());
			}
			for(String word:words){
				System.out.print(word);
			}
			System.out.println();
		}

	}

}
