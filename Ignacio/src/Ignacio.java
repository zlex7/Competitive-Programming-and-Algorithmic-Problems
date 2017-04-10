import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.Integer;
public class Ignacio {

	public static void main(String[] args) throws FileNotFoundException, ArrayIndexOutOfBoundsException{
		Scanner s = new Scanner(new File("Ignacio.dat"));
		while(s.hasNext()){
			int size=s.nextInt();
			int rowval=s.nextInt();
			int colval=s.nextInt();
			int[][] square= new int[size][size];
			int row=size-1;
			int col=size/2;
			int count=2;
			square[row][col]=1;
			for(int i=0;i<size*size-1;i++){
				if(row+1<size && col+1<size && square[row+1][col+1]==0){
						row++;
						col++;
					}
				else if(row==size-1 && col==size-1){
					row--;
				}
				else if(row==size-1){
					col++;
					row=0;
				}
				else if(col==size-1){
					row++;
					col=0;
				}
				else{
					row--;
				}
				square[row][col]=count;
				count++;
				}
			System.out.println(Arrays.toString(square));
		for(int[] row2: square){
			System.out.println(Arrays.toString(row2));
			}
			System.out.println("-------------");
			System.out.println(square[rowval-1][colval-1]);
			}
	}

}
