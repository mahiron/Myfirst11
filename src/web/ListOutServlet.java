package web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.ListoutBean;



@WebServlet("/ListOutServlet")
public class ListOutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ListOutServlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		ListoutBean list;
		list = service.KaiinService.doList();
		request.setAttribute("bean", list);
		RequestDispatcher disp = request.getRequestDispatcher("/listout.jsp");
		disp.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		doGet(request, response);
	}

}
