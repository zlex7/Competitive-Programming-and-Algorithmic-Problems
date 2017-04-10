import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Bash {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("input.txt"));
		while(scan.hasNextLine()){
			String next = scan.nextLine();
			String next2 = scan.nextLine();
			//System.out.println(next);
			if(next2.contains("flag")){
				System.out.println(next);
			}
		}

	}

}
