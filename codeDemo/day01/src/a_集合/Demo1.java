package a_集合;

import java.util.HashSet;

/**
 * 
 * @author 贤元
 *
 *集合：存储对象数据的容器
 *
 *单列集合：
 *------|Collection单列集合的根接口
 *--------|如果实现了List接口的集合类，具备的特点有序、可重复
 *-----------|ArrayList ArrayList底层是使用了Object数据结构实现的，特点：查询速度快，增删速度慢。
 *-----------|LinkLIst  LinkList的底层是使用了链表数据结构实现的。特点：查询速度快，增删速度慢
 *-----------|Vector  底层是使用了Object数据实现的，实现原理与ArrayList是一致的，但是是线程安全的，操作效率低的
 *--------|Set 如果是实现了Set接口的类，具备特点：无序，不可重复
 *-----------|HashSet 底层是使用了哈希表实现的。特点：存取熟读快
 *HashSet存储元素原理：
 *	往HashSet添加元素的时候，首先会调用元素的HashCode方法得到元素的哈希码值，然后把哈希码值经过运算算出该元素存在的哈希表中的位置。
 *		情况1：如果算出的位置目前还没有存在任何元素没那么该元素课直接添加到哈希表中。
 *		情况2：如果算出的位置目前已经存在其他的元素，那么还会调用元素的equals方法在与这个位置的上的元素比较一次。
 *    如果equals方法返回的是true，那么该元素被视为重复元素，不允许添加。如果equals方法返回的是false，那么该元也可以被添加。
 *-----------|TreeSet 底层是使用了红黑树(二叉树)数据结构实现的。特点：对集合中的元素进行排序存储。
 *TreeSet要注意的事项：
 *	1、往TreeSet添加元素的时候，如果元素具备自然顺序的特点，那么，TreeSet会根据元素的自然顺序特点进行排序存储。
 *	2、往TreeSet添加元素的时候，如果元素不具备自然顺序的特点，那么元素所属的类就必须实现Comparable接口，
 *		把比较的规则定义在CompareTo方法上。
 *	3、往TreeSet添加元素的时候，如果元素不具备自然顺序的特点，那么元素所属的类也就没有实现Comparable接口，
 *		那么在创建TreeSet对象的时候必须要传入比较器的对象。
 *			比较器的定义格式：
 *				Class 类名  implements Comparable{
 *				}
 *
 *双列集合：
 *--------|Map 存储的数据都是以键值对的形式存储在的，键不可以重复，值可以重复。
 *-----------|HashMap 底层也是使用了哈希表实现的
 *-----------|TreeMap 底层也是使用了红黑树数据结构实现的
 *
 */

class Person{
	int id;
	String name;
	public Person(int id,String name){
		super();
		this.id=id;
		this.name=name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	
	
}

public class Demo1 {
public static void main(String[] args) {
   HashSet<Person>set=new HashSet<Person>(); 	
	set.add(new Person(110,"狗娃"));
	set.add(new Person(110,"狗娃"));
	System.out.println("集合的元素："+set);//集合的元素：[Person [id=110, name=狗娃]]
}

}
