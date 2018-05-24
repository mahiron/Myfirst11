package bean;

import java.sql.Date;

import domain.Sex;

public class SearchBean
{
	private int id;
	private String messege;
	private String name;
	private Date date;
	private Sex sex;

	public Sex getSex() {
		return sex;
	}

	public void setSex(Sex sex) {
		this.sex = sex;
	}

	public void setSex(String sex) {
		if(sex.equals("Man")) {
			this.sex = Sex.Man;
		}else {
			this.sex = Sex.Woman;
		}
	}

	public SearchBean()
	{

	}

	public String getMessege() {
		return messege;
	}

	public void setMessege(String messege) {
		this.messege = messege;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "SearchBean [id=" + id + ", messege=" + messege + ", name=" + name + ", date=" + date + ", sex=" + sex
				+ "]";
	}



}


