import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Hash {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("hashcodes.dat"));
		int num = scan.nextInt();
	
		for(int i=0;i<num;i++){
			int count=0;
			int[] arr= new int[26];
			for(int j=0;j<arr.length;j++){
				arr[j]=j+1;
			}
			int length = scan.nextInt();
			int hash = scan.nextInt();
			System.out.println(length);
			System.out.println(hash);
			for(int k=1;k<27;k++){
				for(int l=k+1;l<27;l++){
					if(k+l==hash && length==2){
						count++;
						//System.out.println("k: " + Integer.toString(k));
						//System.out.println("l: " + Integer.toString(l));
					}
					for(int m=l+1;m<27;m++){
						if(k+l+m==hash && length==3){
							count++;}
							//System.out.println("k: " + Integer.toString(k));
							//System.out.println("l: " + Integer.toString(l));
							//System.out.println("m: " + Integer.toString(m));						}
		
						for(int n=m+1;n<27;n++){
							if(k+l+m+n==hash && length==4){
								count++;
								//System.out.println("k: " + Integer.toString(k));
								//System.out.println("l: " + Integer.toString(l));
								//System.out.println("m: " + Integer.toString(m));
								//System.out.println("n: " + Integer.toString(n));
							}
							for(int o=n+1;o<27;o++){
								if(k+l+m+n+o==hash && length==5){
									count++;
									//System.out.println("k: " + Integer.toString(k));
									//System.out.println("l: " + Integer.toString(l));
									//System.out.println("m: " + Integer.toString(m));
									//System.out.println("n: " + Integer.toString(n));
									//System.out.println("o: " + Integer.toString(o));
								}
								
							}
						}
					}
				}
			}
			System.out.println(count);
		}

	}

}
