import java.util.*;

public class BatchInter {
	/*����*/
	static double Func1(double x){
		double y=0.5*x+2.0;
		return(y);
	}
	/*���κ���*/
	static double Func2(double x,double r){
		double y=0.01*x*x+8.0;
		if(r*x>y)y=y*0.6;
		return(y);
	}
	
   public static void main(String args[]){
	   double r=0.75;
	   double init=0.2;//��ʼֵ
	   for(int i=0;i<30;i++){
		   init=Func1(init)/r;
		   System.out.println("��"+i+"�ε���ֵΪ "+init);
	   }
	   System.out.println("**********************************");
	   double batch=0.002;
	   for(int i=0;i<30;i++){
		   double proc=Func2(batch,r);
		  batch=proc/r;
		   System.out.println("��"+i+"�ε���ֵΪ "+batch);
	   }
   }
	
}
