package bean;

import java.sql.Date;

public class SearchBean
{
	private int id;
	private String messege;
	private String name;
	private Date date;

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
		return "KaiinVo [id=" + id + ", name=" + name + ", date=" + date + "]";
	}

}


