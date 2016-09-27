import java.util.*;

public class p10451 {

	static int num;
	static int[]A;
	static int []AA;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int t = s.nextInt();
		for(int testcase = 0 ; testcase < t; testcase++){
			
		num = s.nextInt();
		 A = new int[num+1];
		 AA = new int[num+1];
		 int count = 0;
		for(int i=1; i<num+1; i++)
			A[i] = s.nextInt();
		
		for(int i=1; i<num+1; i++){
			if(AA[i]!=1){
				count++;
				Recur(i);
			}
		}
		
		System.out.println(count);
		
		}
		
	}
	
	private static void Recur(int num)
	{
		
		if(AA[num]==1)
			return;
		//System.out.println(num);
		AA[num] = 1;
		Recur(A[num]);
		
	}

}
