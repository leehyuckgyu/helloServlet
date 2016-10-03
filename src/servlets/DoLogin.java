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
//웹 소켓 URL mapping
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
		String username = request.getParameter("username"); //name=""과 일치해야 한다.
		String password = request.getParameter("password");
		
		//perform business logic 을 기술할 수 도 있다.
		
		//출력을 할 때에는 response 객체를 사용
		PrintWriter out = response.getWriter(); //ctrl + shift + O
		
		//Build HTML code
		
		String htmlResponse= "<html>";
		
		htmlResponse += "<h2> your name is: " + username + "<br/>";
		htmlResponse += " your password is " + password + "<h2>";
		htmlResponse += "</html>";
		
		
		out.println(htmlResponse); //printWriter 의 객체인 out에 위의 html 문서를 출력
		
	}

}
