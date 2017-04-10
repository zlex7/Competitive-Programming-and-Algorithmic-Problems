package practice;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Practice {

	public static void main(String[] args) throws FileNotFoundException{
		ArrayList<Integer> elite = new ArrayList<Integer>();
		ArrayList<Integer> nums = new ArrayList<Integer>();
		for(int i=1;i<1500;i+=2){
			elite.add(i);
		}
		System.out.print(elite.size());
		int i=1;
		while(true){
			System.out.println(Arrays.toString(elite.toArray()));
			int num=elite.get(i);
			System.out.println(num);
			if(num>=elite.size()){
				break;
			}
			for(int j=num-1;j<elite.size();j+=num){
				if(num==3){
					System.out.println(elite.get(j));
				}
				if(elite.get(j)==1345){
					System.out.println("------------");
					System.out.println(i);
					System.out.println(j);
					System.out.println("------------");
				}
				nums.add(0,elite.get(j));

			}
			for(int num2:nums){
				for(int q =0;q<elite.size();q++){
					if(elite.get(q)==num2){
						elite.remove(q);
					}
				}
			}
			nums.clear();
			//System.out.println(Arrays.toString(elite.toArray()));
			i++;
		}
		Scanner scan = new Scanner(new File("elite.dat"));
		int count=scan.nextInt();
		while(scan.hasNextInt()){
			int num = scan.nextInt();
			System.out.println(num);
			boolean b = false;
			for(int num2: elite){
				if(num2==num){
					b=true;
				}
			}
			if(b){
				System.out.println("ELITE");
			}
			else{
				System.out.println("NOT ELITE");
			}
		}
	}

}
