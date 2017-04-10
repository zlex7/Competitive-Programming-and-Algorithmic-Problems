import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;


public class Emergency {

	public static void main(String[] args) throws FileNotFoundException{
		Scanner scan = new Scanner(new File("emergency.dat"));
		int count = scan.nextInt();
		for(int i=0;i<count;i++){
			int entries = scan.nextInt();
			int time = scan.nextInt();
			int[][] patients2 = new int[entries][4];
			String next;
			for(int j=0;j<entries;j++){
				next=scan.next();
				String[] line = next.split(":");
				int severity=scan.nextInt();
				if(severity<8){
					patients2[j][0]=Integer.parseInt(line[0])*60+Integer.parseInt(line[1])+5;
				}
				else{
					patients2[j][0]=Integer.parseInt(line[0])*60+Integer.parseInt(line[1]);
				}
				patients2[j][1]=severity;
			}
		int doctors = 3;
		int count3=0;
		float count2=100;
		while(count2>5.0){
			int[][] patients = new int[entries][4];
			for(int y=0;y<entries;y++){
				for(int x=0;x<4;x++){
					patients[y][x]=patients2[y][x];
				}
			}
			//System.out.println(Arrays.deepToString(patients));
			int[] d = new int[doctors];
			int minutes = 0;
			while(minutes<60*24){
				int num=0;
				while(num<doctors){
					int kay=-1;
					int severity=-1;
					int t=2500;
				for(int k=0;k<patients.length;k++){
					if(patients[k][0]<=minutes){
						if(patients[k][3]==0){
							if(patients[k][0]<=t){
								if(patients[k][1]>=severity){
									kay=k;
									severity=patients[k][1];
									t=patients[k][0];
									}
								}
							}
						}
				}
				for(int l=0;l<d.length;l++){
					if(d[l]==0 && kay!=-1){
						patients[kay][2]=minutes;
						patients[kay][3]=1;
						d[l]=patients[kay][1]*8;
						//System.out.println(Arrays.toString(d));
						//System.out.println(Arrays.deepToString(patients));
						break;
					}
				}
				num++;
				}
				for(int q=0;q<d.length;q++){
					if(d[q]!=0){
						d[q]-=1;
					}
				}
				minutes++;
				}
				count2=0;
				for(int z=0;z<patients.length;z++){
					count2+=(float)(patients[z][2]-patients[z][0]);
					if(patients[z][1]<8){
						count2+=5.0;
					}
				}
				count2/=(float)patients.length;
				System.out.println("average time: " + Float.toString(count2));
				if(count2<=5.0){
					System.out.println("Answer Found");
					System.out.println("Doctors: " + Integer.toString(doctors));
					break;
				}
				//System.out.println(Arrays.toString(d));
				//System.out.println("-------------");
				System.out.println("count: " + Integer.toString(count3));
				//System.out.println(Arrays.deepToString(patients));
				doctors++;
				count3++;
			}
		}
		}

	}

