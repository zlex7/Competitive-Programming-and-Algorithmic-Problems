import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;


public class Roll {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("roll.dat"));
		int count = scan.nextInt();
		String extra = scan.nextLine();
		for(int i=0;i<count;i++){
			String next = scan.nextLine();
			int size = (int)Math.sqrt(next.length());
			char[][] letters = new char[size][size];
			char[][] decrypted = new char[size][size];
			for(int j=0;j<letters.length;j++){
				for(int k=0;k<letters[j].length;k++){
					letters[j][k]=next.charAt(letters.length*j+k);
				}
			}
			for(int j=0;j<letters.length;j++){
				if(j%2==1){
				for(int k=0;k<letters.length;k++){
					if(k%2==1){
				}
			}
			System.out.println(Arrays.deepToString(letters));
		}
	}

}
