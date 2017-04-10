import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;


public class prob13 {

	public static void main(String[] args)  throws FileNotFoundException {
		Scanner scan = new Scanner(new File("prob13-2-in.txt"));
		String[][] arr = new String[280][280];
		for(int i=0;i<280;i++){
			for(int j=0;j<280;j++){
				arr[i][j]=" ";
			}
		}
		int row=140;
		int col=140;
		int diffcol=1;
		int diffrow = 0;
		String line = scan.nextLine();
		System.out.println(line);
		arr[row][col]=line.substring(0,1);
		//arr[row][col]=
		
		for(int i=1;i<line.length();i++){
			String c = line.substring(i,i+1);
			row+=diffrow;
			col+=diffcol;
			arr[row][col]=c;
			if(c.toLowerCase().equals("r")){
				diffrow=0;
				diffcol=1;
			}
			else if(c.toLowerCase().equals("u")){
				diffrow=-1;
				diffcol=0;
			}
			else if(c.toLowerCase().equals("l")){
				diffrow=0;
				diffcol=-1;
			}
			else if(c.toLowerCase().equals("d")){
				diffrow=1;
				diffcol=0;
			}
		}
		
		int firstrow=250;
		int firstcol=250;
		int lastrow=-1;
		int lastcol=-1;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				if(!arr[i][j].equals(" ")){
					if(i<firstrow){
						firstrow=i;
					}
					if(j<firstcol){
						firstcol=j;
					}
					if(i>lastrow){
						lastrow=i;
					}
					if(j>lastcol){
						lastcol=j;
					}
				}
			}

		}
		System.out.println("firstrow: "+firstrow);
		System.out.println("firstcol: "+firstcol);
		System.out.println("lastrow: "+lastrow);
		System.out.println("lastcol: "+lastcol);
		for(int i=firstrow;i<lastrow+1;i++){
			for(int j=firstcol;j<lastcol+1;j++){
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}

}