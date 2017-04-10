import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class prob02 {

	public static void main(String[] args)  throws FileNotFoundException {
		Scanner scan = new Scanner(new File("prob02.txt"));
		long mass = scan.nextLong();
		long velocity = scan.nextLong();
		System.out.print(mass*velocity);
	}

}