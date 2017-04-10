import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class prob04 {

	public static void main(String[] args)  throws FileNotFoundException {
		Scanner scan = new Scanner(new File("prob04.txt"));
		int count = scan.nextInt();
		for(int i =0;i<count;i++){
			double miles = scan.nextDouble();
			double minutes = scan.nextDouble();
			minutes/=60.0;
			miles/=minutes;
			System.out.println(miles);
		}
	}

}