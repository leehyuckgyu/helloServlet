package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DoLogin
 */
@WebServlet("/DoLogin")
//�� ���� URL mapping
public class DoLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//read form data
		String username = request.getParameter("username"); //name=""�� ��ġ�ؾ� �Ѵ�.
		String password = request.getParameter("password");
		
		//perform business logic �� ����� �� �� �ִ�.
		
		//����� �� ������ response ��ü�� ���
		PrintWriter out = response.getWriter(); //ctrl + shift + O
		
		//Build HTML code
		
		String htmlResponse= "<html>";
		
		htmlResponse += "<h2> your name is: " + username + "<br/>";
		htmlResponse += " your password is " + password + "<h2>";
		htmlResponse += "</html>";
		
		
		out.println(htmlResponse); //printWriter �� ��ü�� out�� ���� html ������ ���
		
	}

}
