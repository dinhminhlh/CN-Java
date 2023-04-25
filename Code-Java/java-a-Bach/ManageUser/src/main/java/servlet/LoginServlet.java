package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.User;

@SuppressWarnings("serial")
@WebServlet(urlPatterns = {"/dang-nhap"})
public class LoginServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.setAttribute("msg", "");
		
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Login.jsp");//cach chuyen huong servlet -> jsp 
		dispatcher.forward(req, resp);
	}
	@SuppressWarnings("unused")
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		User theLastestUser = (User) req.getSession(false).getAttribute("theLastestUser");  //dat la false de khong tao ra session moi vi moi lan dung program se tao ra 1 session moi
		
		if(email.equalsIgnoreCase(theLastestUser.getEmail()) && password.equals(theLastestUser.getPassword())) {
			//login thanh cong
			resp.sendRedirect("/ManageUser/welcome");
		}
		else {
			req.setAttribute("msg", "Thong tin tai khoan khong chinh xac !!!");
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Login.jsp");
			dispatcher.forward(req, resp);
		}
	}
}
