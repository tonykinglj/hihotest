import java.util.Scanner;

public class rectang {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);  
		int n=sc.nextInt();
		double [] a=new double[4];//a is ½Ç¶È
		int [][] b=new int[4][4];
		int jilu=0;//weishu
		for(int k=0;k<n;k++)	
		{
			for(int i=0;i<4;i++){
				 b[i][0]=sc.nextInt();//x1	
				 b[i][1]=sc.nextInt();//y1
				 b[i][2]=sc.nextInt();//x2
				 b[i][3]=sc.nextInt();//y2
			    if(i>0){a[i]=((b[i][3]-b[i][1])*(b[0][3]-b[0][1])+((b[i][2]-b[i][0])*(b[0][2]-b[0][0])));}
		     }
		}
		double temp;
					
	}
}
