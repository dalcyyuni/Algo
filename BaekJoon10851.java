import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class p10851 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Scanner s = new Scanner(System.in);
		InputStream in = System.in;
		InputStreamReader isr = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(isr);
		
		Hashtable ht = new Hashtable<Integer,Integer>();
		
		int s_num =0;
		try {
			s_num = br.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int [] sang  = new int[s_num];
		for(int i=0; i<sang.length; i++){
			try {
				sang[i] = br.read();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			ht.put(sang[i], 1);
			
		}
		int t_num =0;
		try {
			t_num = br.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int [] test = new int[t_num];
		String str ="";
		for(int i=0; i<t_num ; i++){
			test[i] = br.read();
		
			if(ht.get(test[i])==null){
				str+="0 ";
			}
			else{
				str+="1 ";
			}
			
		}
		//System.out.println(str);
		System.out.println(str.trim());
		
		
		
	
		
	}

}
