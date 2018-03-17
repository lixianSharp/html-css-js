package a_集合;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Demo2 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
      //使用get方法遍历
		list.add("张三");
		list.add("李四");
		list.add("王五");
		
		System.out.println("get方式遍历=====");
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i)+",");
		}
		
		//使用迭代器
		System.out.println("用迭代器的方式遍历");
		HashSet<String> set=new HashSet<String>();
		set.add("狗娃");
		set.add("狗剩");
		set.add("狗屎");
		
		//获取迭代器 注意： 迭代器在迭代的过程中，不能使用集合对象修改集合中的元素个数。如果要使用，要使用迭代器的方式修改
		Iterator<String> it=set.iterator();
		while(it.hasNext()){
			System.out.println(it.next()+",");
		}
		
		//用增强for循环
		System.out.println("用增强for的方式来遍历");
		for(String item:set){
			System.out.println(item+",");
		}
		
		
		System.out.println("\r\n===迭代器方式遍历=====");
		HashMap<String,String> map=new HashMap<String,String>();
		map.put("张三", "001");
		map.put("李四", "002");
		map.put("王五", "003");
		
		System.out.println("\r\n==entrySet遍历方式====");
		/**
		 * entrySet原理：
		 * 里面有一个entry类，entry类里面有两个属性，一个是key，一个是value，
		 * 也就是说，map中的一条数据，就是一个entry对象
		 */
		map.entrySet();
		Set<Entry<String,String>>entrys=map.entrySet();
		for(Entry<String,String> entry:entrys){
			System.out.println("键："+entry.getKey()+"值："+entry.getValue());
		
		}

	}

}
