import java.io.*;
import java.util.ArrayList;

public class query{
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());//n���ܸ���
		int num;//num���ʸ���
		int word;
		String k=null;//k�����뵥�ʸ���
		String tmp=null;
		while((k=br.readLine())!=null){
			num=Integer.parseInt(k);
			ArrayList words=new ArrayList();
			for(int i=0;i<num;i++){
				words.add(br.read());
				System.out.println(words);
			}
			br.read();
	}
		br.close();
	}
}