import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;


public class BalancedDiet {

	public static void main(String[] args) throws FileNotFoundException{
		final long start = System.currentTimeMillis();
		Scanner scan = new Scanner(new File("39.in"));
		double m = scan.nextInt();
		double k = scan.nextInt();
		double[] candies = new double[(int)m];
		int[] sumi = new int[candies.length];
		double count=0;
		int si=0;
		for(int i=0;i<m;i++){
			double next = scan.nextDouble();
			candies[i]=next;
			count+=next;
		}
		System.out.println(Arrays.toString(candies));
		for(int i=0;i<k;i++){
			int next = scan.nextInt();
			sumi[next-1]+=1;
			si+=1;
		}
		System.out.println("count: " + count);
		double d=2.0;
		int oldsi=si;
		boolean bool=true;;
		while(true){
		int smallestindex=0;
		double smallestvalue=100;
		for(int i=0;i<candies.length;i++){
			double temp1=(candies[i]/count)*si;
			if(candies[i]==12.0){
				System.out.println("temp1: " + temp1);
				System.out.println("sumi: " + sumi[i]);
			}
			double temp = sumi[i]/candies[i]+1.0/candies[i];
			System.out.println("candy: " + candies[i]);
			System.out.println("temp: " + temp);
			if(sumi[i]>=temp1+1 || sumi[i]<=temp1-1){
				bool=false;
				break;
			}
			if(temp<smallestvalue){
				smallestindex=i;
				smallestvalue=temp;
			}
			else if(temp==smallestvalue){
				if(candies[i]>=candies[smallestindex]){
					smallestindex=i;
					smallestvalue=temp;
					}
			}
		}
		if(!bool){
			break;
		}
		sumi[smallestindex]+=1;
		si+=1;
		if(si==count){
			System.out.println("Forever");
			break;
		}
		System.out.println(Arrays.toString(sumi));
		}
		
		
		scan.close();
		System.out.println(si-oldsi-1);
		System.out.println(Arrays.toString(candies));
		System.out.println(Arrays.toString(sumi));
		final long stop = System.currentTimeMillis();
		System.out.println("The runtime was: " + (stop-start) + "ms");
	}
	public static int[] changesi(int[] arr, int si){
		for(int i=0;i<arr.length;i++){
			arr[i]*=si;
		}
		return arr;
	}

}
