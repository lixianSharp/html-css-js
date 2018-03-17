package e_junit;

import java.io.FileInputStream;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class Demo2 {

	//准备测试的环境
	//@Before     //测试的方法不能被static修饰  在测试方法测试之前调用一次   每一个测试方法测试的时候都会调用一次
	@BeforeClass  //测试的方法必须为静态的   所有的测试方法测试之前和测试之后只调用一次
	public static void beforeRead(){
		System.out.println("准备测试环境成功。。");
	}
	
	//读取文件数据，把文件数据都
	@Test
	public void readFile() throws IOException{
		FileInputStream fileInputStream=new FileInputStream("D://a.txt");
		int content=fileInputStream.read();
		System.out.println("内容为"+content);
	}
	
	@Test
	public  void sort(){
		System.out.println("读取文件数据排序。。。");
	}
	
	

	
	//清理测试环境的方法
	//@After    //测试的方法不能被static修饰   在测试方法之后调用一次   每一个测试方法测试的时候都会调用一次
	@AfterClass	 //测试的方法必须为静态的   所有的测试方法测试之前和测试之后只调用一次 
	public static void afterRead(){
		System.out.println("清理测试环境。。");
		
	}

	
}
