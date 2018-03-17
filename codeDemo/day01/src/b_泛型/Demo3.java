package b_泛型;
/*
  泛型类：
  
  泛型类的定义格式
  
   	class 类名<声明自定义的泛型>{
   	
   	}

要注意的事项：
	1、在类上自定义的泛型的具体数据类型是在创建对象的时候指定的。
	2、在类上自定义了泛型，如果创建了该类的对象是没有指定泛型的具体类型，那么，默认是Object类型的具体类型
*
*
*/

//注意：创建对象的时候是不能使用泛型来创建对象的


//在类上自定义泛型
//自定义一个集合对象
class MyList<T>{
	
	T[] arr;
	int index=0;
	
	public MyList(){
		
	}
	
	public void add(T o){
		arr[index++]=o;
	}
	
}




public class Demo3 {
public static void main(String[] args) {
	MyList<String> list=new MyList<String>();
	list.add("123");
	
	MyList list2=new MyList();
	
	
}
}



