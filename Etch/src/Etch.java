import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Etch {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("etch.dat"));
		int count = scan.nextInt();
		for(int a = 0;a<count;a++){
		int row = scan.nextInt()-1;
		int col = scan.nextInt()-1;
		ArrayList<String> inputs = new ArrayList<String>();
		while(scan.hasNext() && !scan.hasNextInt()){
			String next = scan.next();
			inputs.add(next);
		}
		System.out.println(Arrays.toString(inputs.toArray()));
		int length = 25;
		int height = 15;
		
		String[][] etch= new String[height][length];
		for(int i = 0;i<etch.length;i++){
			for(int j=0;j<etch[i].length;j++){
				etch[i][j]=".";
			}
		}
		etch[row][col]="*";
		for(String input:inputs){
			String direction = input.substring(0,1);
			int distance = Integer.parseInt(input.substring(1,input.length()));
			if(direction.equals("R")){
				if(col+distance>24){
					for(int z=distance;z>=0;z--){
						if(col+z<=24){
							distance=z;
							break;
						}
					}
				}
				for(int w =col;w<col+distance;w++){
					etch[row][w]="*";
				}
				col+=distance;
				
			}
			else if(direction.equals("L")){
				if(col-distance<0){
					for(int z=distance;z>=0;z--){
						if(col-z>=0){
							distance=z;
							break;
						}
					}
				}
				for(int w =col;w>col-distance;w--){
					etch[row][w]="*";
				}
				col-=distance;
			}
			else if(direction.equals("U")){
				if(row-distance<0){
					for(int z=distance;z>=0;z--){
						if(row-z>=0){
							distance=z;
							break;
						}
					}
				}
				for(int w=row;w>row-distance;w--){
					etch[w][col]="*";
				}
				row-=distance;
			}
			else{
				if(row+distance>14){
					for(int z=distance;z>=0;z--){
						if(row+z<=14){
							distance=z;
							break;
						}
					}
				}
				for(int w=row;w<row+distance;w++){
					etch[w][col]="*";
				}
				row+=distance;
			}
		}
		System.out.println(Arrays.toString(inputs.toArray()));
		for(int i =0;i<etch.length;i++){
			for(int j=0;j<etch[i].length;j++){
			System.out.print(etch[i][j]);
			}
			System.out.println();
		}
		}

	}

}
