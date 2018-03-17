package f_introspector;


import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.Converter;

/*
 BeanUtils:

 BeanUtils主要解决的问题：把对象那个的属性封装到对象中

 BeanUtils的好处:
 1、BeanUtils设置属性值得时候，如果属性是基本数据类型，BeanUtils会自动帮我转换数据类型。如果属性不是基本数据类型，则需要注册一个类型转换器。
 2、BeanUtils设置属性值得时候底层也是依赖于get或者Set方法设置以及获取属性值的。
 3、BeanUtils设置属性值，如果设置的属性是其他的引用类型数据，那么这时候必须要注册一个类型转换器。




 BeanUtils使用的步骤:
 1、导包commons-logging.jar 、 commons-beanutils-1.8.0.jar

 */
public class Demo3 {

	public static void main(String[] args) throws Exception {
		// 从文件中读取到的数据都是字符穿的数据，或者是表单提交的数据，获取到的时候也是字符串数据。
		String id = "110";
		String name = "陈琪";
		String salary = "1001";
		String birthday = "2013-12-10";

		// 注册一个类型转换器
		ConvertUtils.register(new Converter() {

			@Override
			public Object convert(Class type, Object value) {// type:目前遇到的数据类型
																// value:目前参数的值
				Date date = null;
				try {
					SimpleDateFormat dateFormat = new SimpleDateFormat(
							"yyyy-MM-dd");
					date = dateFormat.parse((String) value);

				} catch (Exception e) {
					e.printStackTrace();
				}
				return date;
			}
		}, Date.class);

		Emp e = new Emp();
		// BeanUtils.setProperty(bean, name, value);
		BeanUtils.setProperty(e, "id", id);
		BeanUtils.setProperty(e, "name", name);
		BeanUtils.setProperty(e, "salary", salary);

		BeanUtils.setProperty(e, "birthday", birthday);

		System.out.println(e);

	}

}
