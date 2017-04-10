import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class prob03 {

	public static void main(String[] args)  throws FileNotFoundException {
		Scanner scan = new Scanner(new File("prob03.txt"));
		while(scan.hasNextDouble()){
			double time = scan.nextDouble();
			System.out.println(time*0.299792);
		}
	}

}