
import java.util.*;

public class Main {

	public static void main(String[]args)
	{
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();

	
		Count(1,2,num+1);
	}
	
	static void Count(int i, int count, int num)
	{
		//System.out.println(i);
		String str = Integer.toBinaryString(i);
		if(count == num){
			System.out.println(str);
			return;
		}
		if(!str.matches(".*11.*")){
			//System.out.println(str);
			Count(i+1,count+1,num);
		}else
		{
			Count(i+1,count,num);
		}
	}
}
