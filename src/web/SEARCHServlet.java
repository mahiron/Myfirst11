package web;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.SearchBean;



@WebServlet("/SEARCHServlet")
public class SEARCHServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public SEARCHServlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idstr = request.getParameter("searchId");
		int id = Integer.parseInt(idstr);
		SearchBean bean;
		try {
			bean = service.KaiinService.doSearch(id);
			request.setAttribute("bean", bean);
			RequestDispatcher disp = request.getRequestDispatcher("/SEARCH.jsp");
			disp.forward(request, response);
		} catch (ClassNotFoundException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
