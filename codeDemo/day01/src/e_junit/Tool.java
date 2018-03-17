package e_junit;

public class Tool {

	public static int getMax(){
		int a=3;
		int b=5;
		int max=a>b?a:b;
		//System.out.println("最大值是："+max);
		return max;
	}
	
	public static int getMin(){
		int a=3;
		int b=5;
		int min=a<b?a:b;
		//System.out.println("最小值为："+min);
		return min;
	}
	
}
