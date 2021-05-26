import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Count", urlPatterns = "/count")
public class CountServlet extends HttpServlet {
    int count = 0;
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        String reset = req.getParameter("reset");
        if(reset!=null){
            count = 0;
        }else {
            count++;
        }
        res.getWriter().println("Page visited: " + count + " time/s.");
    }
}

