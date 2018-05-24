package bean;


import java.sql.Date;

public class KaiinBean
{
	private int id;
	private String name;
	private Date date;

	public KaiinBean()
	{

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
		return "KaiinVo [id=" + id + ", name=" + name + ", date=" + date + "]";
	}

}

