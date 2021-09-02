import java.io.IOException;
import bean.UserBean;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/InputServlet")
public class InputServlet extends HttpServlet {
          public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

                    String userName = req.getParameter("name");
                    String passWord = req.getParameter("pass");
                    UserBean bean = new UserBean();
                    bean.setName(userName);
                    bean.setpass(passWord);
                    req.setAttribute("user", bean);
                    RequestDispatcher dis = req.getRequestDispatcher("result.jsp");
                    dis.forward(req, res);

          }

}