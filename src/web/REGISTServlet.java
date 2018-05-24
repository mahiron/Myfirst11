package web;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.RegistBean;



@WebServlet("/REGISTServlet")
public class REGISTServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public REGISTServlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String idstr = request.getParameter("registId");
		int id = Integer.parseInt(idstr);
		String name = request.getParameter("registName");



		RegistBean regist;
		try {
			regist = service.KaiinService.doRegist(id, name);
			request.setAttribute("bean", regist);
			RequestDispatcher disp = request.getRequestDispatcher("/REGIST.jsp");
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
