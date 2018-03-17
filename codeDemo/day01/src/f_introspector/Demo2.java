package f_introspector;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;

import org.junit.Test;

/*
 内省(Introspector):
 内省--->不过就是同一个变态的反射。本质还是反射

 内省主要解决的问题：把对象的属性数据封装到对象中。


 */

/*
为什么要学内省？
	开发框架时，进场需要使用Java对象的属性来封装程序的数据，每次都使用反射技术完成此类操作过于麻烦，所以sun公司开发了一套API，专门用于操作Java对象的属性。
	
	内省适用于操作Java对象那个的属性的，

 */
public class Demo2 {

	@Test
	public void  getAllProperty() throws Exception{
		//Introspector 这个类就是内省类
		BeanInfo beanInfo= Introspector.getBeanInfo(Person.class);
		//通过BeanInfo获取所有的属性描述器
		  PropertyDescriptor[] descriptors=beanInfo.getPropertyDescriptors();//获取一个类中的所有属性描述器
		  for(PropertyDescriptor p:descriptors){
			  System.out.println(p.getReadMethod());//get方法
		  }
		
	}
	
	
	
	@Test
	public void testProperty() throws Exception {
		Person p = new Person();
		// 属性描述器
		PropertyDescriptor descriptor = new PropertyDescriptor("id",
				Person.class);
		// 获取属性对应的get或者是set方法设置或者获取属性了。
		Method m = descriptor.getWriteMethod();// 获取属性的set方法
		// 执行该方法设置属性值
		m.invoke(p, 100);

		Method readMethod = descriptor.getReadMethod();// 获取属性的get方法
		
		System.out.println(readMethod.invoke(p, null));
	}

}
