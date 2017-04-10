import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class prob07 {

	public static void main(String[] args)  throws FileNotFoundException {
		Scanner scan = new Scanner(new File("prob07.txt"));
		int count = scan.nextInt();
		for(int i =0;i<count;i++){
			double first = scan.nextDouble();
			double a = scan.nextInt();
			double b = scan.nextInt();
			double c = scan.nextInt();
			double m = scan.nextInt();
			double n = scan.nextInt();
			double e = scan.nextDouble();
			
			int iteration =0 ;
			
			//System.out.println(a + " " + "  " +  b + c + m + n +e);
			
			while (Math.abs((c + ((a * first + m)/ (b*first+n))) - first) > e && iteration < 100){
				
				
				first = c + (a * first + m)/ (b*first+n);
				iteration++;
					
			}
			
			if (iteration > 99){
				System.out.println("DIVERGES");
				
			}
			
		    System.out.println( c + (a * first + m)/ (b*first+n) );
			
			

		}

	}

}