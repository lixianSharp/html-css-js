package f_introspector;


//实体类---也有人叫他javaBean
public class Person {

	int id;
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	String name;
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public Person(){}

	@Override
	public String toString() {
		return "编号："+this.id+" 姓名："+this.name;
	}
	
	
	
	
}
