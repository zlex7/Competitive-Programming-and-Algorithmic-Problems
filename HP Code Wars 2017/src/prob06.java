import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;


public class prob06 {

	public static void main(String[] args)  throws FileNotFoundException {
		Scanner scan = new Scanner(new File("prob06.txt"));
		int count = scan.nextInt();
		for(int i =0;i<count;i++){
			int num = scan.nextInt();
			int[] nums = new int[num];
			for(int j=0;j<num;j++){
				nums[j]=scan.nextInt();
			}
			int[] deltas = new int[nums.length-1];
			for(int k=0;k<nums.length-1;k++){
				deltas[k]=nums[k+1]-nums[k];
			}
			for(int l=1;l<nums.length;l++){
				nums[l]=nums[l-1]-deltas[l-1];
			}
			for(int n:nums){
				System.out.print(n+" ");
			}
			System.out.println();
		}
	}

}