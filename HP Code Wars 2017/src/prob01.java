import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class prob01 {

	public static void main(String[] args)  throws FileNotFoundException {
		Scanner scan = new Scanner(new File("prob01.txt"));
		System.out.print("Salutations, "+scan.next()+"!" + " We are the Fighting Sandcrabs from Port Lavaca HS!");

	}

}