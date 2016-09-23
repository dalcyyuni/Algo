import java.util.*;

public class p1806 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int target = s.nextInt();
		int [] nums = new int[num+1];
		
		for(int i=1; i<num+1; i++)
			nums[i] =s.nextInt();
		
		int begin =0;
		int sum = 0;
		int min_length = Integer.MAX_VALUE;
		for(int i=1; i<=num; i++)
		{
			sum += nums[i];
			
			if(sum >= target)
			{
				while(sum -nums[begin] >=target)
				{
					sum -= nums[begin++];
				}
				
				if(min_length > i-begin+1)
					min_length = i- begin +1;
			}
		}
		
		if(min_length == Integer.MAX_VALUE)
			System.out.println(0);
		else
			System.out.println(min_length);
		
		
		
	}

}
