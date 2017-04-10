import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;


public class Almost {

	public static void main(String[] args) throws FileNotFoundException {
			Scanner scan = new Scanner(new File("almost.dat"));
			int count = scan.nextInt();
			for(int i =0;i<count;i++){
				String[][] board = new String[3][3];
				if(i==0){
					String blah=scan.nextLine();
				}
				for(int j=0;j<3;j++){
					String line = scan.nextLine();
					String[] l = new String[3];
					l[0]=line.substring(0,1);
					l[1]=line.substring(1,2);
					l[2]=line.substring(2,3);
					board[j]=l;
				}
				boolean bool = false;
				for(int r=0;r<board.length;r++){
					for(int c = 0;c<board[r].length;c++){
						if(board[r][c].equals(" ")){
							board[r][c]="X";
							for(int x=0;x<3;x++){
								if(board[0][x].equals("X")&&board[1][x].equals("X")&& board[2][x].equals("X")){
									System.out.print(r+1);
									System.out.print(" ");
									System.out.println(c+1);
									bool=true;
									break;
								}
								else if(board[x][0].equals("X")&&board[x][1].equals("X")&& board[x][2].equals("X")){
									System.out.print(r+1);
									System.out.print(" ");
									System.out.println(c+1);
									bool=true;
									break;
								}
								else if(board[0][0].equals("X") && board[1][1].equals("X") && board[2][2].equals("X")){
									System.out.print(r+1);
									System.out.print(" ");
									System.out.println(c+1);
									bool=true;
									break;
								}
								else if(board[0][2].equals("X") && board[1][1].equals("X") && board[2][0].equals("X")){
									System.out.print(r+1);
									System.out.print(" ");
									System.out.println(c+1);
									bool=true;
									break;
								}
							}
							board[r][c]=" ";
							}
						if(bool){
							break;
						}
					}
					if(bool){
						break;
					}
				}
			}
	}

}
