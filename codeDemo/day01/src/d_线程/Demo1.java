package d_线程;
/*
 线程：
 
 多线程的好处：多线程解决了在一个进程中可以同时执行多个任务代码的问题。
 
 
 自定义线程的创建方式：
 	 
 	 方式一：继承Thread
 	  1、自定义一个类继承Thread类
 	  2、重写THread的run方法，把自定义线程的任务自定义在run方法上
 	  3、创建Thread子类的对象，并且start方法启动一个线程。
 	  
 	  
 	 方式二：实现Runable接口
 	  1、自定义一个类实现Runable接口
 	  2、实现Runable接口中的run方法,把自定义线程的任务自定义在run方法上。
 	  3、创建Runable实现类的对象
 	  4、创建Thread对象，并且把Runable实现类的对象作为参数传递
 	  5、调用Thread对象的start方法开启线程。
 	  

 
 线程安全问题出现的根本原因：
   1、必须要存在两个或者两个以上的线程共享着一个资源。
   2、操作共享资源的代码必须有两句或者两句以上。
 
 
 
  线程安全问题的解决方案：
  
 	  1、同步代码块
 	    
 	     synchronize(锁){
 	       	需要同步的代码
 	     }
 	    
 	  	
 	  2、同步函数
 		
 		修饰符 synchronize 返回值类型  函数名(形参列表..){
 		
 		}
 
 
 要注意的事项：
 		1、同步代码块的锁可以使任意的对象.同步函数的锁是固定的，非静态函数的锁对象是this对象，静态函数的锁对象是class对象。
 		2、同步锁对象必须是多线程共享的对象，否则锁不住。
 		3、在同步代码块或者是同步函数中调用sleep是不会释放锁对象的，如果是调用wait方法，是会释放锁对象的。
 		
 		
 
 
 
 



*/

class MyThread extends Thread{
	
	public MyThread(String name){
		super(name);
	}
	
	@Override
	public void run() {
		for(int i=0;i<100;i++){
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
	
}






public class Demo1  extends {
public static void main(String[] args) {
	int j=0;
	System.out.println("i="+j++);
	/*以上两句Java虚拟机至少要分三步执行*/
	
	MyThread t1=new MyThread("狗娃");
	t1.start();//开启线程。线程一旦开启就会指定run方法中的代码
	
	
	
	for(int i=0;i<100;i++){
		System.out.println(Thread.currentThread().getName()+":"+i);
	}
	
}
	
	
}
