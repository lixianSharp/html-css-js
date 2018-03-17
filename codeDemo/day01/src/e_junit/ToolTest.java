package e_junit;

import junit.framework.Assert;

import org.junit.Test;

//测试类
public class ToolTest {

	@Test
	public void testGetMax(){
		int max=Tool.getMax();
		if(max!=5){
			throw new RuntimeException();
		}else{
			System.out.println("最大值："+max);
		}
		
		//断言				期望和真实进行 比较
		//Assert.assertSame(5, max);//excepted 期望      actual 真实      assertSame()的底层是用 == 来对比的。
		//Assert.assertSame(new String("abc"), "abc");//红条
		//Assert.assertEquals(new String("abc"), "abc");//绿条  //assertEquals()底层是使用equals方法进行比较的
		//Assert.assertNull("aa");//红条
		Assert.assertTrue(true);//绿条
		
	}
	
	@Test
	public void testGetMin(){
		int min=Tool.getMin();
		if(min!=3){
			throw new RuntimeException();
		}else{
			System.out.println("最小值："+min);
		}
	}
	
	
}
