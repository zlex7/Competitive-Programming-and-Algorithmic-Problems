import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class RankAndFile {

	public static void main(String[] args) throws FileNotFoundException{
		Scanner scan = new Scanner(new File("B-small-practice.in"));
		int count = scan.nextInt();
		for(int i =0;i<count;i++){
			int length = scan.nextInt();
			int[][] lists = new int[length][length];
			ArrayList<int[]> listsTemp = new ArrayList<int[]>();
			for(int j=0;j<length-1;j++){
				int[] temp = new int[length];
				for(int k=0;k<temp.length;k++){
				temp[k]=scan.nextInt();
				}
				listsTemp.add(temp);
			}
			
			for(int[] arr:listsTemp){
				
			}
			System.out.println(Arrays.toString(lists));
			
		}
	}

}
