import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@WebServlet(name = "PizzaServlet", urlPatterns = "/pizza-order")
public class PizzaServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        req.getRequestDispatcher("/pizza.jsp").forward(req, res);
    }
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String userCrust = req.getParameter("crust-type");
        String userSauce = req.getParameter("sauce-type");
        String userSize = req.getParameter("size-type");
        String[] names = req.getParameterValues("toppings");
        List<String> list = Arrays.asList(names);
        String userAddress = req.getParameter("address");
        System.out.println(userCrust);
        System.out.println(userSauce);
        System.out.println(userSize);
        System.out.println(list);
        System.out.println(userAddress);
    }
}
