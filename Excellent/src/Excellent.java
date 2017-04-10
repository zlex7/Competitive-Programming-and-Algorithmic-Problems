import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class Excellent {

	public static void main(String[] args) throws FileNotFoundException{
		Scanner scan = new Scanner(new File("excellent.dat"));
		int spreadsheet = scan.nextInt();
		int spreadsheet2 = scan.nextInt();
		String blah = scan.nextLine();
		ArrayList<String[]> lines= new ArrayList<String[]>();
		for(int i =0;i<spreadsheet;i++){
			lines.add(scan.nextLine().split(" "));
		}
		ArrayList<String[]> lines2= new ArrayList<String[]>();
		for(int j=0;j<spreadsheet2;j++){
			lines2.add(scan.nextLine().split(" "));
		}
		boolean bool = false;
		ArrayList<String[]> answer= new ArrayList<String[]>();
		System.out.println("NAMES IN SPREADSHEET 1 THAT ARE NOT IN SPREADSHEET 2");
		for(String[] s:lines){
			String[] str = new String[2];
			bool=false;
			for(String[] s2:lines2){
				if(s2[0].equals(s[0]) && s2[1].equals(s[1])){
					bool=true;
				}
			}
			if(!bool){
				str[0]=s[0].substring(0,s[0].length()-1);
				str[1]=s[1];
				answer.add(str);
			}
		}
		ArrayList<String[]> answer2= new ArrayList<String[]>();
		int index=-1;
		int si=answer.size();
		String[] a= new String[2];
		for(int z =0;z<si;z++){
			String value="zzzzzz";
			for(int k=0;k<answer.size();k++){
				if(answer.get(k)[0].compareTo(value)<0){
					value=answer.get(k)[0];
					index = k;
					a=answer.get(k);
				}
	
			}
			answer2.add(a);
			answer.remove(index);
		}
		for(String[] s: answer2){
			System.out.println(s[0]+", "+s[1]);
		}
		ArrayList<String[]> answer3= new ArrayList<String[]>();
		System.out.println("NAMES IN SPREADSHEET 2 THAT ARE NOT IN SPREADSHEET 1");
		for(String[] s:lines2){
			bool=false;
			String[] temp = new String[2];
			for(String[] s2:lines){
				if(s2[0].equals(s[0]) && s2[1].equals(s[1])){
					bool=true;
				}
			}
			if(!bool){
				temp[0]=s[0].substring(0,s[0].length()-1);
				temp[1]=s[1];
				answer3.add(temp);
			}
		}
		int index2=-1;
		int si2=answer3.size();
		String[] a2= new String[2];
		ArrayList<String[]> answer4= new ArrayList<String[]>();
		for(int z =0;z<si2;z++){
			String value="zzzzzz";
			for(int k=0;k<answer3.size();k++){
				if(answer3.get(k)[0].compareTo(value)<0){
					value=answer3.get(k)[0];
					index2 = k;
					a2=answer3.get(k);
				}
	
			}
			answer4.add(a2);
			answer3.remove(index2);
		}
		for(String[] s: answer4){
			System.out.println(s[0]+", "+s[1]);
		}

	}

}
