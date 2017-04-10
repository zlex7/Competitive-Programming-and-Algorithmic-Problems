import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;


public class Family {

	public static void main(String[] args) throws FileNotFoundException{
		Scanner scan = new Scanner(new File("family.dat"));
		int num = scan.nextInt();
		String li="";
		for(int i=0;i<num;i++){
			char[][] picture = new char[12][18];
			for(int j=17;j>=0;j--){
				li = scan.next();
				char[] line = li.toCharArray();
					for(int k=0;k<picture.length;k++){
						picture[k][j]=line[k];
					}
			}
				for(int m=0;m<picture.length;m++){
					for(int l=0;l<=17;l++){
					System.out.print(picture[m][l]);
					}
					if(m!=picture.length-1){
					System.out.println();
					}
				}
				if(!(i==num-1)){
					System.out.println("\n");
				}
			}
		}
	}	
