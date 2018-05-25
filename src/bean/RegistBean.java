package bean;

public class RegistBean
{
    private String messege = "登録しました";
    ListoutBean list = new ListoutBean();

    public ListoutBean getList()
    {
        return list;
    }

    public void setList(ListoutBean list)
    {
        this.list = list;
    }

    public String getMessege()
    {
        return messege;
    }

    public void setMessege(String messege)
    {
        this.messege = messege;
    }
}
