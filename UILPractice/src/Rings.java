import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Rings {
	
	public static void main(String[] args) throws FileNotFoundException{
		Scanner scan = new Scanner(new File("rings.dat"));
		int count = scan.nextInt();
		for(int i=0;i<count;i++){
			String maxString="";
			String minString="";
			int index=-1;
			String next = scan.next();
			char[] ring = next.toCharArray();
			int max = 0;
			int minimum = (int)Math.pow(2, 31);
			for(int j=0;j<ring.length;j++){
				String ringString = "";
				shift(ring);
				for(char c:ring){
					ringString+=c;
				}
				//System.out.println(ringString);
				String temp = ringString.replaceAll("W","1").replaceAll("B","0");
				String temp2 = ringString.replaceAll("W","0").replaceAll("B","1");
				int first = Integer.parseInt(temp,2);
				int second = Integer.parseInt(new StringBuffer(temp).reverse().toString(),2);
				int third = Integer.parseInt(temp2,2);
				int fourth = Integer.parseInt(new StringBuffer(temp2).reverse().toString(),2);
				int[] arr = new int[4];
				arr[0]=first;
				arr[1]=second;
				arr[2]=third;
				arr[3]=fourth;
				for(int k=0;k<arr.length;k++){
					if(arr[k]>max){
						max=arr[k];
						maxString=ringString;
					}
					if(arr[k]<minimum){
						minimum=arr[k];
						minString=ringString;
					}
				}
			}
			//System.out.println(maxString);
			//System.out.println(minString);
			System.out.println(minimum + " " + max);
		}
		
	}
	
	public static void shift(char[] str){
		char temp = str[0];
		for(int i=str.length-1;i>0;i--){
			str[(i+1)%str.length]=str[i];
		}
		if(str.length>1){
		str[1]=temp;
		}
	}

}
