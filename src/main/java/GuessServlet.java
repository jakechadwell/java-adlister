import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "GuessServlet", urlPatterns = "/guess")
public class GuessServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        req.getRequestDispatcher("/guessing.jsp").forward(req, res);
    }
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        int random_int = (int)Math.floor(Math.random()*(3-1+1)+1);
        String randomInt = Integer.toString(random_int);
        String user_guess = req.getParameter("number");
        if(req.getMethod().equalsIgnoreCase("post")) {
            if (randomInt.equals(user_guess)) {
                res.sendRedirect("/correct");
            } else {
                res.sendRedirect("/incorrect");
            }
        }
    }
}
