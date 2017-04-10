import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.String;
public class Emiliano {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner s= new Scanner(new File("Emiliano.dat"));
		int numsets=s.nextInt();
		for(int i=0;i<numsets;i++){
			int count=0;
			int multicount=0;
			int numdwords=s.nextInt();
			String[] dwords = new String[numdwords];
			for(int j=0;j<numdwords;j++){
				dwords[j]=s.next().toLowerCase();
			}
			int numtwords= s.nextInt();
			String[] twords = new String[numtwords];
			for(int k=0;k<numtwords;k++) {
				twords[k]=s.next().toLowerCase();
			}
			for(int l=0;l<twords.length;l++){
				for(int m=0;m<dwords.length-1;m++){
					for(int n=m+1;n<dwords.length;n++){
						
					if((dwords[m]+dwords[n]).equals(twords[l]) || (dwords[n]+dwords[m]).equals(twords[l])) {
						if((dwords[m]+dwords[n]).equals(twords[l]) && (dwords[n]+dwords[m]).equals(twords[l])) {
							multicount++;
						}
						System.out.println(dwords[m]);
						System.out.println(dwords[n]);
						System.out.println(twords[l]);
						count++;
					}
					}
						
				}
			}
			System.out.println(Arrays.toString(dwords));
			System.out.println(Arrays.toString(twords));
			System.out.println("count: " + count);
			System.out.println("multicount: " + multicount);
		}

	}

}
