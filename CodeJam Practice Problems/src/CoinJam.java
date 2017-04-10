import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;


public class CoinJam {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("C-large-practice.in"));
		System.out.println("case #1");
		//int cases = scan.nextInt();
		PrintWriter file = new PrintWriter(new File("output.txt"));
		file.println("Case #1:");
		int count= scan.nextInt();
		for(int i=0;i<count;i++){
			int n = scan.nextInt();
			int j = scan.nextInt();
			long start = (long)Math.pow(2,n-1)+1;
			//String start="1";
			//for(int z=0;z<n-2;z++){
			//	start+="0";
			//}
			//start+="1";
			while(j>0){
				int index=0;
				long[] divisors = new long[9];
				String base = Long.toBinaryString(start);
				boolean isPrime = false;
				//System.out.println(start);
				for(int i2=2;i2<=10;i2++){
					//System.out.println(i2);
					boolean bool = true;
					BigInteger temp = new BigInteger(base,i2);
					//System.out.println(temp.longValue());
					for(long i3=2;i3<Math.abs(temp.longValue());i3++){
						if(temp.mod(new BigInteger(Long.toString(i3))).intValue()==0){
							divisors[index]=i3;
							index++;
							bool=false;
							break;
						}
						if(i3>100000){
							isPrime=true;
							break;
						}
					}
					if(bool){
						isPrime=true;
						break;
					}
				}
				if(!isPrime){
					file.print(Long.toString(start,2));
					System.out.print(Long.toString(start,2));
					for(long l:divisors){
						file.print(" " + l);
						System.out.print(" "+l);
					}
					if(j!=1){
					file.println();
					System.out.println();
					}
					j--;
				}
				start+=2;
			}
			
		}
		file.close();
		

	}

}
