import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;


public class prob05 {

	public static void main(String[] args)  throws FileNotFoundException {
		Scanner scan = new Scanner(new File("prob05.txt"));
		int count = scan.nextInt();
		double time = 100000000;
		String answer = "";
		for(int i =0;i<count;i++){
			String team = scan.next();
			double kilometers = scan.nextDouble();
			double speed = scan.nextDouble();
			if(kilometers/speed<time){
				time=kilometers/speed;
			answer=team;
			}
		}
		System.out.println(answer + " " + time);
	}

}