package service;

import java.sql.Connection;
import java.sql.SQLException;

import bean.ListoutBean;
import bean.RegistBean;
import bean.SearchBean;
import dao.Dao;
import domain.Sex;
import vo.KaiinVo;

public class KaiinService
{
    public static RegistBean doRegist(int id, String name, Sex sex)
    {
        KaiinVo kaiin = new KaiinVo(id, name, sex);
        try(
                Connection connection = Dao.getConnection();
            )

        {
            dao.KaiinManager kaiinManager = new dao.KaiinManager(connection);
            if(kaiinManager.doRegist(kaiin))
            {
                RegistBean bean = new RegistBean();
                ListoutBean list  = doList();
                bean.setList(list);

                return bean;
            }
            RegistBean bean = new RegistBean();
            bean.setMessege("登録できませんでした");
            return bean;
        }
        catch(SQLException | ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }
    public static SearchBean doSearch(int id)
    {
        try(
                Connection connection = Dao.getConnection();
            )

        {
            dao.KaiinManager kaiinManager = new dao.KaiinManager(connection);
            SearchBean bean = kaiinManager.doSearch(id);
            return bean;
        }
        catch(SQLException | ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }

    }

    public static ListoutBean doList()
    {
        try(
                Connection connection = Dao.getConnection();
            )

        {
            dao.KaiinManager kaiinManager = new dao.KaiinManager(connection);
            ListoutBean bean = kaiinManager.doList();
            return bean;
        }
        catch(SQLException | ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }
}
