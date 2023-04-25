package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



import model.User;

@SuppressWarnings("serial")
@WebServlet(urlPatterns= {"/dang-ki"})
public class RegisterServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Register.jsp");//cach chuyen huong servlet -> jsp 
		dispatcher.forward(req, resp);
	}
	
	
	@SuppressWarnings({"unchecked" })
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		String birthday = req.getParameter("birthday");
		String address = req.getParameter("address");
		String confirmpwd = req.getParameter("confirmpwd");
		
		User user = new User(name, email, birthday, password, confirmpwd, address);
		
		HttpSession session = req.getSession(false);//dat la false de khong tao ra session moi vi moi lan dung program se tao ra 1 session moi
		session.setAttribute("theLastestUser", user);  //save lai thong tin user dang ki dung cuoi cung o server
		
		//luu lai danh sach tao khoan dang ki
		List<User> userList = null;
		if(session.getAttribute("userList") != null) {
			userList = (List<User>) session.getAttribute("userList");
		}
		else {
			userList = new ArrayList<>();
		}
		userList.add(user);
		session.setAttribute("userList", userList);
		//end code luu danh sach
		
		
		
		resp.sendRedirect("/ManageUser/dang-nhap");
	}
}
