import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class MalFunction {

	public static void main(String[] args) throws FileNotFoundException{
		Scanner scan = new Scanner(new File("malfunction.dat"));
		int count = scan.nextInt();
		for(int i =0;i<count;i++){
			double a =scan.nextDouble();
			double b = scan.nextDouble();
			double c =scan.nextDouble();
			double x =scan.nextDouble();
			double answer=a*x*x+b*x+c;
			System.out.printf("%.3f",answer);
			System.out.println();
		}
	}

}
