import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Bank {

	public static void main(String[] args) throws FileNotFoundException{
		Scanner scan = new Scanner(new File("bank.dat"));
			String[] d = scan.next().split("-");
			double balance = scan.nextDouble();
			String blah=scan.nextLine();
			while(scan.hasNextLine()){
				String date = scan.next();
				String[] tempdate= date.split("-");
				int year =	Integer.parseInt(tempdate[0]);
				int originalyear = Integer.parseInt(d[0]);
				int month = Integer.parseInt(tempdate[1]);
				int originalmonth=Integer.parseInt(d[1]);
				int difference = year-originalyear;
				int months;
				if(difference>0){
					months = (12-originalmonth)+month;
					if(difference>1){
						months+=12*(difference-1);
					}
				}
				else{
					months=month-originalmonth;
				}
				balance = balance*(Math.pow(1.02,months));
				double change = scan.nextDouble();
				balance+=change;
				for(int i =0;i<tempdate.length;i++){
					d[i]=tempdate[i];
				}
				System.out.println(Math.floor(balance*100)/100);
			}

	}

}
