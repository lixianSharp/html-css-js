package f_introspector;

import java.sql.Date;

public class Emp {
	
	private int id;
	private String name;
	private double salary;
	private Date birthday;
	
	
	
	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	
	
	public Emp(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public Emp(){}

	@Override
	public String toString() {
		return "编号："+this.id+" 姓名："+this.name+" 薪水："+this.salary+" 出生日期："+this.birthday;
	}
	

}
