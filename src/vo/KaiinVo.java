package vo;

import java.sql.Date;

public class KaiinVo
{
	private int id;
	private String name;
	private Date date;


	public KaiinVo(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		this.date = new Date(new java.util.Date().getTime());
	}



	public KaiinVo(int id, String name, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
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
