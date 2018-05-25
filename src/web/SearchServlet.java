package web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.ErrorBean;
import bean.SearchBean;



@WebServlet("/SearchServlet")
public class SearchServlet extends HttpServlet
{
    private static final long serialVersionUID = 1L;

    public SearchServlet()
    {
        super();
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        try
        {
            String idstr = request.getParameter("searchId");
            int id = Integer.parseInt(idstr);
            SearchBean bean;
            bean = service.KaiinService.doSearch(id);
            if (bean.getName() != null)
            {
                request.setAttribute("bean", bean);
                RequestDispatcher disp = request.getRequestDispatcher("/search.jsp");
                disp.forward(request, response);
            }
            else
            {
                ErrorBean erbean = new ErrorBean();
                erbean.setMessege("そのIDは存在しません");
                request.setAttribute("bean", erbean);
                RequestDispatcher disp = request.getRequestDispatcher("/error.jsp");
                disp.forward(request, response);
            }
        }
        catch (NumberFormatException e)
        {
            ErrorBean erbean = new ErrorBean();
            erbean.setMessege("正しく入力してください");
            request.setAttribute("bean", erbean);
            RequestDispatcher disp = request.getRequestDispatcher("/error.jsp");
            disp.forward(request, response);
        }

    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        doGet(request, response);
    }

}
