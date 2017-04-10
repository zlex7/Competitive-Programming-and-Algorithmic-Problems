import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Integral {

	public static void main(String[] args) throws FileNotFoundException {
			Scanner scan = new Scanner(new File("integral.dat"));
		int n = scan.nextInt();
		for(int i = 0; i < n; i++){
			double xi = scan.nextDouble();
			double xf = scan.nextDouble();
			double dx = scan.nextDouble();
			double sum = 0;
			for(double x = xi; x < xf; x += dx){
				sum = sum + (3*x*x + 2*x + 1)*dx;
			}
			System.out.printf("%.6f", sum);
			System.out.println();
		}
	}

}
